package com.sendProEnterprise.steps;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.sendProEnterprise.pages.AddWooCommerceStorePage;
import com.sendProEnterprise.pages.ViewStorePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddWooCommerceStoreSteps extends BaseSteps{
	
	
	AddWooCommerceStorePage add_woocommerce_page ;
	ViewStorePage viewstore;

@When("user selects {string} store option from dropdown")
public void user_selects_store_option_from_dropdown(String storeName) {
    // Write code here that turns the phrase above into concrete actions
   add_woocommerce_page = new AddWooCommerceStorePage().openWooCommerceStore();
   add_woocommerce_page.selectStore(storeName);
	
}
	
	
	@Then("{string} field should be displayed for woocommerce")
	public void field_should_be_displayed_for_woocommerce(String field_name) {
	    // Write code here that turns the phrase above into concrete actions
	    
		if(field_name.equalsIgnoreCase("Store URL"))
		{
			Assert.assertEquals(true, add_woocommerce_page.isStoreUrlExists());
		}
		else if(field_name.equalsIgnoreCase("Store Key"))
		{
			Assert.assertEquals(true, add_woocommerce_page.isStoreKeyExists());
		}
		else if(field_name.equalsIgnoreCase("On Demand"))
		{
			Assert.assertEquals(true, add_woocommerce_page.isStoreOnDemand());
		}
		else if(field_name.equalsIgnoreCase("Bridge Url"))
		{
			Assert.assertEquals(true, add_woocommerce_page.isBridgeURLExists());
			
		}
		else if(field_name.equalsIgnoreCase("Store Root"))
		{
			Assert.assertEquals(true, add_woocommerce_page.isStoreRootExists());
		}
		
		
		
	}
	

@Then("{string} label should be displayed for woocommerce")
public void label_should_be_displayed_for_woocommerce(String labelName) {
    // Write code here that turns the phrase above into concrete actions

	

	if(labelName.equalsIgnoreCase("Store Url"))
	{
		Assert.assertEquals(labelName, add_woocommerce_page.getStore_url_label().getText());
	}
	else if(labelName.equalsIgnoreCase("Store Key"))
	{
		Assert.assertEquals(labelName, add_woocommerce_page.getStore_key_label().getText());
	}
	else if(labelName.equalsIgnoreCase("On Demand"))
	{
		Assert.assertEquals(labelName, add_woocommerce_page.getOnDemand_label().getText());
	}
	else if(labelName.equalsIgnoreCase("Bridge Url"))
	{
		Assert.assertEquals(labelName, add_woocommerce_page.getLbl_bridge_url().getText());
		
	}
	else if(labelName.equalsIgnoreCase("Store Root"))
	{
		Assert.assertEquals(labelName, add_woocommerce_page.getStore_root_lbl().getText());
	}
	
}


@Then("{string} label should be displayed on question mark icon for woocommerce")
public void label_should_be_displayed_on_question_mark_icon_for_woocommerce(String hover_text) {
    // Write code here that turns the phrase above into concrete actions
   
	if(hover_text.equalsIgnoreCase("WooCommerce store url"))
	{
		Assert.assertEquals(hover_text, add_woocommerce_page.getWooCommerceStoreURLHoverText());
	}
	else if(hover_text.equalsIgnoreCase("WooCommerce store key"))
	{
		Assert.assertEquals(hover_text, add_woocommerce_page.getWooCommerceStoreKeyHoverText());
	}
	else if(hover_text.equalsIgnoreCase("WooCommerce store is onDemand or not"))
	{
		Assert.assertEquals(hover_text, add_woocommerce_page.getWooCommerceOnDemandHoverText());
	}
	else if(hover_text.equalsIgnoreCase("WooCommerce store bridge URL"))
	{
		Assert.assertEquals(hover_text, add_woocommerce_page.getWooCommerceBridgeUrlText());
	}
	else if(hover_text.equalsIgnoreCase("WooCommerce store root path"))
	{
		Assert.assertEquals(hover_text, add_woocommerce_page.getWooCommerceStoreRootText());
	}
	
	
}

@Then("{string} error message should display on woocommerce add store window")
public void error_message_should_display_on_woocommerce_add_store_window(String errorMsg) {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(true, add_woocommerce_page.isErrorMessageDialogExists());
	Assert.assertEquals(errorMsg, add_woocommerce_page.getErrorMessage().getText());
}

@When("Click on Register button for woocommerce")
public void click_on_register_button_for_woocommerce() {
    // Write code here that turns the phrase above into concrete actions
   add_woocommerce_page.clickWooCommerceRegisterBtn();
}


@When("user enters WooCommerce onboard details")
public void user_enters_woo_commerce_onboard_details(io.cucumber.datatable.DataTable dataTable) {
  
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	
	add_woocommerce_page.getWoocommerce_store_url_textbox().sendKeys(data.get(0).get("store_url"));
	
	add_woocommerce_page.getWoocommerce_store_key().sendKeys(data.get(0).get("store_key"));
}




@When("user clears {string} field for woocommerce")
public void user_clears_field_for_woocommerce(String field_name) {
    // Write code here that turns the phrase above into concrete actions
	

    if(field_name.equalsIgnoreCase("store_key"))
    {
    add_woocommerce_page.getWoocommerce_store_key().clear();
}
 
    else if(field_name.equalsIgnoreCase("store_url"))
    {
    	add_woocommerce_page.getWoocommerce_store_url_textbox().clear();
    }
    
 
}

@Then("Onboard WooCommerce Success Response should recieved")
public void onboard_woo_commerce_success_response_should_recieved() 
{
    // Write code here that turns the phrase above into concrete actions

	Assert.assertEquals(true, add_woocommerce_page.isSuccessMsgForWooCommerce());
}

@Then("disconnect woocommerce store response should received")
public void disconnect_woocommerce_store_response_should_received() {
    // Write code here that turns the phrase above into concrete actions
	viewstore = new ViewStorePage().openViewStorePage();
	Assert.assertEquals(true, viewstore.check_store_deletion_success_msg());
    
}







}
