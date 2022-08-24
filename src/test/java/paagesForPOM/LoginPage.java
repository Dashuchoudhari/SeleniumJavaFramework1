package paagesForPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver=null;
	
	@FindBy(xpath="//input[@name='txtUsername']")
	private WebElement username1;
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement password1;
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement loginBtn;
	
	//private By txt_username=By.id("txtUsername");
	//private By txt_password=By.id("txtPassword");
	//private By txt_btn=By.id("btnLogin");
	//private By txt_MPbtn=By.id("MP_link");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String Username) {
		
		username1.sendKeys(Username);
		
	}
	public void enterPassword(String Password) {
		password1.sendKeys(Password);
		
	}
	public void clickOnLogineButton() {
		loginBtn.click();
		
	}
	

}
