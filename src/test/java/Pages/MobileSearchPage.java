package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import TestCases.TestCase1;

public class MobileSearchPage  {
	
	WebDriver driver;
	public MobileSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By sortopt = By.xpath("//span[contains(text(),'Featured')]");
	By sort = By.xpath("//a[contains(text(),'Price: High to Low')]");
	By brand = By.xpath("//i[@class='a-icon a-icon-checkbox']/following::span[contains(text(),'OnePlus')]");
	By minprice = By.xpath("//input[@id='low-price']");
	By maxprice = By.xpath("//input[@id='high-price']");
	By btngo = By.xpath("(//input[@type='submit'])[2]");
	By mySelector = By.cssSelector("div.s-title-instructions-style span");
	By price = By.cssSelector("span.a-price-whole");
	
	
	
	public void SelectBrand() {
		driver.findElement(brand).click();
		System.out.println("Selected brand");
		
	}
	
	public void SelectPrice() {
		driver.findElement(minprice).sendKeys("20000");
		System.out.println("Entered Min Value");
		driver.findElement(maxprice).sendKeys("60000");
		System.out.println("Entered Max Value");
		driver.findElement(btngo).click();
		System.out.println("Clicked Go");
		
	}
	
	public void SortProduct() {
		driver.findElement(sortopt).click();
		System.out.println("Selected Sort option");
		driver.findElement(sort).click();
		System.out.println("Sorting the product Price: High to low");		
	}
	
	
	public void VerifyProductName() {
		List<WebElement> myElements = driver.findElements(mySelector);
		for(int i=0; i<=3; i++) {
		  System.out.println(myElements.get(i).getText());
		  Assert.assertTrue(myElements.get(i).getText().contains("OnePlus"),"First search result for selected mobile brand is not as expected");
		}
		
	}
	
	public void VerifyProductPrice() {
		List<WebElement> mobprice = driver.findElements(price);
		for(int i=0; i<=3; i++) {
		  Assert.assertEquals(mobprice.get(i).getText().replace(",", ""), (mobprice.get(i).getText().replace(",", "")));
		  
		}	
	}
	
	//MobileSearchPage mb = new MobileSearchPage(driver);
	//AmazonLaunchPage amLaunch = new AmazonLaunchPage(driver);
	
	

}
