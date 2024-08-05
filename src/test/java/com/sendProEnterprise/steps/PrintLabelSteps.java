package com.sendProEnterprise.steps;
import com.sendProEnterprise.pages.NewOrderPage;
import com.sendProEnterprise.pages.PrintLabelPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class PrintLabelSteps extends BaseSteps{

	
	PrintLabelPage printLabelPage;
	NewOrderPage newOrderPage;
	WebDriver dr;
	
	
	@Then("check the search results should display results for column {string} is {string}")
	public void check_the_search_results_should_display_results_for_column_is(String column_name, String column_value) throws InterruptedException 
	{
		boolean results = printLabelPage.waitforPageLoad();
		Assert.assertEquals(true, results);
		Assert.assertEquals(true, printLabelPage.checkFirstRowInProcessedOrderResults());
		Assert.assertEquals(true, printLabelPage.isDataExists(column_name, column_value));
	    
	}

	
	@Then("user click on search proccesed order button")
	public void user_click_on_search_proccesed_order_button() {
	    // Write code here that turns the phrase above into concrete actions
	    printLabelPage.clickOnSearchBtnForProcessedOrder();
	}
	
	@When("user clicks first row on search results")
	public void user_clicks_first_row_on_search_results() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
		printLabelPage = new PrintLabelPage().openPrintLabelPage();
		printLabelPage.clickOnFirstRow();
		
	}
	
	
	@Then("Print label page should open with text as {string}")
	public void print_label_page_should_open_with_text_as(String text) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean results = printLabelPage.waitforPageLoad();
		Assert.assertEquals(true, results);
		Assert.assertEquals(true, printLabelPage.isPrintPageLoaded(text));
	}

	
	@Then("verify {string} should be present on the page")
	public void verify_should_be_present_on_the_page(String element_name) {
	    // Write code here that turns the phrase above into concrete actions
		
		if(element_name.equalsIgnoreCase("show_results_btn"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShow_results_btn(), element_name));
		}
		else if(element_name.equalsIgnoreCase("search_order_input"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getSearch_order_input(), element_name));
		}
		else if(element_name.equalsIgnoreCase("searchForButton"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getSearchForButton(), element_name));
		}
		else if(element_name.equalsIgnoreCase("reset_all_button"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getReset_all_button(), element_name));
		}
		else if(element_name.equalsIgnoreCase("select_carrier_dropdown"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getSelect_carrier_dropdown(), element_name));
		}
		else if(element_name.equalsIgnoreCase("select_service_dropdown"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getSelect_service_dropdown(), element_name));
		}
		else if(element_name.equalsIgnoreCase("select_customerPackage_dropdown"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getSelect_customerPackage_dropdown(), element_name));
		}
		else if(element_name.equalsIgnoreCase("input_weight_in_lb"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getInput_weight_in_lb(), element_name));
		}
		else if(element_name.equalsIgnoreCase("input_weight_in_oz"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getInput_weight_in_oz(), element_name));
		}
		else if(element_name.equalsIgnoreCase("length_input"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getLength_input(), element_name));
		}
		else if(element_name.equalsIgnoreCase("width_input"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getWidth_input(), element_name));
		}
		else if(element_name.equalsIgnoreCase("height_input"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getHeight_input(), element_name));
		}
		else if(element_name.equalsIgnoreCase("rate_btn"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getRate_btn(), element_name));
		}
		else if(element_name.equalsIgnoreCase("print_btn"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getPrint_btn(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_attention"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_attention(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_company"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_company(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_addressline1"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_addressline1(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_addressline2"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_addressline2(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_addressline3"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_addressline3(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_city"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_city(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_state"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_state(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_zipcode"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_zipcode(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_country"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_country(), element_name));
		}
		else if(element_name.equalsIgnoreCase("validate_btn"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getValidate_btn(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_phone"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_phone(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_to_email"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_to_email(), element_name));
		}
			
		else if(element_name.equalsIgnoreCase("ship_from_name_input"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_name_input(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_company_input"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_company_input(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_address1"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_address1(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_address2"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_address2(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_address3"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_address3(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_city"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_city(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_state"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_state(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_zip"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_zip(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_country"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_country(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_phone_input"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_phone_input(), element_name));
		}
		else if(element_name.equalsIgnoreCase("ship_from_email_input"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getShip_from_email_input(), element_name));
		}
		else if(element_name.equalsIgnoreCase("carrier_account_ship_from"))
		{
			Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getCarrier_account_ship_from(), element_name));
		}
				
	}
	
	@Then("user clicks on ship from link")
	public void user_clicks_on_ship_from_link() {
	    // Write code here that turns the phrase above into concrete actions
	   

		printLabelPage.clickOnShipFromLink();
		
	}
	
	
	@Then("Show Results button should be enabled")
	public void show_results_button_should_be_enabled() 
	{
	   

	   Assert.assertEquals(true,  printLabelPage.isShowResultsButtonEnabled());  
	}

	@When("user clicks on show Results button")
	public void user_clicks_on_show_results_button() {
	
	    printLabelPage.clickOnShowResultsBtn();
	    newOrderPage = new NewOrderPage().openNewOrderPage();
	}
	
	@Then("New Order page should display")
	public void new_order_page_should_display() {
	   
		Assert.assertEquals(true,  newOrderPage.isOrderListExists());
		Assert.assertEquals(true, newOrderPage.is_Search_Button_Exists());
	}

	@Then("verify {string} should display {string}")
	public void verify_should_display(String elementName, String data) {
	    // Write code here that turns the phrase above into concrete actions
		
		if(elementName.equalsIgnoreCase("ship_to_attention"))
		{
			Assert.assertEquals(data, printLabelPage.getTextofElement(printLabelPage.getShip_to_attention()));
		}
		else if(elementName.equalsIgnoreCase("ship_to_company"))
		{
			Assert.assertEquals(data, printLabelPage.getTextofElement(printLabelPage.getShip_to_company()));
		}
		else if(elementName.equalsIgnoreCase("ship_to_addressline1"))
		{
			Assert.assertEquals(data, printLabelPage.getTextofElement(printLabelPage.getShip_to_addressline1()));
		}
		else if(elementName.equalsIgnoreCase("ship_to_city"))
		{
			Assert.assertEquals(data, printLabelPage.getTextofElement(printLabelPage.getShip_to_city()));
		}
		else if(elementName.equalsIgnoreCase("ship_to_state"))
		{
			Assert.assertEquals(data, printLabelPage.getSelectedOptionFromDropdown(printLabelPage.getShip_to_state(), "ship_to_state"));
		}
		else if(elementName.equalsIgnoreCase("ship_to_zipcode"))
		{
			Assert.assertEquals(data, printLabelPage.getTextofElement(printLabelPage.getShip_to_zipcode()));
		}
		else if(elementName.equalsIgnoreCase("ship_to_country"))
		{
			Assert.assertEquals(data, printLabelPage.getSelectedOptionFromDropdown(printLabelPage.getShip_to_country(), "ship_to_country"));
		}
		else if(elementName.equalsIgnoreCase("ship_to_phone"))
		{
			Assert.assertEquals(data, printLabelPage.getTextofElement(printLabelPage.getShip_to_phone()));
		}
		else if(elementName.equalsIgnoreCase("ship_to_email"))
		{
			Assert.assertEquals(data, printLabelPage.getTextofElement(printLabelPage.getShip_to_email()));
		}
	}
	
	@Then("user checks  {string} in {string} field")
	public void user_checks_in_field(String text, String elementName) {
	    // Write code here that turns the phrase above into concrete actions
		if(elementName.equalsIgnoreCase("input_weight_in_lb"))
		{
			Assert.assertEquals(text, printLabelPage.getTextofElement(printLabelPage.getInput_weight_in_lb()));
		}
		else if(elementName.equalsIgnoreCase("input_weight_in_oz"))	
		{
			Assert.assertEquals(text, printLabelPage.getTextofElement(printLabelPage.getInput_weight_in_oz()));
		}
		
	}
	
	@When("user enters {string} in {string} field")
	public void user_enters_in_field(String text, String elementName) {
	    // Write code here that turns the phrase above into concrete actions
		if(elementName.equalsIgnoreCase("length_input"))
		{
	      printLabelPage.enterTextinPrintLabelPage(text, printLabelPage.getLength_input());
		}
		else if(elementName.equalsIgnoreCase("width_input"))	
		{
			 printLabelPage.enterTextinPrintLabelPage(text, printLabelPage.getWidth_input());
		}
		else if(elementName.equalsIgnoreCase("height_input"))	
		{
			 printLabelPage.enterTextinPrintLabelPage(text, printLabelPage.getHeight_input());
		}
		
	    
	}
	
	@When("verify rate button should be enabled")
	public void verify_rate_button_should_be_enabled() {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(true, printLabelPage.isRateButtonEnabled());
		
	   
	}
	
	@Then("user selects Carrier as {string}")
	public void user_selects_carrier_as(String carrierName) {
	    // Write code here that turns the phrase above into concrete actions
		printLabelPage.selectCarrier(carrierName);
	   
	}

	
	@When("user clicks on rate button")
	public void user_clicks_on_rate_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   printLabelPage.clickOnRateButton();
	}

	@Then("total cost should get displayed in Shipping Summary section")
	public void total_cost_should_get_displayed_in_shipping_summary_section() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, printLabelPage.checkTotalCostDisplayed());  
		
	}
	
	@Then("verify print button is enabled")
	public void verify_print_button_is_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	   
		Assert.assertEquals(true, printLabelPage.isElementClickable(printLabelPage.getPrint_btn(), "print button"));  
	}
	
	@When("user clicks on print button")
	public void user_clicks_on_print_button() {
	    // Write code here that turns the phrase above into concrete action
		printLabelPage.clickOnPrintButton();
	}
	
	@Then("print tab should open")
	public void print_tab_should_open() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, printLabelPage.checkPrintlabelWindowOpen());
		Assert.assertEquals(true,  printLabelPage.checkPDFViewerPageOnPrintWindowTab());   
		Thread.sleep(2000);

	}
	

@When("user clicks on show result button")
public void user_clicks_on_show_result_button() {
    // Write code here that turns the phrase above into concrete actions
 
	printLabelPage.clickOnShowResultsBtn();
}

@Then("Processed Order tab should present")
public void processed_order_tab_should_present() {
    // Write code here that turns the phrase above into concrete actions
  Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getProcessed_order_tab(), "processed order tab"));
	
	
}

@When("user clicks on processed order tab on Search Order Page")
public void user_clicks_on_processed_order_tab_on_search_order_page() {
    // Write code here that turns the phrase above into concrete actions

	printLabelPage = new PrintLabelPage().openPrintLabelPage();
	printLabelPage.clickOnProcessedOrderTab();
}


@Then("user clicks on processed order tab")
public void user_clicks_on_processed_order_tab() {
    // Write code here that turns the phrase above into concrete actions
    
	printLabelPage.clickOnProcessedOrderTab();
}

@Then("Processed order tab should open")
public void processed_order_tab_should_open() {
    // Write code here that turns the phrase above into concrete actions
		printLabelPage.getfromDate_PO().clear();
	    printLabelPage.gettoDate_PO().clear();
	    Assert.assertEquals(true, printLabelPage.isElementPresent(printLabelPage.getSearch_input(), "search button"));
	    
	 
	    
	    
}

@Then("user enters text from Search for package")
public void user_enters_text_from_search_for_package(io.cucumber.datatable.DataTable dataTable) {
    
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	
	printLabelPage.getSearch_input().sendKeys(data.get(0).get("data"));
	
	
}

@Then("check the search results should display the order")
public void check_the_search_results_should_display_the_order() {
    // Write code here that turns the phrase above into concrete actions
	
	 Assert.assertEquals(true, printLabelPage.checkFirstRowInProcessedOrderResults());
}

@Then("check the launch view APP button is enabled")
public void check_the_launch_view_app_button_is_enabled() {
    // Write code here that turns the phrase above into concrete actions
	 Assert.assertEquals(true, printLabelPage.checklaunchViewAppButtonEnabled());
}

@When("user clicks on launch view APP")
public void user_clicks_on_launch_view_app() {
    // Write code here that turns the phrase above into concrete actions
    
	printLabelPage.clickOnViewAppButton();
	Assert.assertEquals(true, printLabelPage.checkViewAPPWindowOpen());
}

@Then("view app window should open")
public void view_app_window_should_open() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    
	dr = printLabelPage.switchToWindowAndReturnDriver();
	Assert.assertEquals(true, printLabelPage.isSearchButtonPresentOnViewAPPWindow(dr));
}

@Then("user enters text to search order in view app")
public void user_enters_text_to_search_order_in_view_app(io.cucumber.datatable.DataTable dataTable) {
   

	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	printLabelPage.getSearch_in_view_app().sendKeys(data.get(0).get("data"));
	
}

@Then("user click on search view app button")
public void user_click_on_search_view_app_button() {
    // Write code here that turns the phrase above into concrete actions
	
	printLabelPage.clickUsingJavaScript(printLabelPage.getSearchButtonInViewApp(), dr);
   
}

@Then("check the search results of view app should display results for column {string} is {string}")
public void check_the_search_results_of_view_app_should_display_results_for_column_is(String column_name, String column_value) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    
	boolean results = printLabelPage.waitforPageLoad();
	Assert.assertEquals(true, results);
	Assert.assertEquals(true, printLabelPage.isDataExistsInViewApp(column_name, column_value, dr));

	
}



@When("user verify that order number {string} exists after sync order")
public void user_verify_that_order_number_exists_after_sync_order(String orderNumber) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	newOrderPage = new NewOrderPage().openNewOrderPage();
	boolean flg = false;
	boolean elementExists = false;
	newOrderPage.clickOnSyncOrderButton();
	Thread.sleep(2000);
	boolean results = newOrderPage.waitforPageLoad();
	Assert.assertEquals(true, results);
	
	int i = 200;
	int j = 0;
	
	while(i>j)
	{
		System.out.println("Inside polling");
		newOrderPage.clickOnClearButton();
		Thread.sleep(1000);
		newOrderPage.clickFieldDropDown();
		Thread.sleep(1000);
		newOrderPage.selectFromDropdown(newOrderPage.getFields_dropdown(), "Order Number");
		Thread.sleep(1000);
		newOrderPage.clickOperatorDropDown();
		Thread.sleep(1000);
		newOrderPage.selectFromDropdown(newOrderPage.getOperator_dropdown(), "Equal To");
		Thread.sleep(1000);
		newOrderPage.getSearch_value_textbox().sendKeys(orderNumber);
		Thread.sleep(1000);
		newOrderPage.clickOnAddButton();
		Thread.sleep(1000);
		newOrderPage.clickOnSearchButton();
		Thread.sleep(1000);
		
		elementExists = newOrderPage.isDataExistsOnWebPage("Order Number", orderNumber);
		
		System.out.println("Element Exists "+elementExists);
		
		if(elementExists)
		{
		flg = newOrderPage.isDataExists("Order Number", orderNumber);
		
		System.out.println("Flag Exists"+flg);
		
		
		if(flg)
		{
			System.out.println("Order exists");
			break;
		}
		}
		
		continue;
		
	}
	
	Assert.assertEquals(true, flg);
	
	
}







}