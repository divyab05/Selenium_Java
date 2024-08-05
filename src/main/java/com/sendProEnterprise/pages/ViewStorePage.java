package com.sendProEnterprise.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewStorePage extends BasePage {
	
	
	@FindBy(xpath="//span[contains(text(),'Store List')]")
	protected WebElement view_store_modal;
	
	@FindBy(xpath="//span[contains(text(),'Store Name')]")
	protected WebElement store_name_column_header;
	
	@FindBy(xpath= "//span[contains(text(),'Store Key')]")
	protected WebElement store_key_column_header;
	
	@FindBy(xpath= "//span[contains(text(),'Country Code')]")
	protected WebElement country_code_column_header;
	
	@FindBy(xpath = "//th[@title='Action' and @class = '']")
	protected WebElement action_column_header;
	
	@FindBy(xpath = "(//button[@id = 'btn_DisconnectStore_undefined'])[1]")
	protected WebElement disconnect_btn_first_row;
	
	@FindBy(xpath = "//div[@id='table_storelist']/div[@class='pbTable-tableContent table-body-container']/table/tbody/tr")
	protected List<WebElement> store_list_in_view_store;
	
	@FindBy(xpath = "//*[contains(text(),'Store deleted successfully')]")
	protected WebElement shopify_store_disconnect_success_msg;
	
	@FindBy(xpath = "//div[@class='pb-modal-close fa fa-times']")
	protected WebElement close_view_store_pop_up;
	
	
	public void close_view_store_pop_up()
	{
		close_view_store_pop_up.click();
	}
	
	
	
	public boolean waitforPageLoad() throws InterruptedException
	{
		boolean flg = waitForPageToLoad(20);
		return flg;
	}
	
	public ViewStorePage openViewStorePage()
	{
		return (ViewStorePage)openPage(ViewStorePage.class);
	}
	
	
	public WebElement get_disconnect_store_button()
	{
	
		int row = store_list_in_view_store.size();
		
		String disconnect_store_path = "//div[@id='table_storelist']/div[@class='pbTable-tableContent table-body-container']"
				+ "/table/tbody/tr["+row+"]/td[4]/button[@id='btn_DisconnectStore_undefined']";
		
		WebElement disconnect_store = getWebElementThroughXpath(disconnect_store_path);
		
		return disconnect_store;
		
	}
	
	public boolean isDisConnectStoreButtonEabled()
	{
		boolean flg = isElementClickable(get_disconnect_store_button(), 
				"Disconnect store");
	
		return flg;
	}
	
	public String get_Store_name() throws InterruptedException
	{
		
		int row = store_list_in_view_store.size();
		
		isElementClickable(store_list_in_view_store.get(0), "Store List");
	
		
		String store_name = "//div[@id='table_storelist']/div[@class='pbTable-tableContent table-body-container']"
				+ "/table/tbody/tr["+row+"]/td[1]";
		
		return getWebElementThroughXpath(store_name).getText();
	}
	
	public void click_disconnect_store(WebElement element, String element_name) {
		
		clickUsingJavaScript(element, element_name);
	}
	
	
	public boolean check_store_deletion_success_msg()
	{
		boolean flg = isElementPresent(shopify_store_disconnect_success_msg, "Shopify Store Disconnect success message");
		return flg;
	}
	
	

	public boolean is_view_store_modal_exists()
	{
		boolean flg = isElementPresent(view_store_modal, "view_store_modal");
		return flg;
	}
	
	public boolean is_store_name_column_header_exists()
	{
		boolean flg = isElementPresent(store_name_column_header, "store_name_column_header");
		return flg;
	}
	

	public boolean is_store_key_column_header_exists()
	{
		boolean flg = isElementPresent(store_key_column_header, "store_key_column_header");
		return flg;
	}
	
	public boolean is_country_code_column_header_exists() 
	{

		boolean flg = isElementClickable(country_code_column_header, "country_code_column_header");
		return flg;
	}

	public boolean is_action_column_header_exists() 
	{

		boolean flg = isElementClickable(action_column_header, "action_column_header");
		return flg;
	}
	
	
}
