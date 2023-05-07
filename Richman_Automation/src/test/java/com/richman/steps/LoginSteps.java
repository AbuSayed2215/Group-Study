package com.richman.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.richman.base.BaseClass;
import com.richman.elements.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
@Given("User will open the browser")
public void user_will_open_the_browser() {
    
    
}
@Given("Navigate to the browser")
public void navigate_to_the_browser() {
    
    
}
@When("User click on the profile icon")
public void user_click_on_the_profile_icon() {
    pf.getLoginButton().click();
}
@When("User enter valid username")
public void user_enter_valid_username() {
    pf.getUsername().sendKeys("abu.sayed222018@gmail.com");
    
}
@When("User enter valid password")
public void user_enter_valid_password() {
  pf.getPassword().sendKeys("Asmrasel11");
    
}
@When("User click on the signin button")
public void user_click_on_the_signin_button() {
    pf.getLogin().click();
}
@Then("User should be able to see username on the screen")
public void user_should_be_able_to_see_username_on_the_screen() throws InterruptedException {
   Thread.sleep(3000); 
   
   boolean actual = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/a")).getText().contains("Home");
   Assert.assertTrue(actual);
    
}
}
