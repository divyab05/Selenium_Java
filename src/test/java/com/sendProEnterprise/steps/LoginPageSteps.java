package com.sendProEnterprise.steps;
import org.testng.Assert;
import com.sendProEnterprise.pages.LoginPage;
import com.sendProEnterprise.pages.SendProHomePage;
import com.sendProEnterprise.utils.Crypt;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseSteps {
	
	LoginPage login;
	private String pageTitle;
	SendProHomePage homePage;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
		login = new LoginPage().openLogInPage(setupConfigFile().getProperty("app_url"));
		Assert.assertEquals(true, login.isUserNameTextboxExist());
		
	}
	

@When("user gets the title of the page")
public void user_gets_the_title_of_the_page() {
    
	pageTitle = login.getPageTitle();

  }


@Then("page title should be {string}")
public void page_title_should_be(String expectedPageTitle) {
   
	Assert.assertEquals("Login", pageTitle);
  
}

@Then("forgot your password link should be displayed")
public void forgot_your_password_link_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
	
  
  Assert.assertEquals(true, login.isForgotPasswordLinkExists());

}


@Given("Remember me check box should be displayed")
public void remember_me_check_box_should_be_displayed() {
    
	Assert.assertEquals(true, login.isRememberMeLinkExists());
}

@Given("Register an account link should be displayed")
public void register_an_account_link_should_be_displayed() {
    
	Assert.assertEquals(true, login.isRegisterAccountLinkExists());
    
}


@When("user enters valid username and password")
public void user_enters_valid_username_and_password() {
    
	String password = Crypt.decodeString(setupConfigFile().getProperty("password"));
	login.enterUserCredentials(setupConfigFile().getProperty("username"), password);
   
}

@When("click on sign in button")
public void click_on_sign_in_button() {
    
	homePage= login.clickSignInButton();
}

@Then("SendPro Enterprise home page should open")
public void send_pro_enterprise_home_page_should_open() throws InterruptedException {
 // Write code here that turns the phrase above into concrete actions
 
	
	boolean results = homePage.waitforPageLoad();
	Assert.assertEquals(true, results);
	//homePage.acceptAlert();
	Assert.assertEquals(true, homePage.isAddStoreBtnDisplayed());
	
}



}
