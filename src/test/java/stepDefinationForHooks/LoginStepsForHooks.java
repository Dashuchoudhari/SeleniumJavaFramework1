package stepDefinationForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import paagesForPOM.LoginPage;

public class LoginStepsForHooks {
	WebDriver driver=null;
	
	@Before
	public void browserSetup() {
		System.out.println("i am inside browser setup");
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSS\\eclipse-workspace\\NewCucumberProject\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
	
	}
	@After
	public void teardown() {
		driver.quit();
	}
	
		
	@Given(" User is on login page")
		public void user_on_Login_Page() {
		System.out.println("gagag");
	}
		                              
	

}
