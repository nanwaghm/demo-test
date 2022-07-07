package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.PFAmazonLaunch;
import PageFactory.PFMobileSearch;
import Pages.AmazonLaunchPage;
import Pages.MobileSearchPage;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandini.waghmare\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		PFAmazonLaunch PFam = new PFAmazonLaunch(driver);
		PFMobileSearch PFMb = new PFMobileSearch(driver);
		
		PFam.LaunchAmazon();
		PFam.clickMobileCategory();
		PFMb.SelectBrand();
		PFMb.SelectPrice();
		PFMb.SortProduct();
		PFMb.VerifyProductName();
		PFMb.VerifyProductPrice();
		//driver.close();
		//driver.quit();
	}

}
