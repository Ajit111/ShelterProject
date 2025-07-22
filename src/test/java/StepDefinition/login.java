package StepDefinition;

import org.openqa.selenium.WebDriver;

import Page.loginpage;
import base.BaseClass;
import base.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login extends BaseClass {
	
	
 loginpage L =new loginpage();
 
// public static WebDriver driver; 
	
//	@Given("I Open the Chrome Browser")
//	public void i_open_the_chrome_browser() throws InterruptedException {
//    L.i_open_the_chrome_browser();
//	}
//	

	@Given ("Enter Username")
	public void enter_username() throws InterruptedException {
    L.enter_username();
	}
	
	
	
	@Then ("Enter Password")
    public void enter_password() throws InterruptedException {
	L.Enter_Password();
	}
	
	@Then("Select Stops")
	public void Select_Stops() throws InterruptedException {
	L.Select_Stops();
	}
	@Then ("Select checkbox")	
	public void Select_checkbox() throws InterruptedException {
		L.Select_checkbox();
	}
	
	@Then("click on login button")
	public void click_on_login_button() throws InterruptedException {
	L.click_on_login_button();
	   
	}
//	
//	@Then ("click on add to cart button") 
//	public void click_on_add_to_cart_button() throws InterruptedException {
//	L.click_on_add_to_cart_button();
//	}
//	
////	@Then ("click on Remove button") 
////	public void click_on_Remove_button() throws InterruptedException {
////		Thread.sleep(900);
////	L.click_on_Remove_button();
////	}
//	
//	
//	
//	
//	
	
}



