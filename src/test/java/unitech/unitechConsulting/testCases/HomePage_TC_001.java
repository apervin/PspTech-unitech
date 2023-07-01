package unitech.unitechConsulting.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import unitech.unitechConsulting.baseClass.BaseClass;
import unitech.unitechConsulting.browserFactory.BrowserFactory;
import unitech.unitechConsulting.pages.HomePage;
import unitech.unitechConsulting.utilities.CommonMethods;


public class HomePage_TC_001 extends BaseClass {

	public HomePage_TC_001() {
		super(driver);

	}
	
	HomePage homepage;
	
	@BeforeTest
	public void setUp() {
		driver=BrowserFactory.initiateBrowser();
		logger.info("browser is getting initialized before test");
		homepage = PageFactory.initElements(driver, HomePage.class);
		CommonMethods.maximizeBrowser();	
	}
	/*
	 if you want to use Excel shell to pass data, us like this
//	 @Test(dataProvider = "ContactUsData", dataProviderClass = ExcelUtility.class){}
	 */

	@Test
	public void TC_001_ClickHeaderHomeButton() throws InterruptedException {
	System.out.println("Header Home Button Clicked ");	
	logger.info("Test Case_001 Clicking Home Button has started");
	
	CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	CommonMethods.click(homepage.ClickHome, driver);

	}

//	
//	@AfterTest
//	public void tearDown() {
//	logger.info("Testing for HomePage_TS_001 Completed");
//	
//}



}
