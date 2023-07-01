package unitech.unitechConsulting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import unitech.unitechConsulting.baseClass.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		super(driver);		
	}
	

@FindBy (xpath = "(//a[@href='https://psptech.net'])[1]")
public WebElement ClickHome;
	
@FindBy (xpath= "(//a[@href='https://psptech.net/software-development/'])[6]")
public WebElement ClickDiscoverMore1;
	
	
@FindBy (how = How.XPATH, using = "(//a[@href='https://psptech.net/software-development/'])[8]")
public WebElement DiscoverMore2Click;	
	
	
	

}
