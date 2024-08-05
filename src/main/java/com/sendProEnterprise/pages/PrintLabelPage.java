package com.sendProEnterprise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrintLabelPage extends BasePage
{
	
	@FindBy(xpath = "//button[@id = 'showResults']")
	protected WebElement show_results_btn;
	
	@FindBy(xpath = "//button[@id = 'btnOpenViewApp']")
	protected WebElement viewApp;
	
	@FindBy(xpath = "//label[@id = 'total-cost']")
	protected WebElement total_cost;

	@FindBy(xpath = "//input[@id = 'search-for-order-input']")
	protected WebElement search_order_input;
	
	@FindBy(xpath = "//button[@id ='SearchForButton']")
	protected WebElement searchForButton;
	
	@FindBy(xpath = "//label[@id ='search-for-reset-label']")
	protected WebElement reset_all_button;
	
	@FindBy(xpath = "//select[@class ='carrier-dd']")
	protected WebElement select_carrier_dropdown;
	
	@FindBy(xpath = "//select[@class ='service-dd']")
	protected WebElement select_service_dropdown;
	
	@FindBy(xpath = "//select[@class ='package-dd']")
	protected WebElement select_customerPackage_dropdown;
	
	@FindBy(xpath = "//ul[@class = 'pbTabContainer-menu header cf  widget-el tabs-overflowing']//li[2]//a[@tab-id = 'tabZero' and text() = 'Ship From']")
	protected WebElement ship_from_link;
	
	@FindBy(xpath = "//ul[@class = 'pbTabContainer-menu header cf  widget-el tabs-overflowing']//li[3]//a[@tab-id = 'tabTwo' and text() = 'Bill To']")
	protected WebElement bill_to_link;
	
	@FindBy(xpath = "//input[@id = 'ship-to-attention']")
	protected WebElement ship_to_attention;
	
	@FindBy(xpath = "//input[@id = 'ship-to-company']")
	protected WebElement ship_to_company;
	
	@FindBy(xpath = "//input[@id = 'ship-to-address-1']")
	protected WebElement ship_to_addressline1;
	
	@FindBy(xpath = "//input[@id = 'ship-to-address-2']")
	protected WebElement ship_to_addressline2;

	@FindBy(xpath = "//input[@id = 'ship-to-address-3']")
	protected WebElement ship_to_addressline3;
	
	@FindBy(xpath = "//input[@id = 'ship-to-city']")
	protected WebElement ship_to_city;
	
	@FindBy(xpath = "//select[@id = 'ship-to-state']")
	protected WebElement ship_to_state;
		
	@FindBy(xpath = "//input[@id = 'ship-to-zip']")
	protected WebElement ship_to_zipcode;
	
	@FindBy(xpath = "//select[@id = 'ship-to-country']")
	protected WebElement ship_to_country;
	
	@FindBy(xpath = "//button[@id = 'validate']")
	protected WebElement validate_btn;
	
	@FindBy(xpath = "//input[@id = 'ship-to-phone']")
	protected WebElement ship_to_phone;
	
	@FindBy(xpath = "//input[@id = 'ship-to-email']")
	protected WebElement ship_to_email;
	
	@FindBy(xpath = "//input[@id = 'PackagesTabWeightlb-input']")
	protected WebElement input_weight_in_lb;
	
	@FindBy(xpath = "//input[@id = 'PackagesTabWeightoz-input']")
	protected WebElement input_weight_in_oz;
	
	@FindBy(xpath = "//input[@id = 'PackagesTabDims-L-input']")
	protected WebElement length_input;
	
	@FindBy(xpath = "//input[@id = 'PackagesTabDims-W-input']")
	protected WebElement width_input;
	
	@FindBy(xpath = "//input[@id = 'PackagesTabDims-H-input']")
	protected WebElement height_input;
	
	@FindBy(xpath = "//button[@id = 'RateButton']")
	protected WebElement rate_btn;
	
	@FindBy(xpath = "//button[@id = 'btn_printShip']")
	protected WebElement print_btn;
	
	@FindBy(xpath = "//input[@id = 'ship-from-name-input']")
	protected WebElement ship_from_name_input;
	
	@FindBy(xpath = "//input[@id = 'ship-from-company-input']")
	protected WebElement ship_from_company_input;
	
	@FindBy(xpath = "//input[@id = 'ship-from-address1-input']")
	protected WebElement ship_from_address1;
	
	@FindBy(xpath = "//input[@id = 'ship-from-address2-input']")
	protected WebElement ship_from_address2;
	
	@FindBy(xpath = "//input[@id = 'ship-from-address3-input']")
	protected WebElement ship_from_address3;
	
	@FindBy(xpath = "//input[@id = 'ship-from-city-input']")
	protected WebElement ship_from_city;
	
	@FindBy(xpath = "//select[@id = 'ship-from-state']")
	protected WebElement ship_from_state;
	
	@FindBy(xpath = "//input[@id = 'ship-from-zip-input']")
	protected WebElement ship_from_zip;
	
	@FindBy(xpath = "//select[@id = 'ship-from-country-dropdown']")
	protected WebElement ship_from_country;
	
	@FindBy(xpath = "//input[@id = 'ship-from-phone-input']")
	protected WebElement ship_from_phone_input;
	
	@FindBy(xpath = "//input[@id = 'ship-from-email-input']")
	protected WebElement ship_from_email_input;
	
	@FindBy(xpath = "//select[@class = 'carrier-dd']")
	protected WebElement carrier_account_ship_from;
	
	@FindBy(xpath= "//div[@id='OrderListTable']/div[@class='pbTable-tableContent table-body-container']/table[@class='pbTable-tableBody']/tbody/tr[1]")
	protected WebElement first_order;
	
	@FindBy(xpath = "//div[@id= 'viewer' and @class = 'pdfViewer']")
	protected WebElement print_label_pdf_viewer;
	
	@FindBy(xpath = "//div[@id='table_processedorder']/div[@class='pbTable-tableContent table-body-container']/table[@class='pbTable-tableBody']/tbody/tr[1]")
	protected WebElement first_row_processed_order;
	
	@FindBy(xpath = "//input[@id = 'po_searchInput']")
	protected WebElement search_input;
	
	@FindBy(xpath = "//input[@id = 'po_fromDate']")
	protected WebElement fromDate_PO;
	
	@FindBy(xpath = "//input[@id = 'po_toDate']")
	protected WebElement toDate_PO;
	
	@FindBy(xpath= "//ul[@class='pbTabContainer-menu header cf  widget-el']/li/a[@tab-id='tab-1610613103311']")
	protected WebElement processed_order_tab;
	
	@FindBy(xpath = "//button[@id = 'btn_processedOdrSearch']")
	protected WebElement search_btn_processed_order;
	
	@FindBy(xpath = "//input[@id = 'searchInput']")
	protected WebElement search_in_view_app;

	@FindBy(xpath = "//button[@id = 'searchButton']")
	protected WebElement searchButtonInViewApp;
	
	@FindBy(xpath = "//div[@id='ResultsTable']/div[@class='pbTable-tableContent table-body-container']/table[@class='pbTable-tableBody']/tbody/tr[1]")
	protected WebElement first_order_in_view_app;
	
	public WebElement getfromDate_PO()
	{
		return fromDate_PO;
	
	}
	public WebElement gettoDate_PO()
	{
		return toDate_PO;
	
	}
	
	
	public WebElement getSearch_in_view_app() {
		return search_in_view_app;
	}
	
	
	public WebElement getFirst_order_in_view_app() {
		return first_order_in_view_app;
	}
	
	
	public WebElement getSearchButtonInViewApp() {
		return searchButtonInViewApp;
	}

	
	public WebElement getViewApp() {
		return viewApp;
	}
	
	public boolean isDataExists(String column_name, String column_value)
	{
		String xpath = "//div[@id = 'table_processedorder']//table[@class='pbTable-tableHead']/thead/tr/th[@title = '"+column_name+"']/ancestor::div[@class = 'pbTable-tableContent table-header-container']//following-sibling::div[1]/table/tbody/tr[1]/td[@title = '"+column_value+"']";			
		boolean flg = isElementPresent(getWebElementThroughXpath(xpath), column_name);
		return flg;
	}
	
	public boolean isDataExistsInViewApp(String column_name, String column_value, WebDriver driver)
	{
		String xpath = "//div[@id = 'ResultsTable']//table[@class='pbTable-tableHead']/thead/tr/th[@title = '"+column_name+"']/ancestor::div[@class = 'pbTable-tableContent table-header-container']//following-sibling::div[1]/table/tbody/tr[1]/td[@title = '"+column_value+"']";
		boolean flg = isElementPresent(getWebElementThroughXpath(xpath, driver), "column_name", driver);
		return flg;
	}
	
	public WebElement getFirst_row_processed_order() {
		return first_row_processed_order;
	}

	public WebElement getSearch_input() {
		return search_input;
	}

	public WebElement getProcessed_order_tab() {
		return processed_order_tab;
	}
	
	public void selectCarrier(String carrierName)
	{
		selectByVisibleText(getCarrier_account_ship_from(), carrierName, "carrierName");
	}
	
	public WebElement getPrint_label_pdf_viewer() {
		return print_label_pdf_viewer;
	}

	public WebElement getShow_results_btn() {
		return show_results_btn;
	}

	public WebElement getSearch_order_input() {
		return search_order_input;
	}

	public WebElement getSearchForButton() {
		return searchForButton;
	}

	public WebElement getReset_all_button() {
		return reset_all_button;
	}

	public WebElement getSelect_carrier_dropdown() {
		return select_carrier_dropdown;
	}

	public WebElement getSelect_service_dropdown() {
		return select_service_dropdown;
	}

	public WebElement getSelect_customerPackage_dropdown() {
		return select_customerPackage_dropdown;
	}

	public WebElement getShip_from_link() {
		return ship_from_link;
	}

	public WebElement getBill_to_link() {
		return bill_to_link;
	}

	public WebElement getShip_to_attention() {
		return ship_to_attention;
	}

	public WebElement getShip_to_company() {
		return ship_to_company;
	}

	public WebElement getShip_to_addressline1() {
		return ship_to_addressline1;
	}

	public WebElement getShip_to_addressline2() {
		return ship_to_addressline2;
	}

	public WebElement getShip_to_addressline3() {
		return ship_to_addressline3;
	}

	public WebElement getShip_to_city() {
		return ship_to_city;
	}

	public WebElement getShip_to_state() {
		return ship_to_state;
	}

	public WebElement getShip_to_zipcode() {
		return ship_to_zipcode;
	}

	public WebElement getShip_to_country() {
		return ship_to_country;
	}

	public WebElement getValidate_btn() {
		return validate_btn;
	}

	public WebElement getShip_to_phone() {
		return ship_to_phone;
	}

	public WebElement getShip_to_email() {
		return ship_to_email;
	}

	public WebElement getInput_weight_in_lb() {
		return input_weight_in_lb;
	}

	public WebElement getInput_weight_in_oz() {
		return input_weight_in_oz;
	}

	public WebElement getLength_input() {
		return length_input;
	}

	public WebElement getWidth_input() {
		return width_input;
	}

	public WebElement getHeight_input() {
		return height_input;
	}

	public WebElement getRate_btn() {
		return rate_btn;
	}

	public WebElement getPrint_btn() {
		return print_btn;
	}

	public WebElement getShip_from_name_input() {
		return ship_from_name_input;
	}

	public WebElement getShip_from_company_input() {
		return ship_from_company_input;
	}

	public WebElement getShip_from_address1() {
		return ship_from_address1;
	}

	public WebElement getShip_from_address2() {
		return ship_from_address2;
	}

	public WebElement getShip_from_address3() {
		return ship_from_address3;
	}

	public WebElement getShip_from_city() {
		return ship_from_city;
	}

	public WebElement getShip_from_state() {
		return ship_from_state;
	}

	public WebElement getShip_from_zip() {
		return ship_from_zip;
	}

	public WebElement getShip_from_country() {
		return ship_from_country;
	}

	public WebElement getShip_from_phone_input() {
		return ship_from_phone_input;
	}

	public WebElement getShip_from_email_input() {
		return ship_from_email_input;
	}

	public WebElement getCarrier_account_ship_from() {
		return carrier_account_ship_from;
	}

	public WebElement getFirst_order() {
		return first_order;
	}

	public void clickOnShowResultsTab()
	{
		clickUsingJavaScript(show_results_btn, "show Results button");
	}
	
	
	public void clickOnProcessedOrderTab()
	{
		clickUsingJavaScript(processed_order_tab, "Processed order tab");
	}
	
	public boolean checkFirstRowInProcessedOrderResults()
	{
		boolean flg = isElementPresent(first_row_processed_order, "First Row in processed order results");
	
		return flg;
	}
	
	public void enterTextinSearchPackageFields(String text)
	{
		search_input.sendKeys(text);
	}
	
		
	public void clickOnFirstRow()
	{
		clickUsingJavaScript(first_order, "first order in search results");	
	}
	
	public PrintLabelPage openPrintLabelPage()
	{
		return (PrintLabelPage)openPage(PrintLabelPage.class);
	}
	
	
	public boolean isSearchForOrderFieldPresent()
	{
		boolean flg = isElementPresent(search_order_input, "Search Order input");
		return flg;
	}
	
  public void clickOnShipFromLink()
  {
	  clickUsingJavaScript(ship_from_link, "Ship from link");
  }
	
  public boolean isShowResultsButtonEnabled()
  {
	  boolean flg = isElementClickable(show_results_btn, "show results button");
	  return flg;
  }
  
  public boolean isPrintPageLoaded(String text)
  {
	  boolean flg = isAttributePresent(ship_to_company, text);
	  return flg;
  }
  
  public void clickOnShowResultsBtn()
  {
	  clickUsingJavaScript(show_results_btn, "show results button");
  }
  
  public String getTextofElement(WebElement element)
  {
	 
	  return getTextofElementUsingJavaScript(element);
  }
  
public void enterTextinPrintLabelPage(String text, WebElement elementName)
{
	elementName.clear();
	elementName.sendKeys(text);
}
  
  public boolean isRateButtonEnabled()
  {
	  boolean flg = isElementClickable(rate_btn, "Rate button");
	  return flg;
  }
  
  public void clickOnRateButton() throws InterruptedException
  {
	  clickUsingJavaScript(rate_btn, "Rate button");
	  Thread.sleep(10000);
  }
  
  public void clickOnPrintButton() {
	  
	  clickUsingJavaScript(print_btn, "print button");
  }
  
  public boolean checkTotalCostDisplayed()
  {
	  double cost = Double.parseDouble(total_cost.getText());
	  
	  if((cost>0) || (cost==0.00))
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
  
  public boolean waitforPageLoad() throws InterruptedException
	{
		boolean flg = waitForPageToLoad(20);
		return flg;
	}
  
  public boolean checkPrintlabelWindowOpen()
  {
	  boolean flg = numberOfWindowsTobeLoaded(2);
	  return flg;
  }
  
  public boolean checkViewAPPWindowOpen()
  {
	  boolean flg = numberOfWindowsTobeLoaded(2);
	  return flg;
  }
  
  public boolean checkPDFViewerPageOnPrintWindowTab() throws InterruptedException
  {
	  boolean flg = switchToWindowAndVerifyWebElementPresent(print_label_pdf_viewer, "print label pdf viewer");
	  return flg;
  }
  
  public void clickOnSearchBtnForProcessedOrder()
  {
	 clickUsingJavaScript(search_btn_processed_order, "search_btn_processed_order");
  }
  
  public boolean checklaunchViewAppButtonEnabled()
  {
	  boolean flg = isElementClickable(viewApp, "ViewAPPButtonEnabled");
	  return flg;
  }
  
  public void clickOnViewAppButton()
  {
	  clickUsingJavaScript(viewApp, "View APP button");
  }
  
  public boolean isSearchButtonPresentOnViewAPPWindow(WebDriver dr)
  {
	  
	  boolean flg = isElementClickable(searchButtonInViewApp, "View APP button", dr);
	  return flg;
  }
  
 
  
  
}
