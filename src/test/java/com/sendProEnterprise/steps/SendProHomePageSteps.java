package com.sendProEnterprise.steps;
import org.testng.Assert;

import com.sendProEnterprise.pages.AddStorePage;
import com.sendProEnterprise.pages.NewOrderPage;
import com.sendProEnterprise.pages.SendProHomePage;
import com.sendProEnterprise.pages.ViewStorePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SendProHomePageSteps extends BaseSteps{
	
	SendProHomePage homePage;
	AddStorePage addStore;
	ViewStorePage viewStorePage;
	NewOrderPage newOrderPage;

@Given("user is on SendPro Enterprise home Page")
public void user_is_on_send_pro_enterprise_home_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	
	homePage = new SendProHomePage().openSendProHomePage();
	boolean flg = homePage.waitForAlert();
	if(flg)
	{
		homePage.acceptAlert();
	}
	else
	{
		Thread.sleep(10);
	}

}


@Then("{string} button is displayed")
public void button_is_displayed(String button_name) {
    // Write code here that turns the phrase above into concrete actions
	
	
	if(button_name.equalsIgnoreCase("Add Store"))
	{
		Assert.assertEquals(true, homePage.isAddStoreBtnDisplayed());
	}
	else if(button_name.equalsIgnoreCase("View Store"))
	{
		Assert.assertEquals(true, homePage.isViewStoreBtnDisplayed());
	}
	else if(button_name.equalsIgnoreCase("Sync Store"))
	{
		Assert.assertEquals(true, homePage.isSyncStoreBtnDisplayed());
	}
	else if(button_name.equalsIgnoreCase("Refresh Store"))
	{
		Assert.assertEquals(true, homePage.isRefreshStoreBtnDisplayed());
	}
	

}

@Then("text of {string} button should be {string}")
public void text_of_button_should_be(String button_name, String button_text) 
{
	
	if(button_name.equalsIgnoreCase("Add Store"))
	{
		Assert.assertEquals(button_text, homePage.getAddStore_btn().getText());
	}
	else if(button_name.equalsIgnoreCase("View Store"))
	{
		Assert.assertEquals(button_text, homePage.getViewStore_btn().getText());
	}
	else if(button_name.equalsIgnoreCase("Sync Store"))
	{
		Assert.assertEquals(button_text, homePage.getSyncOrder_btn().getText());
	}
	else if(button_name.equalsIgnoreCase("Refresh Store"))
	{
		Assert.assertEquals(button_text, homePage.getRefresh_btn().getText());
	}
	
	
}

@When("user clicks {string} button")
public void user_clicks_button(String button_name) {
    // Write code here that turns the phrase above into concrete actions
	
	
	if(button_name.equalsIgnoreCase("Add Store"))
	{
	 	
	 addStore=homePage.clickOnAddStoreBtn();  
	}
	else if(button_name.equalsIgnoreCase("View Store"))
	{
		viewStorePage = homePage.clickOnViewStoreBtn();
	}
	
}

@Then("Add Store Modal pop up should open")
public void add_store_modal_pop_up_should_open() {
    // Write code here that turns the phrase above into concrete actions
	
	Assert.assertEquals(true, addStore.is_add_store_modal_exists());

}

@Then("Select Store Label should be displayed")
public void select_store_label_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions

	Assert.assertEquals(true, addStore.is_select_store_label_exists());
}

@Then("Select Store dropdwon should be displayed")
public void select_store_dropdwon_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
	
	
	Assert.assertEquals(true, addStore.is_select_store_dropdown_exists());
  
}

@When("user is on NewOrder tab")
public void user_is_on_new_order_tab() {
    // Write code here that turns the phrase above into concrete actions
    newOrderPage = homePage.openNewOrderPage();
}


@Then("View Store Modal pop up should open")
public void view_store_modal_pop_up_should_open() {
    // Write code here that turns the phrase above into concrete actions

  Assert.assertEquals(true, viewStorePage.is_view_store_modal_exists());
}

@Then("{string} Label should be displayed")
public void label_should_be_displayed(String label_name) {
    // Write code here that turns the phrase above into concrete actions
    if(label_name.equalsIgnoreCase("StoreName"))
    {
    	Assert.assertEquals(true, viewStorePage.is_store_name_column_header_exists());
    	
    }
    else if(label_name.equalsIgnoreCase("Store Key"))
    {
    	Assert.assertEquals(true, viewStorePage.is_store_key_column_header_exists());
    }
    else if(label_name.equalsIgnoreCase("Country Code"))
    {
    	Assert.assertEquals(true, viewStorePage.is_country_code_column_header_exists());
    }
    else if(label_name.equalsIgnoreCase("Action Label"))
    {
    	Assert.assertEquals(true, viewStorePage.is_action_column_header_exists());
    }
}

@Then("Verify {string} field should be displayed")
public void verify_field_should_be_displayed(String field_name) {
	
	
    
	if(field_name.equalsIgnoreCase("Search Option"))
	{
		Assert.assertEquals(true, newOrderPage.is_search_options_label_exists());
		
	}
	else if(field_name.equalsIgnoreCase("Condition"))
	{
		Assert.assertEquals(true, newOrderPage.is_condition_field_exists());
	}
	else if(field_name.equalsIgnoreCase("Operator"))
	{
		Assert.assertEquals(true, newOrderPage.is_Operator_field_exists());
	}
	else if(field_name.equalsIgnoreCase("Search For Value"))
	{
		Assert.assertEquals(true, newOrderPage.is_Search_For_Value_field_exists());
	}
	else if(field_name.equalsIgnoreCase("Add Button"))
	{
		Assert.assertEquals(true, newOrderPage.is_Add_Btn_Exists());	
	}
	else if(field_name.equalsIgnoreCase("Search Button"))
	{
		Assert.assertEquals(true, newOrderPage.is_Search_Button_Exists());	
	}
	else if(field_name.equalsIgnoreCase("Clear Button"))
	{
		Assert.assertEquals(true, newOrderPage.is_Clear_Button_Exists());	
	}
	else if(field_name.equalsIgnoreCase("Search Text Area"))
	{
		Assert.assertEquals(true, newOrderPage.is_Search_Text_Area_Exists());	
	}
    
}

@Then("Verify {string} column should be displayed")
public void verify_column_should_be_displayed(String column_name) {
    // Write code here that turns the phrase above into concrete actions
 
	
	
	Assert.assertEquals(true, newOrderPage.is_column_exists(column_name));
}




}
