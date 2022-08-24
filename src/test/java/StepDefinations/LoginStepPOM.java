package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import paagesForPOM.LoginPage;

public class LoginStepPOM {

	WebDriver driver=null;
	
	
	@Given("user is on logine Page")
	public void is_on_logine_page() {
		System.out.println("User is on logine page");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSS\\eclipse-workspace\\NewCucumberProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
	}

	@When("^user is enters (.*)and(.*)$")      //(.*) means anything in feature file
	public void user_is_enters_username_and_passward(String Username,String Password) {
		System.out.println("User Enters the valid cradintial");
		
		LoginPage login=new LoginPage(driver);

		
		login.enterUsername(Username);
		login.enterPassword(Password);

	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("User click on logine page");
		LoginPage login=new LoginPage(driver);

		login.clickOnLogineButton();
	}

	@Then("User is navigated on Home Page")
	public void user_is_navigated_on_home_page() throws InterruptedException {
		System.out.println("User is navigate to homepage");
		
		driver.navigate().back();
		Thread.sleep(4000);

		driver.close();
	}


}
