package com.sendProEnterprise.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewOrderPage extends BasePage{
	
	
	@FindBy(xpath= "//ul[@class='pbTabContainer-menu header cf  widget-el']/li/a[@tab-id='tab-1610613044173']")
	protected WebElement new_order_tab;
	
	@FindBy(xpath= "//label[@id ='Label1232' and text()='Search Options']")
	protected WebElement search_options_label;
	
	@FindBy(xpath= "//select[@id='dd_Condition']")
	protected WebElement condition_dropdown;
	
	@FindBy(xpath= "//select[@id='dd_Fields']")
	protected WebElement fields_dropdown;
	
	@FindBy(xpath= "//select[@id='dd_Operator']")
	protected WebElement operator_dropdown;
	
	@FindBy(xpath= "//input[@id='TxtSearchValue']")
	protected WebElement search_value_textbox;

	@FindBy(xpath= "//button[@id='btnSearchAdd']")
	protected WebElement add_btn;
	
	@FindBy(xpath= "//button[@id='btn_search']")
	protected WebElement search_btn;
	
	@FindBy(xpath= "//button[@id='btn_clear']")
	protected WebElement clear_btn;
	
	@FindBy(xpath= "//textarea[@id='txtAFilters']")
	protected WebElement search_txt_area;
	
	@FindBy(xpath = "//button[@id = 'showResults']")
	protected WebElement show_results_btn;
	
	@FindBy(xpath= "//div[@id='OrderListTable']/div[@class='pbTable-tableContent table-body-container']/table[@class='pbTable-tableBody']/tbody/tr[1]")
	protected WebElement order_list;
	
	@FindBy(xpath = "//div[@id='OrderListTable']/div[@class='pbTable-tableContent table-body-container']/table[@class='pbTable-tableBody']/tbody/tr")
	protected List<WebElement> order_list_table;
	
	@FindBy(xpath = "//table[@class='pbTable-tableHead']/thead/tr/th[@class= '' and @title = 'Marketplace']/ancestor::div[@class = 'pbTable-tableContent table-header-container']//following-sibling::div[1]/table/tbody/tr[1]/td[@title='Shopify']")
	protected WebElement market_place_data;
	
	@FindBy(xpath = "//div[@id = 'OrderListTable']//div[@class = 'pbTable-paginationWrapper cf']/span[@class = 'page-next fa fa-angle-right page-control enablePagination']")
	protected WebElement next_page_navigation;
	
	@FindBy(xpath = "//div[@id = 'OrderListTable']//div[@class = 'pbTable-paginationWrapper cf']/span[@class = 'page-prev fa fa-angle-left page-control enablePagination']")
	protected WebElement previous_page_navigation;
	
	@FindBy(xpath = "//div[@id='OrderListTable']//div[@class= 'pbTable-paginationWrapper cf']//input[@class = 'pageActive enablePagination']")
	protected WebElement page_number;
	
	@FindBy(xpath = "//div[@id='OrderListTable']//div[@class= 'pbTable-paginationWrapper cf']/span[@class = 'pageCount enablePagination']")
	protected WebElement total_page_count;
	
	@FindBy(xpath = "//button[@id = 'btnOpenViewApp']")
	protected WebElement viewApp;
	
	@FindBy(xpath="//button[@id='btn_syncAllStoreOrder']")
	protected WebElement syncOrder_btn;
	
	@FindBy(xpath = "//input[@id ='no_fromDate']")
	protected WebElement from_date;
	
	@FindBy(xpath = "//input[@id ='no_toDate']")
	protected WebElement to_date;
	


	public WebElement getFrom_date() {
		return from_date;
	}

	public WebElement getTo_date() {
		return to_date;
	}
	
	public WebElement getViewApp() {
		return viewApp;
	}

	public WebElement getSearch_txt_area() {
		return search_txt_area;
	}

	public WebElement getCondition_dropdown() {
		return condition_dropdown;
	}

	public WebElement getFields_dropdown() {
		return fields_dropdown;
	}

	public WebElement getOperator_dropdown() {
		return operator_dropdown;
	}
	
	public WebElement getSearch_value_textbox() {
		return search_value_textbox;
	}
	
	public WebElement getShow_results_btn() {
		return show_results_btn;
	}
	
	public boolean isMatketPlaceDataExists()
	{
		boolean flg = isElementPresent(market_place_data, "market place data");
		return flg;
	}
	
	
	public boolean no_results_found()
	{
		boolean flg = isElementPresent(order_list, "Order list");
		return flg;
	}
	
	public boolean is_column_exists(String column_name)

	{
	String xpath = "//table[@class='pbTable-tableHead']/thead/tr/th[@class= '' and @title = '"+column_name+"']";
	boolean flg = isElementPresent(getWebElementThroughXpath(xpath), column_name);
	return flg;
	}
	
	public boolean isDataExists(String column_name, String column_value)
	{
		String xpath = "//table[@class='pbTable-tableHead']/thead/tr/th[@class= '' and @title = '"+column_name+"']/ancestor::div[@class = 'pbTable-tableContent table-header-container']//following-sibling::div[1]/table/tbody/tr[1]/td[@title='"+column_value+"']";
		boolean flg = isElementPresent(getWebElementThroughXpath(xpath), column_name);
		return flg;
	}
	
	public boolean isDataExistsOnWebPage(String column_name, String column_value)
	{
		String xpath = "//table[@class='pbTable-tableHead']/thead/tr/th[@class= '' and @title = '"+column_name+"']/ancestor::div[@class = 'pbTable-tableContent table-header-container']//following-sibling::div[1]/table/tbody/tr[1]/td[@title='"+column_value+"']";
		boolean flg = isWebElementExistsThroughXpath(xpath);
		return flg;
	}
	


	public boolean isColumnStartsWith(String column_name, String column_value)
	{
		String xpath = "//table[@class='pbTable-tableHead']/thead/tr/th[@class= '' and @title = '"+column_name+"']/ancestor::div[@class = 'pbTable-tableContent table-header-container']//following-sibling::div[1]/table/tbody/tr[1]/td[starts-with(@title, '"+column_value+"')]";
		boolean flg = isElementPresent(getWebElementThroughXpath(xpath), column_name);
		return flg;
	}
	
	public boolean isColumnEndsWith(String column_name, String column_value)
	{
		String xpath = "//table[@class='pbTable-tableHead']/thead/tr/th[@class= '' and @title = 'Marketplace']/ancestor::div[@class = 'pbTable-tableContent table-header-container']//following-sibling::div[1]/table/tbody/tr[1]/td[6]";
		WebElement element =     getWebElementThroughXpath(xpath);
		String actual = element.getText().substring(element.getText().length()-4, element.getText().length());
		if(actual.equalsIgnoreCase(column_value))
		{
			return true;
		}
		
		return false;
	}
	
	public void selectFromDropdown(WebElement element, String value)
	{
		
		selectByVisibleText(element, value, "Field dropdown");
	}
		
		
	public boolean is_search_options_label_exists()
	{
		boolean flg = isElementPresent(search_options_label, "search options label");
		return flg;
	}
	
	public boolean is_condition_field_exists()
	{
		boolean flg = isElementPresent(condition_dropdown, "Condition Dropdown");
		return flg;
	}
	
	public boolean is_Fields_field_exists()
	{
		boolean flg = isElementPresent(fields_dropdown, "Fields Dropdown");
		return flg;
	}
	
	public boolean is_Operator_field_exists()
	{
		boolean flg = isElementPresent(operator_dropdown, "Operator dropdown");
		return flg;
	}
	
	public boolean is_Search_For_Value_field_exists()
	{
		boolean flg = isElementPresent(search_value_textbox, "search value textbox");
		return flg;
	}
	
	public boolean is_Add_Btn_Exists()
	{
		boolean flg = isElementPresent(add_btn, "Add Button");
		return flg;
	}
	
	public boolean is_Search_Button_Exists()
	{
		boolean flg = isElementPresent(search_btn, "Search Button");
		return flg;
	}
	
	public boolean is_Clear_Button_Exists()
	{
		boolean flg = isElementPresent(clear_btn, "Clear Button");
		return flg;
	}
	
	public boolean is_Search_Text_Area_Exists()
	{
		boolean flg = isElementPresent(search_txt_area, "Search Text Area");
		return flg;
	}

	public boolean isOrderListExists()
	{
		boolean flg = isElementPresent(order_list, "order_list");
		return flg;
	}
	
	
	public NewOrderPage openNewOrderPage()
	{
		return (NewOrderPage)openPage(NewOrderPage.class);
	}
	
	public void clickFieldDropDown() {
		
		clickUsingJavaScript(fields_dropdown, "Fields dropdown");
	}
	
	public void clickOperatorDropDown() {
		
		clickUsingJavaScript(operator_dropdown, "operator dropdown");
	}
	
	
	public List<String> getFieldsText()
	{
		List<WebElement> element = getAllSelectDropdownElements(fields_dropdown, "Fields Dropdown");
		
		ArrayList<String> lst = new ArrayList<String>();
		   
		   for(WebElement ele :element)
		   {
			   lst.add(ele.getText());
		   }
		   
		   return lst;
	}
	
	public List<String> getConditionsText()
	{
		List<WebElement> element = getAllSelectDropdownElements(condition_dropdown, "Condistions Dropdown");
		
		ArrayList<String> lst = new ArrayList<String>();
		   
		   for(WebElement ele :element)
		   {
			   lst.add(ele.getText());
		   }
		   
		   return lst;
	}
	
	public List<String> getOperatorFieldsText()
	{
		List<WebElement> element = getAllSelectDropdownElements(operator_dropdown, "Operator Dropdown");
		
		ArrayList<String> lst = new ArrayList<String>();
		   
		   for(WebElement ele :element)
		   {
			   lst.add(ele.getText());
		   }
		   
		   return lst;
	}
	
	public boolean waitforPageLoad() throws InterruptedException
	{
		boolean flg = waitForPageToLoad(20);
		return flg;
	}
	
	
	public void clickOnAddButton()
	{
		isElementClickable(add_btn, "Add buuton");
		click(add_btn, "Add buuton");
	}
	
	public void clickOnSearchButton()
	{
		click(search_btn, "Search button");
	}
	
	public boolean textPresent(WebElement element, String value)
	{
		boolean flg = isTextPresent(element, value);
		
		return flg;
	}
	
	
	public void clickOnClearButton()
	{
		click(clear_btn, "Clear Button");
	}
	
	public String getSelectedValueFromDropdown(WebElement element, String elementName)
	{  
		click(element, elementName);
		
		String selected_val = getSelectedOptionFromDropdown(element, elementName);
		
		return selected_val;
	}

	public boolean isTextofSearchForBlank(WebElement element)
	{
		
		  String text = getTextOfWebElementBasedonAttribute(search_value_textbox, "value");
	
		  if (text.isEmpty())
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
		  
	}
	
	public boolean validateOrderRowsForSearchResults(int size)
	{
		int count = order_list_table.size();
		
		if(count> size)
		{
			return false;
		}
		
		else if(count == size || count<size)
		{
			return true;
		}
		
		return false;
	}
	
	
	public boolean check_next_page_navigation_isEnabled()
	{
		boolean flg = isElementClickable(next_page_navigation, "Next Page pagination");
		return flg;
	}
	
	public boolean check_previous_page_navigation_isEnabled()
	{
		boolean flg = isElementClickable(previous_page_navigation, "Previous Page pagination");
		return flg;
	}
	
	
	public void clickNextPage()
	{
		clickUsingJavaScript(next_page_navigation, "Next Page Navigation");
	}
	
	public void clickOnPreviousPage()
	{
		clickUsingJavaScript(previous_page_navigation, "Previous button");
	}
	
	
	public String getPageNumber() {
		
		String pageNum = getTextOfWebElementBasedonAttribute(page_number, "Page Number");

		return pageNum;
	}	
	
	public void check_pagination() throws InterruptedException
	{
		int page_count = Integer.parseInt(total_page_count.getText());
		
		System.out.println(page_count);
		
		for(int i =0 ; i<=page_count; i++)
		{
			Thread.sleep(1000);
			clickNextPage();
		}
	}
	
	public boolean checkButtonIsDisabled(WebElement element)
	{
		 String results =  getTextOfWebElementBasedonAttribute(element, "disabled");
		 
		 System.out.println("Results is "+results);
		 
		 try {
			
		 
		 if(results.equalsIgnoreCase("true"))
		 {
			 return true;
		 }
		 
		 }
		 catch(NullPointerException ex)
		 {
			 
			 return false;
		 }
		 
		 return false;
}
	
	public boolean checkLaunchViewAppButtonStatus(String pageName)
	{
		if(pageName.equalsIgnoreCase("New Order"))
		{
			String xpath = "//button[@id = 'btnOpenViewApp' and contains(@class, 'disabled')]";
			
			WebElement element = getWebElementThroughXpath(xpath);
			
			return true;
		}
		else if(pageName.equalsIgnoreCase("Processed Order"))
		{
			boolean flg = isElementPresent(viewApp, "View APP button");
			
			return flg;
		}
		else
		{
			return false;
		}
		
	}
	
	 public void clickOnSyncOrderButton()
	  {
		  clickUsingJavaScript(syncOrder_btn, "Sync Order button");
	  }
	
}