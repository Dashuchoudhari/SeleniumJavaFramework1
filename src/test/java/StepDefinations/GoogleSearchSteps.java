package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver=null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("inside step: Browser is open");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSS\\eclipse-workspace\\NewCucumberProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("User is on the google search page")
	public void user_is_on_the_google_search_page() {
		System.out.println("inside step: User is on the google search page");
		
		driver.navigate().to("https://google.com");
	}
	

	@When("User enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("inside step:User enters a text in search box");
		
		driver.findElement(By.name("q")).sendKeys("I love My India");
	}

	@And("hits Enter")
	public void hits_enter() {
		System.out.println("inside step: hits Enter");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("User is nevigated to search result")
	public void user_is_nevigated_to_search_result() {
		System.out.println("inside step: User is nevigated to search result");
		
		driver.getPageSource().contains("Overview");
		
		//driver.close();
	//	driver.quit();
		
	}

}
