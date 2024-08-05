package com.sendProEnterprise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendProHomePage extends BasePage{

	@FindBy(xpath="//button[@id='btnAddCart']")
	protected WebElement addStore_btn;

	@FindBy(xpath="//button[@id='btnViewStore']")
	protected WebElement viewStore_btn;
	
	@FindBy(xpath="//button[@id='btn_syncAllStoreOrder']")
	protected WebElement syncOrder_btn;
	
	@FindBy(xpath="//button[@id='btnRefreshData']")
	protected WebElement refresh_btn;
	
	@FindBy(xpath= "//ul[@class='pbTabContainer-menu header cf  widget-el']/li/a[@tab-id='tab-1610613044173']")
	protected WebElement new_order_tab;
	
	@FindBy(xpath= "//ul[@class='pbTabContainer-menu header cf  widget-el']/li/a[@tab-id='tab-1610613103311']")
	protected WebElement processed_order_tab;
	
	@FindBy(xpath= "//div[@id='OrderListTable']/div[@class='pbTable-tableContent table-body-container']/table[@class='pbTable-tableBody']/tbody/tr[1]")
	protected WebElement order_list;

	
	public WebElement getAddStore_btn() {
		return addStore_btn;
	}

	public WebElement getViewStore_btn() {
		return viewStore_btn;
	}

	public WebElement getSyncOrder_btn() {
		return syncOrder_btn;
	}

	public WebElement getRefresh_btn() {
		return refresh_btn;
	}
	
	
	public SendProHomePage openSendProHomePage()
	{
		return (SendProHomePage)openPage(SendProHomePage.class);
	}
	
	public NewOrderPage openNewOrderPage() {
		
		return  (NewOrderPage)openPage(NewOrderPage.class);
	}
	
	public boolean isAddStoreBtnDisplayed()
	{
		boolean flg = isElementPresent(addStore_btn, "addStorebutton");
		return flg;
	}
	
	public AddStorePage clickOnAddStoreBtn()
	{	
		isElementClickable(addStore_btn, "addStorebutton");
		clickUsingJavaScript(addStore_btn, "Add Store Button");
		return (AddStorePage)openPage(AddStorePage.class);
	}
	
	public ViewStorePage clickOnViewStoreBtn()
	{	
		isElementClickable(viewStore_btn, "ViewStorebutton");
		clickUsingJavaScript(viewStore_btn, "ViewStorebutton");
		return (ViewStorePage)openPage(ViewStorePage.class);
	}
	
	
	public boolean waitforPageLoad() throws InterruptedException
	{
		boolean flg = waitForPageToLoad(20);
		return flg;
	}
	
	public boolean isOrderListExists()
	{
		boolean flg = isElementPresent(order_list, "order_list");
		return flg;
	}
	
	public boolean isViewStoreBtnDisplayed()
	{
		boolean flg = isElementPresent(viewStore_btn, "viewStore_btn");
		return flg;
	}
	
	public boolean isSyncStoreBtnDisplayed()
	{
		boolean flg = isElementPresent(syncOrder_btn, "syncOrder_btn");
		return flg;
	}
	
	public boolean isRefreshStoreBtnDisplayed()
	{
		boolean flg = isElementPresent(refresh_btn, "refresh_btn");
		return flg;
	}
	
	public void acceptAlert()
	{	
		acceptJSAlert();
	}
	
	
}
