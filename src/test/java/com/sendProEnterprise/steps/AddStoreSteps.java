package com.sendProEnterprise.steps;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.sendProEnterprise.pages.AddStorePage;
import com.sendProEnterprise.pages.ViewStorePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AddStoreSteps extends BaseSteps{
	
	
	AddStorePage addStore;
	ViewStorePage viewStore;
	
	@When("user selects {string} store from dropdown")
	public void user_selects_store_from_dropdown(String store_name) {
	    // Write code here that turns the phrase above into concrete actions
	
		addStore = new AddStorePage().openAddStorePage();
		addStore.selectStore(store_name);
	
	}

	@Then("{string} textbox should be displayed")
	public void textbox_should_be_displayed(String field_name) {
	   
		if(field_name.equalsIgnoreCase("Store URL"))
		{
			Assert.assertEquals(true, addStore.is_shopify_store_url_textbox_exists());
		}
		else if(field_name.equalsIgnoreCase("API Key"))
		{
			Assert.assertEquals(true, addStore.is_shopify_api_key_textbox_exists());
		}
		else if(field_name.equalsIgnoreCase("API Password"))
		{
			Assert.assertEquals(true, addStore.is_shopify_api_password_textbox_exists());
		}
		else if(field_name.equalsIgnoreCase("Shared Secret"))
		{
			Assert.assertEquals(true, addStore.is_shopify_shared_secret_textbox_exists());
			
		}
	}
	
	@Then("{string} label should be displayed")
	public void label_should_be_displayed(String label_name) {
	    
		
		if(label_name.equalsIgnoreCase("Store URL"))
		{
			Assert.assertEquals(label_name, addStore.getShopify_store_url_label().getText());
		}
		else if(label_name.equalsIgnoreCase("API Key"))
		{
			Assert.assertEquals(label_name, addStore.getShopify_api_key_label().getText());
		}
		else if(label_name.equalsIgnoreCase("API Password"))
		{
			Assert.assertEquals(label_name, addStore.getShopify_api_password_label().getText());
		}
		else if(label_name.equalsIgnoreCase("Shared Secret"))
		{
			Assert.assertEquals(label_name, addStore.getShopify_shared_secret_label().getText());
			
		}
	}
	
	@Then("{string} label should be displayed on question mark icon")
	public void label_should_be_displayed_on_question_mark_icon(String hover_text) {
	    
		
		if(hover_text.equalsIgnoreCase("Shopify store url"))
		{
			Assert.assertEquals(hover_text, addStore.getShopifyURLHoverText());
		}
		else if(hover_text.equalsIgnoreCase("Shopify store API key"))
		{
			Assert.assertEquals(hover_text, addStore.getShopifyApiKeyHoverText());
		}
		else if(hover_text.equalsIgnoreCase("Shopify store API password"))
		{
			Assert.assertEquals(hover_text, addStore.getShopifyApiPasswordHoverText());
		}
		else if(hover_text.equalsIgnoreCase("Shopify store shared secret key"))
		{
			Assert.assertEquals(hover_text, addStore.getShopifyApiSharedSecretsHoverText());
		}
	   
	}

	@Given("user enters Shopify onboard details")
	public void user_enters_shopify_onboard_details(io.cucumber.datatable.DataTable dataTable) 
	{
	
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		
		addStore.getShopify_store_url_textbox().sendKeys(data.get(0).get("store_url"));
		
		
		addStore.getShopify_api_key_textbox().sendKeys(data.get(0).get("api_key"));
		
		
		addStore.getShopify_api_password_textbox().sendKeys(data.get(0).get("api_password"));
		
		
		addStore.getShopify_shared_secret_textbox().sendKeys(data.get(0).get("shared_secret"));
	    
	}

	@Given("Click on Register button")
	public void click_on_register_button() {
	  
	addStore.clickRegisterShopifyStoreButton();
	
	}

	@Then("Onboard Shopify Success Response should recieved")
	public void onboard_shopify_success_response_should_recieved() {
	  
		Assert.assertEquals(true, addStore.getShopifySuccessMessage());
	}
	

@Then("{string} error message should display")
public void error_message_should_display(String error_message) {
    
	Assert.assertEquals(true, addStore.isErrorMessageDialogExists());
	Assert.assertEquals(error_message, addStore.getErrorMessage().getText());
}

@Given("user clears {string} field")
public void user_clears_field(String field_name) {
   
    if(field_name.equalsIgnoreCase("api_key"))
    {
    addStore.getShopify_api_key_textbox().clear();
}
    else if(field_name.equalsIgnoreCase("api_password"))
    {
    	addStore.getShopify_api_password_textbox().clear();
    }
    else if(field_name.equalsIgnoreCase("shared_secret"))
    {
    	addStore.getShopify_shared_secret_textbox().clear();
    }
    
}

@Then("verify disconnect store button is enabled")
public void verify_disconnect_store_button_is_enabled() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	viewStore = new ViewStorePage().openViewStorePage();
	boolean results = viewStore.waitforPageLoad();
	Assert.assertEquals(true, results);
	Assert.assertEquals(true, viewStore.isDisConnectStoreButtonEabled());
	
   
}

@Given("verify shopify store added in the list")
public void verify_shopify_store_added_in_the_list() throws InterruptedException {
    
	
	Assert.assertEquals("Shopify", viewStore.get_Store_name());
}



@Then("verify woocommerce store added in the list")
public void verify_woocommerce_store_added_in_the_list() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals("woocommerce", viewStore.get_Store_name());
}


@Then("Click on Disconnect Store button")
public void click_on_disconnect_store_button() {
  
	WebElement disconnect_store = viewStore.get_disconnect_store_button();
	
	viewStore.clickUsingJavaScript(disconnect_store, "disconnect store button");

	
}

@Then("user checks the existing field should not be blank")
public void user_checks_the_existing_field_should_not_be_blank() {
   
    String store_url_text = addStore.getShopify_store_url_textbox().getText();
    String api_key_text = addStore.getShopify_api_key_textbox().getText();
    String shared_secret_text = addStore.getShopify_shared_secret_textbox().getText();
    
    if((store_url_text != null) && (api_key_text != null) && (shared_secret_text !=null))
    {
        Assert.assertTrue(true, "Store url and api key and shared secret should not be blank");	
    }
    else
    {
    	Assert.fail("Store url and api key and shared secret is coming blank");
    }   
   
}



@Given("disconnect shopify store response should received")
public void disconnect_shopify_store_response_should_received() {
    
Assert.assertEquals(true, viewStore.check_store_deletion_success_msg());

	
}


@Given("user enters {string} and {string} and {string} and {string}")
public void user_enters_and_and_and(String store_url, String api_key, String api_password, String shared_secret) 
{
	
    addStore.getShopify_store_url_textbox().sendKeys(store_url);
    addStore.getShopify_api_key_textbox().sendKeys(api_key);
    addStore.getShopify_api_password_textbox().sendKeys(api_password);
    addStore.getShopify_shared_secret_textbox().sendKeys(shared_secret);
  
}

@Given("click on close add store pop up")
public void click_on_close_add_store_pop_up() {
    
    addStore.close_add_store();
    
}






}
