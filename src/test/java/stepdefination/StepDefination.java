package stepdefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.api.junit.*;
@RunWith(Cucumber.class)
public class StepDefination {

	
	@Given("^User is in landing Page$")
	public void landing_page() {
	
		 
		System.out.println("User in Landing Page");
	    
	}
	
	
	@When("User enters  Username as {string} and Password as {string} and click on Submit")
	public void wrong_username_password_submit(String username,String password) {
	
		System.out.println("Username"+username);
		System.out.println("Password"+password);
	}
	
	@Then("^User won't be able to login$")
	public void user_no_login() {
		
		System.out.println("User not able to login");
		
	}
	
	@And("^Error message to be displayed$")
	public void error_message() {
		
		System.out.println("Error message displayed");
		
	}
	@Then("^User logged in as Non Admin user$")
	public void nonadmin_user() {
		System.out.println("Welcome Non Admin User");
	}
	
	
	
}
