package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFAmazonLaunch {
	
	WebDriver driver;
	public PFAmazonLaunch(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#nav-xshop > a:nth-child(3)") 
	WebElement catgmob;

	 public void PFAmazonLaunchInitilize(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	         
	    }
	 
	public void LaunchAmazon() {
		driver.get("https://www.amazon.in/");
		
	}
	
	
	public void clickMobileCategory() {
		catgmob.click();
		System.out.println("Navigated to mobile cataegory succesfully");
	}
}
