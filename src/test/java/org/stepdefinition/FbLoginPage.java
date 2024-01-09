package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.FacebookOne;

import bas.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLoginPage extends BaseClass {
	
	FacebookOne f;
	

@Given("To launch the chrome browser and maximise window")
public void to_launch_the_chrome_browser_and_maximise_window() {
	launchBrowser();
	windowMaximize();
}

@When("To launch the url of the facebook application")
public void to_launch_the_url_of_the_facebook_application() {
	launchUrl("https://en-gb.facebook.com/");

    
}

@When("To pass valid username in email field")
public void to_pass_valid_username_in_email_field() {
	f = new FacebookOne();
	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("dhanusha3021@gmail.com");
   
}

@When("To pass invalid password in password field")
public void to_pass_invalid_password_in_password_field() {
	f = new FacebookOne();
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys("RSamaira@2018");
   
}

@When("To click the login button")
public void to_click_the_login_button() {
	f = new FacebookOne();
	clickBtn(f.getLoginBtn());
    
}

@When("To check whether navigate to the home page or not")
public void to_check_whether_navigate_to_the_home_page_or_not() {
	System.out.println("To check your login credentials");
   
}

@Then("To close the browser")
public void to_close_the_browser() {
	closeEntireBrowser();
  
}


	
}