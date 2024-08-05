package com.sendProEnterprise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("rawtypes")
public class LoginPage extends BasePage{
	
	
	@FindBy(xpath="//input[@id='Username']")
	protected WebElement username_textbox;
	
	@FindBy(xpath="//input[@id='Password']")
	protected WebElement password_textbox;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	protected WebElement forget_password_link;
	
	@FindBy(xpath="//button[@id='sign-in-btn']")
	protected WebElement sign_in_button;
	
	@FindBy(xpath="//a[text()='Register an account']")
	protected WebElement register_account_link;
	
	@FindBy(xpath= "//input[@id='RememberLogin']")
	protected WebElement remember_me_checkbox;

	
	
	public LoginPage openLogInPage(String url)
	{  
		System.out.println("Navigate to url "+url);
		navigate_to_url(url);
		return (LoginPage)openPage(LoginPage.class);
	}
	
	public boolean isUserNameTextboxExist()
	{
		boolean flg = isElementPresent(username_textbox, "username_textbox");
		return flg;
	}
	
	public String getPageTitle() 
	{
		return getTitle();
	}
	
	public boolean isForgotPasswordLinkExists() 
	{
		boolean flg = isElementPresent(forget_password_link, "forget_password_link");
		return flg;
	}
	
	public boolean isSignInButtonExists() 
	{
		boolean flg = isElementPresent(sign_in_button, "sign_in_button");
		return flg;
	}
	
	public boolean isRegisterAccountLinkExists() 
	{
		boolean flg = isElementPresent(sign_in_button, "sign_in_button");
		return flg;
	}
	
	public boolean isRememberMeLinkExists() 
	{
		boolean flg = isElementPresent(remember_me_checkbox, "remember_me_checkbox");
		return flg;
	}
	
	public void enterUserCredentials(String username, String password)
	{
		type(username_textbox,username , "username_textbox");
		type(password_textbox,password , "password_textbox");
	}
	
	public SendProHomePage clickSignInButton()
	{
		click(sign_in_button, "sigin_in_button");
		
		return (SendProHomePage)openPage(SendProHomePage.class);
	}

}
