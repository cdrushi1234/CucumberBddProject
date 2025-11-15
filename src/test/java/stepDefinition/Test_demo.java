package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_demo {

	
	private WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver  = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
	
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("user navigate to dashboard after successful login")
	public void user_navigate_to_dashboard_after_successful_login() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Then("end the test")
	public void end_the_test() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	}


}
