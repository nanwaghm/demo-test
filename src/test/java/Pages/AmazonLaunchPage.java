package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLaunchPage {

	
	WebDriver driver;
	public AmazonLaunchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By catgmobile = By.xpath("//a[contains(text(),'Mobiles')]");	
	
	public void LaunchAmazon() {
		driver.get("https://www.amazon.in/");
		
	}
	
	
	public void clickMobileCategory() {
		driver.findElement(catgmobile).click();
		System.out.println("Navigated to mobile cataegory succesfully");
	}
}
