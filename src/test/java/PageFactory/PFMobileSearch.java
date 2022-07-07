package PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PFMobileSearch {

	WebDriver driver;
	
	@FindBy(css="span.a-dropdown-prompt") 
	WebElement sortopt;
	
	@FindBy(css="#s-result-sort-select_2") 
	WebElement sort;
	
	@FindBy(css="#s-refinements > div:nth-child(5) > ul > li:nth-child(2) > span > a > span") 
	WebElement brand;
	
	@FindBy(css="input#low-price") 
	WebElement minprice;
	
	@FindBy(css="input#high-price") 
	WebElement maxprice;
	
	@FindBy(css="input.a-button-input") 
	WebElement btngo;
	
	@FindBy(css="div.s-title-instructions-style span") 
	public List<WebElement>  mySelector;
	
	@FindBy(css="span.a-price-whole") 
	public List<WebElement>  price;
	
	public void PFMobileSearchInitialize(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void SelectBrand() {
		(brand).click();
		System.out.println("Selected brand");
		
	}
	
	public void SelectPrice() {
		 (minprice).sendKeys("20000");
		System.out.println("Entered Min Value");
		 (maxprice).sendKeys("60000");
		System.out.println("Entered Max Value");
		 (btngo).click();
		System.out.println("Clicked Go");
		
	}
	
	public void SortProduct() {
		 (sortopt).click();
		System.out.println("Selected Sort option");
		 (sort).click();
		System.out.println("Sorting the product Price: High to low");		
	}
	
	
	public void VerifyProductName() {		
		for(int i=0; i<=3; i++) {
		  System.out.println(mySelector.get(i).getText());
		  Assert.assertTrue(mySelector.get(i).getText().contains("OnePlus"),"First search result for selected mobile brand is not as expected");
		}
		
	}
	
	public void VerifyProductPrice() {
		for(int i=0; i<=3; i++) {
		  System.out.println(price.get(i).getText().replace(",", ""));
		  Assert.assertEquals(price.get(i).getText().replace(",", ""), (price.get(i).getText().replace(",", "")));
		  
		}	
		
	}
	public PFMobileSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
