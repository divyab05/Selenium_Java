package com.sendProEnterprise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddWooCommerceStorePage extends BasePage
{
	
	
	@FindBy(xpath="//div[@class='pb-modal-title']/span[contains(text(), 'Add Store')]")
	protected WebElement add_store_modal;
	
	@FindBy(xpath="//label[@id = 'Label1227' and contains(text(), 'Select Store')]")
	protected WebElement select_store_label;
	
	@FindBy(xpath= "//select[@id = 'dd_selectstore']")
	protected WebElement select_store_dropdown;
	
	@FindBy(xpath = "//input[@id = 'txt_woocommerce_storeUrl']")
	protected WebElement woocommerce_store_url_textbox;
	
	@FindBy(xpath = "//input[@id = 'txt_woocommerce_storeKey']")
	protected WebElement woocommerce_store_key;
	
	@FindBy(xpath = "//select[@id = 'dd_woocommerce_onDemand']")
	protected WebElement on_demand_dropdown;
	
	@FindBy(xpath = "//input[@id = 'txt_woocommerce_bridgeUrl']")
	protected WebElement bridge_url_textbox;
	
	@FindBy(xpath = "//input[@id = 'txt_woocommerce_storeRoot']")
	protected WebElement store_root_textbox;
	
	@FindBy(xpath = "//button[@id = 'btn_woocommerce_onboard']")
	protected WebElement register_wooCommerce_store_btn;
	
	@FindBy(xpath = "//div[@class='messenger-body cf messenger-error']/div[@class='messenger-content']/p")
	protected WebElement error_message_text;
	
	@FindBy(xpath = "//div[@class= 'pb-modal-close fa fa-times']")
	protected WebElement close_add_store_pop_up_modal;
	
	@FindBy(xpath = "//label[@id = 'lbl_woocommerce_storeUrl']")
	protected WebElement store_url_label;
	

	@FindBy(xpath = "//label[@id = 'lbl_woocommerce_storeKey']")
	protected WebElement store_key_label;
	
	@FindBy(xpath = "//label[@id = 'lbl_woocommerce_onDemand']")
	protected WebElement onDemand_label;
	
	@FindBy(xpath = "//label[@id = 'lbl_woocommerce_bridgeUrl']")
	protected WebElement lbl_bridge_url;
	
	@FindBy(xpath = "//label[@id = 'lbl_woocommerce_storeRoot']")
	protected WebElement store_root_lbl;
	
	@FindBy(xpath = "//i[@class='fa fa-question-circle']/ancestor::label[@data-title='WooCommerce store url' and @id= 'Label1251']")
	protected WebElement woocommerce_store_url_hover_text;
	
	@FindBy(xpath = "//i[@class='fa fa-question-circle']/ancestor::label[@data-title='WooCommerce store key' and @id= 'Label1252']")
	protected WebElement woocommerce_store_key_hover_text;
	
	@FindBy(xpath = "//i[@class='fa fa-question-circle']/ancestor::label[@data-title='WooCommerce store is onDemand or not' and @id= 'Label1253']")
	protected WebElement woocommerce_ondemand_hover_text;
	
	@FindBy(xpath = "//i[@class='fa fa-question-circle']/ancestor::label[@data-title='WooCommerce store bridge URL' and @id= 'Label1254']")
	protected WebElement woocommerce_bridge_url_hover_text;
	
	@FindBy(xpath = "//i[@class='fa fa-question-circle']/ancestor::label[@data-title='WooCommerce store root path' and @id= 'Label1255']")
	protected WebElement woocommerce_store_root_hover_text;
	
	@FindBy(xpath = "//*[contains(text(),'Woocommerce store integrated successfully')]")
	protected WebElement woocommerce_onboard_success_msg;
	
	public WebElement getWooCommerceOnboardSuccessMsg()
	{
		return woocommerce_onboard_success_msg;
	}
	
	public void clickWooCommerceRegisterBtn()
	{
		click(register_wooCommerce_store_btn, "Register WooCommerce btn");
	}
	public String getWooCommerceStoreURLHoverText()
	{
		return getTextOfWebElementBasedonAttribute(woocommerce_store_url_hover_text, "data-title");
	}
	

	public String getWooCommerceStoreKeyHoverText()
	{
		return getTextOfWebElementBasedonAttribute(woocommerce_store_key_hover_text, "data-title");
	}
	
	public String getWooCommerceOnDemandHoverText()
	{
		return getTextOfWebElementBasedonAttribute(woocommerce_ondemand_hover_text, "data-title");
	}
	
	public String getWooCommerceBridgeUrlText()
	{
		return getTextOfWebElementBasedonAttribute(woocommerce_bridge_url_hover_text, "data-title");
	}
	
	public String getWooCommerceStoreRootText()
	{
		return getTextOfWebElementBasedonAttribute(woocommerce_store_root_hover_text, "data-title");
	}
	
	
	
	
	
	
	
	

	public WebElement getStore_url_label() {
		return store_url_label;
	}


	public WebElement getStore_key_label() {
		return store_key_label;
	}


	public WebElement getOnDemand_label() {
		return onDemand_label;
	}


	public WebElement getLbl_bridge_url() {
		return lbl_bridge_url;
	}


	public WebElement getStore_root_lbl() {
		return store_root_lbl;
	}
	public WebElement getAdd_store_modal() {
		return add_store_modal;
	}


	public WebElement getSelect_store_label() {
		return select_store_label;
	}


	public WebElement getSelect_store_dropdown() {
		return select_store_dropdown;
	}


	public WebElement getWoocommerce_store_url_textbox() {
		return woocommerce_store_url_textbox;
	}


	public WebElement getWoocommerce_store_key() {
		return woocommerce_store_key;
	}


	public WebElement getOn_demand_dropdown() {
		return on_demand_dropdown;
	}


	public WebElement getBridge_url_textbox() {
		return bridge_url_textbox;
	}


	public WebElement getStore_root_textbox() {
		return store_root_textbox;
	}


	public WebElement getRegister_wooCommerce_store_btn() {
		return register_wooCommerce_store_btn;
	}


	public WebElement getError_message_text() {
		return error_message_text;
	}


	public WebElement getClose_add_store_pop_up_modal() {
		return close_add_store_pop_up_modal;
	}


	
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
	
	
	public boolean is_add_store_modal_exists()
	{
		boolean flg = isElementPresent(add_store_modal, "add_store_modal");
		return flg;
	}
	
	public boolean isSuccessMsgForWooCommerce()
	{
		boolean flg  = isElementPresent(woocommerce_onboard_success_msg, "woocommerce onboard success msg");
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

	
	public AddWooCommerceStorePage openWooCommerceStore()
	{
		return (AddWooCommerceStorePage)openPage(AddWooCommerceStorePage.class);
	}

	
	public boolean isStoreUrlExists()
	{
		boolean flg = isElementPresent(woocommerce_store_url_textbox,"WooCommerce Store URL Textbox");
		return flg;
	}
	
	public boolean isStoreKeyExists()
	{
		boolean flg = isElementPresent(woocommerce_store_key, "WooCommerce Store Key Textbox");
		return flg;
	}
	

	public boolean isStoreOnDemand()
	{
		boolean flg = isElementPresent(on_demand_dropdown, "WooCommerce Store Key Textbox");
		return flg;
	}
	
	public boolean isBridgeURLExists()
	{
		boolean flg = isElementPresent(bridge_url_textbox, "Bridge URL Textbox");
		return flg;
	}
	
	public boolean isStoreRootExists()
	{
		boolean flg = isElementPresent(store_root_textbox, "store root textbox");
		return flg;
	}
	
	
}
