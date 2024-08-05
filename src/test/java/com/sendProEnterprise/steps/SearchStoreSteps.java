package com.sendProEnterprise.steps;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.sendProEnterprise.pages.NewOrderPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStoreSteps extends BaseSteps{
	

	NewOrderPage newOrder;
	boolean checkRecordCount;

	
	@When("user is on NewOrder Search tab")
	public void user_is_on_new_order_search_tab() {
	    // Write code here that turns the phrase above into concrete actions
		newOrder = new NewOrderPage().openNewOrderPage();
	}

	
	@When("user clicks on Operator dropdown")
	public void user_clicks_on_operator_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		
	
		newOrder.clickOperatorDropDown();
	    
	}

	@Then("Operator dropdown should display expected values")
	public void operator_dropdown_should_display_expected_values(io.cucumber.datatable.DataTable dataTable) {
	   
		
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		List<String> dropdown_text = newOrder.getOperatorFieldsText();
		
		for(int i =1 ; i<dropdown_text.size();i++)
		{
			Assert.assertEquals(data.get(i -1).get("fields"), dropdown_text.get(i));
		}
		
	}
	
	
	@When("user clicks on Fields dropdown")
	public void user_clicks_on_fields_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		
		newOrder.clickFieldDropDown();
		
	}
	

@When("user enters FromDate")
public void user_enters_from_date_and_to_date(io.cucumber.datatable.DataTable dataTable) {
 
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	newOrder.getFrom_date().clear();
	newOrder.getFrom_date().sendKeys(data.get(0).get("FromDate"));
	

}

	
	@Then("fields dropdown should display expected values")
	public void fields_dropdown_should_display_expected_values(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		List<String> dropdown_text = newOrder.getFieldsText();
		
		Assert.assertEquals(data.get(0).get("fields"), dropdown_text.get(1));
		
		Assert.assertEquals(data.get(1).get("fields"), dropdown_text.get(2));
		
		Assert.assertEquals(data.get(2).get("fields"), dropdown_text.get(3));
		    
	}
	
	
	@Given("user selects {string} from the fields dropdown")
	public void user_selects_from_the_fields_dropdown(String field_value) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
		
		Thread.sleep(2000);
		newOrder.selectFromDropdown(newOrder.getFields_dropdown(), field_value);
	}
	

	@Given("user selects {string} from the operator dropdown")
	public void user_selects_from_the_operator_dropdown(String operator_dropdown) {
		
		
		
		newOrder.selectFromDropdown(newOrder.getOperator_dropdown(), operator_dropdown);
		
	   
	}

	@Given("user enters text from Search for value")
	public void user_enters_text_from_search_for_value(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		newOrder.getSearch_value_textbox().sendKeys(data.get(0).get("data"));
	}

	@Given("User clicks on Add button")
	public void user_clicks_on_add_button()  {
	    
		
		newOrder.clickOnAddButton();
	
	}

	@Then("user clicks on Search button")
	public void user_clicks_on_search_button() {
		
		
		newOrder.clickOnSearchButton();
		
	   
	}

	@Then("verify {string} column should show {string}")
	public void verify_column_should_show(String column_name, String column_value) throws InterruptedException 
	{
		boolean results = newOrder.waitforPageLoad();
		Assert.assertEquals(true, results);
		Assert.assertEquals(true, newOrder.isOrderListExists());
		Assert.assertEquals(true, newOrder.isDataExists(column_name, column_value));

}
	
	@Then("verify {string} column should show column value starts with {string}")
	public void verify_column_should_show_column_value_starts_with(String column_name, String column_value) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean results = newOrder.waitforPageLoad();
		Assert.assertEquals(true, results);
		Assert.assertEquals(true, newOrder.isOrderListExists());
		Assert.assertEquals(true, newOrder.isColumnStartsWith(column_name, column_value));
	}
	
	@Then("verify {string} column should show column value ends with {string}")
	public void verify_column_should_show_column_value_ends_with(String column_name, String column_value) throws InterruptedException 
	{
	    // Write code here that turns the phrase above into concrete actions
		boolean results = newOrder.waitforPageLoad();
		Assert.assertEquals(true, results);
		Assert.assertEquals(true, newOrder.isOrderListExists());
		Assert.assertEquals(true, newOrder.isColumnEndsWith(column_name, column_value));
	}

	@Then("verify {string} column should not show {string}")
	public void verify_column_should_not_show(String column_name, String column_value) throws InterruptedException 
	{
		boolean results = newOrder.waitforPageLoad();
		Assert.assertEquals(true, results);
		//Assert.assertEquals(true, newOrder.isOrderListExists());
		Assert.assertEquals(false, newOrder.isMatketPlaceDataExists());
	    
	}
	
	@When("verify Condition dropdown should display expected values")
	public void verify_condition_dropdown_should_display_expected_values(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		List<String> dropdown_text = newOrder.getConditionsText();
		
		Assert.assertEquals(data.get(0).get("fields"), dropdown_text.get(1));
		
		Assert.assertEquals(data.get(1).get("fields"), dropdown_text.get(2));
		
	}


@When("user selects {string} from the Condition drodpown")
public void user_selects_from_the_condition_drodpown(String condition_dropdown) {
    // Write code here that turns the phrase above into concrete actions
	
	
	
	newOrder.selectFromDropdown(newOrder.getCondition_dropdown(), condition_dropdown);
	  	
}

@When("User clicks on clear button")
public void user_clicks_on_clear_button() {
    // Write code here that turns the phrase above into concrete actions
	
	
	newOrder.clickOnClearButton();
}


@Then("verify fields dropdown should set to default value")
public void verify_fields_dropdown_should_set_to_default_value() {
    // Write code here that turns the phrase above into concrete actions
	
Assert.assertEquals("Select", newOrder.getSelectedValueFromDropdown(newOrder.getFields_dropdown(), "Field Dropdown"));
	
    
}


@Then("operator dropdown should set to default value")
public void operator_dropdown_should_set_to_default_value() {
    // Write code here that turns the phrase above into concrete actions
	
	Assert.assertEquals("Select", newOrder.getSelectedValueFromDropdown(newOrder.getOperator_dropdown(), "Operator Dropdown"));
	
   
}

@Then("search for value textbox should be set to blank")
public void search_for_value_textbox_should_be_set_to_blank() {
    // Write code here that turns the phrase above into concrete actions
	
	Assert.assertEquals(true, newOrder.isTextofSearchForBlank(newOrder.getSearch_value_textbox()));
    
}


@Then("condition dropdown should set to default value")
public void condition_dropdown_should_set_to_default_value() {
    // Write code here that turns the phrase above into concrete actions

	Assert.assertEquals("Select", newOrder.getSelectedValueFromDropdown(newOrder.getCondition_dropdown(), "Conditions Dropdown"));
	
}

@Then("Search Text Area fields should be set to blank")
public void search_text_area_fields_should_be_set_to_blank() {
    // Write code here that turns the phrase above into concrete actions
 
	Assert.assertEquals(true, newOrder.isTextofSearchForBlank(newOrder.getSearch_txt_area()));
	
}

@Then("verify Search order page should display less than or equal to {int} records per page")
public void verify_search_order_page_should_display_less_than_or_equal_to_records_per_page(Integer count) {
    // Write code here that turns the phrase above into concrete actions
    

	Assert.assertEquals(true, newOrder.validateOrderRowsForSearchResults(count));
}

@When("Check the order count should be greater than {int}")
public void check_the_order_count_should_be_greater_than(Integer count) {
    // Write code here that turns the phrase above into concrete actions
    
	checkRecordCount = newOrder.validateOrderRowsForSearchResults(count);
	
	
	
}

@Then("verify next page pagination icon is enabled")
public void verify_next_page_pagination_icon_is_enabled() {
    // Write code here that turns the phrase above into concrete actions
    
	if(checkRecordCount)
	{

		Assert.assertEquals(true, newOrder.check_next_page_navigation_isEnabled());
	}
	
	else
	{
		Assert.assertEquals(false, newOrder.check_next_page_navigation_isEnabled());
	}
	
}

@Then("user clicks on next page")
public void user_clicks_on_next_page() {
    // Write code here that turns the phrase above into concrete actions
    
	if(checkRecordCount)
	{
		newOrder.clickNextPage();
	}
	
	
}

//@Then("next page should display")
//public void next_page_should_display() {
//    // Write code here that turns the phrase above into concrete actions
//   
//	
//	Assert.assertEquals("2", newOrder.getPageNumber());
//}
//

@Then("validate user is able to navigate to all pages")
public void validate_user_is_able_to_navigate_to_all_pages() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    
	newOrder.check_pagination();
}


@Then("previous page navigation button should be enabled")
public void previous_page_navigation_button_should_be_enabled() {
    // Write code here that turns the phrase above into concrete actions
	
	if(checkRecordCount)
	{
	Assert.assertEquals(true, newOrder.check_previous_page_navigation_isEnabled());
}
	else
	{
		Assert.assertEquals(false, newOrder.check_previous_page_navigation_isEnabled());
	}
}

@Then("user clicks on previous page button")
public void user_clicks_on_previous_page_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	if(checkRecordCount)
	{
		Thread.sleep(1000);
		newOrder.clickOnPreviousPage();
		
	}
 
}

@Then("show results button is disabled")
public void show_results_button_is_disabled() {
   
	Assert.assertEquals(true, newOrder.checkButtonIsDisabled(newOrder.getShow_results_btn()));
}

@Then("launch view app button is disabled on {string} page")
public void launch_view_app_button_is_disabled_on_page(String pageName) {
   
	Assert.assertEquals(true, newOrder.checkLaunchViewAppButtonStatus(pageName));
	
}

@Then("verify no rows should be displayed in Search Results")
public void verify_no_rows_should_be_displayed_in_search_results() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(false, newOrder.no_results_found());
}

@When("user verify that column {string} as {string} exists after sync order for {string}")
public void user_verify_that_source_as_exists_after_sync_order(String column, String sourceName, String dropdownVal) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   
	boolean flg = false;
	boolean elementExists = false;
	newOrder.clickOnSyncOrderButton();
	Thread.sleep(4000);
	boolean results = newOrder.waitforPageLoad();
	Assert.assertEquals(true, results);
	
	int i = 200;
	int j = 0;
	
	while(i>j)
	{
		System.out.println("Inside polling");
		newOrder.clickOnClearButton();
		Thread.sleep(1000);
		newOrder.clickFieldDropDown();
		Thread.sleep(1000);
		newOrder.selectFromDropdown(newOrder.getFields_dropdown(), dropdownVal);
		Thread.sleep(1000);
		newOrder.clickOperatorDropDown();
		Thread.sleep(1000);
		newOrder.selectFromDropdown(newOrder.getOperator_dropdown(), "Equal To");
		Thread.sleep(1000);
		newOrder.getSearch_value_textbox().sendKeys(sourceName);
		Thread.sleep(1000);
		newOrder.clickOnAddButton();
		Thread.sleep(1000);
		newOrder.clickOnSearchButton();
		Thread.sleep(1000);
		
		elementExists = newOrder.isDataExistsOnWebPage(column, sourceName);
		
		System.out.println("Element Exists "+elementExists);
		
		if(elementExists)
		{
		flg = newOrder.isDataExists(column, sourceName);
		
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
