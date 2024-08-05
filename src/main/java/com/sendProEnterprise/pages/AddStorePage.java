package com.sendProEnterprise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("rawtypes")
public class AddStorePage extends BasePage{
	
	
	
	@FindBy(xpath="//div[@class='pb-modal-title']/span[contains(text(), 'Add Store')]")
	protected WebElement add_store_modal;
	
	@FindBy(xpath="//label[@id = 'Label1227' and contains(text(), 'Select Store')]")
	protected WebElement select_store_label;
	
	@FindBy(xpath= "//select[@id = 'dd_selectstore']")
	protected WebElement select_store_dropdown;
	
	@FindBy(xpath = "//input[@id = 'txtShopifyStoreUrl']")
	protected WebElement shopify_store_url_textbox;

	@FindBy(xpath = "//input[@id = 'txtShopifyApikey']")
	protected WebElement shopify_api_key_textbox;
	
	@FindBy(xpath = "//input[@id = 'txtShopifyApiPassword']")
	protected WebElement shopify_api_password_textbox;
	
	@FindBy(xpath = "//input[@id = 'txtShopifySharedSecret']")
	protected WebElement shopify_shared_secret_textbox;
	
	@FindBy(xpath = "//button[@id = 'btnShopifyRegister']")
	protected WebElement register_shopify_button;
	
	@FindBy(xpath = "//label[@id = 'Label1228']")
	protected WebElement shopify_store_url_label;
	
	@FindBy(xpath = "//label[@id = 'Label1229']")
	protected WebElement shopify_api_key_label;
	
	@FindBy(xpath = "//label[@id = 'Label1230']")
	protected WebElement shopify_api_password_label;
	
	@FindBy(xpath = "//label[@id = 'Label1231']")
	protected WebElement shopify_shared_secret_label;
	
	@FindBy(xpath = "//i[@class='fa fa-question-circle']/ancestor::label[@data-title='Shopify store url' and @id= 'Label1244']")
	protected WebElement shopify_url_hover_label_text;
	
	@FindBy(xpath = "//i[@class='fa fa-question-circle']/ancestor::label[@data-title='Shopify store API key' and @id= 'Label1245']")
	protected WebElement shopify_api_key_hover_label_text;
	
	@FindBy(xpath = "//i[@class='fa fa-question-circle']/ancestor::label[@data-title='Shopify store API password' and @id= 'Label1246']")
	protected WebElement shopify_api_password_hover_label_text;
	
	@FindBy(xpath = "//i[@class='fa fa-question-circle']/ancestor::label[@data-title='Shopify store shared secret key' and @id= 'Label1247']")
	protected WebElement shopify_shared_secret_hover_label_text;
	
	@FindBy(xpath = "//*[contains(text(),'Shopify store integrated successfully')]")
	protected WebElement shopify_store_onboard_success_msg;
	
	@FindBy(xpath = "//div[@class='messenger-body cf messenger-error']/div[@class='messenger-content']/p")
	protected WebElement error_message_text;
	
	@FindBy(xpath = "//div[@class= 'pb-modal-close fa fa-times']")
	protected WebElement close_add_store_pop_up_modal;
	
	
	
	public void close_add_store() {
		
		clickUsingJavaScript(close_add_store_pop_up_modal, "Close add store pop up");
	}
	
	
	public WebElement getErrorMessage()
	{
		return error_message_text;
	}
	
	public boolean isErrorMessageDialogExists() {
		
		boolean flg = isElementPresent(error_message_text, "error_message_text");
		return flg;
				}
	
	public WebElement getShopify_store_url_textbox() {
		return shopify_store_url_textbox;
	}


	public WebElement getShopify_api_key_textbox() {
		return shopify_api_key_textbox;
	}


	public WebElement getShopify_api_password_textbox() {
		return shopify_api_password_textbox;
	}


	public WebElement getShopify_shared_secret_textbox() {
		return shopify_shared_secret_textbox;
	}
	

	public WebElement getShopify_store_url_label() {
		return shopify_store_url_label;
	}


	public WebElement getShopify_api_key_label() {
		return shopify_api_key_label;
	}


	public WebElement getShopify_api_password_label() {
		return shopify_api_password_label;
	}


	public WebElement getShopify_shared_secret_label() {
		return shopify_shared_secret_label;
	}
	
	public void clickRegisterShopifyStoreButton()
	{
		click(register_shopify_button, "register shopify button");
	}
	
	public boolean getShopifySuccessMessage()
	{
		boolean flg = isElementPresent(shopify_store_onboard_success_msg, "shopify store success message");
		return flg;
	}
	
	public String getShopifyURLHoverText()
	{
		return getTextOfWebElementBasedonAttribute(shopify_url_hover_label_text, "data-title");
	}
	
	public String getShopifyApiKeyHoverText()
	{
		return getTextOfWebElementBasedonAttribute(shopify_api_key_hover_label_text, "data-title");
	}
	
	public String getShopifyApiPasswordHoverText()
	{
		return getTextOfWebElementBasedonAttribute(shopify_api_password_hover_label_text, "data-title");
	}
	
	public String getShopifyApiSharedSecretsHoverText()
	{
		return getTextOfWebElementBasedonAttribute(shopify_shared_secret_hover_label_text, "data-title");
	}
	
	
	public AddStorePage openAddStorePage()
	{
		return (AddStorePage)openPage(AddStorePage.class);
	}

	
	public boolean is_shopify_store_url_textbox_exists()
	{
		boolean flg = isElementPresent(shopify_store_url_textbox, "shopify_store_url_textbox");
		return flg;
	}
	
	public boolean is_shopify_api_password_textbox_exists()
	{
		boolean flg = isElementPresent(shopify_api_password_textbox, "shopify_api_password_textbox");
		return flg;
	}
	
	public boolean is_shopify_shared_secret_textbox_exists()
	{
		boolean flg = isElementPresent(shopify_shared_secret_textbox, "shopify_shared_secret_textbox");
		return flg;
	}
	
	
	public boolean is_shopify_api_key_textbox_exists()
	{
		boolean flg = isElementPresent(shopify_api_key_textbox, "shopify_api_key_textbox");
		return flg;
	}
	
	
	
	public boolean is_add_store_modal_exists()
	{
		boolean flg = isElementPresent(add_store_modal, "add_store_modal");
		return flg;
	}
	
	public boolean is_select_store_label_exists()
	{
		boolean flg = isElementPresent(select_store_label, "select_store_label");
		return flg;
	}
	

	public boolean is_select_store_dropdown_exists()
	{
		boolean flg = isElementPresent(select_store_dropdown, "select_store_dropdown");
		return flg;
	}
	
	public boolean is_add_store_clickable() 
	{

		boolean flg = isElementClickable(add_store_modal, "add_store_modal");
		return flg;
	}
	
	
	public void selectStore(String storeName)
	{
		selectByVisibleText(select_store_dropdown, storeName, "Select store dropdown");
	}

}
