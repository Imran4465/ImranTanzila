package com.usa.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.supper.base.SupperClass;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
		
		@Given("^User able to open the any browser$")
		public void user_able_to_open_the_any_browser()  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
		new ChromeDriver();
		
		    
		}
		
		@Given("^User able to enter the url$")
		public void user_able_to_enter_the_url()  {
		   
		    
		}
		
		@When("^User able to click on the Sign in button$")
		public void user_able_to_click_on_the_Sign_in_button()  {
		   
		    
		}
		
		@When("^user able to enter the user name$")
		public void user_able_to_enter_the_user_name()  {
		   
		    
		}
		
		@When("^user able to enter the password$")
		public void user_able_to_enter_the_password()  {
		    
		    
		}
		
		@When("^User able to click on the login button$")
		public void user_able_to_click_on_the_login_button()  {
		   
		    
		}
		
		@Then("^User able to verify the user information on the screen$")
		public void user_able_to_verify_the_user_information_on_the_screen()  {
		   
		    
		}
		
			
}
