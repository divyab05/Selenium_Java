Feature: Verify Add WooCommerce Store Feature

  Background: 
    Given user is on login page
    When user enters valid username and password
    And click on sign in button
    Then SendPro Enterprise home page should open

  @Sanity @AddWooCommerceStore @WooCommerce
  Scenario: Verify user is able to select woocommerce store from Select Store dropdown
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Woo-Commerce" store option from dropdown
    Then "Store URL" field should be displayed for woocommerce
    And "Store Key" field should be displayed for woocommerce
    And "On Demand" field should be displayed for woocommerce
    And "Bridge Url" field should be displayed for woocommerce
    And "Store Root" field should be displayed for woocommerce
    
   
    @AddWooCommerceStore @Sanity @WooCommerce
  Scenario: Verify text of WooCommerce store labels Add Store pop up window
     Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Woo-Commerce" store option from dropdown
    Then "Store Url" label should be displayed for woocommerce
    And "Store Key" label should be displayed for woocommerce
    And "On Demand" label should be displayed for woocommerce
    And "Bridge Url" label should be displayed for woocommerce
    And "Store Root" label should be displayed for woocommerce

    
  @AddWooCommerceStore @Sanity @WooCommerce
  Scenario: Verify text of WooCommerce hover icons Add Store pop up window
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Woo-Commerce" store option from dropdown
    Then "WooCommerce store url" label should be displayed on question mark icon for woocommerce
    And "WooCommerce store key" label should be displayed on question mark icon for woocommerce
    And "WooCommerce store is onDemand or not" label should be displayed on question mark icon for woocommerce
    And "WooCommerce store bridge URL" label should be displayed on question mark icon for woocommerce
  	And "WooCommerce store root path" label should be displayed on question mark icon for woocommerce
  	
  	
  @AddWooCommerceStore @Sanity @WooCommerce
  Scenario: Validate Error message when user click on register button without entering required woocommerce store details
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Woo-Commerce" store option from dropdown
    And Click on Register button for woocommerce
    Then "Woocommerce storeURL can't be blank" error message should display on woocommerce add store window
    
    
   
   @AddWooCommerceStore @Sanity @WooCommerce
  Scenario: Validate Error message when user enters blank store key and click on register button
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Woo-Commerce" store option from dropdown
    And user enters WooCommerce onboard details
      | store_url                        | store_key                          | 
      | https://sendprowoocom.azurewebsites.net | 6be51814a60f6543fd3f51d4e4e75804 |
    And user clears "store_key" field for woocommerce
    And Click on Register button for woocommerce
    Then "Storekey can't be blank" error message should display on woocommerce add store window
    
      
   @AddWooCommerceStore @Sanity @WooCommerce
  Scenario: Validate Error message when user enters invalid store key and click on register button
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Woo-Commerce" store option from dropdown
    And user enters WooCommerce onboard details
      | store_url                        | store_key                          | 
      | https://sendprowoocom.azurewebsites.net | ajshjashdjsa |
    And Click on Register button for woocommerce
    Then "The value of parameter 'store_key' contains unacceptable characters; The value must match the pattern '/^[0-9a-z]{32}$/'" error message should display on woocommerce add store window
  
 
  @AddWooCommerceStore @Sanity @WooCommerce
  Scenario: Validate Error message when user enters invalid store url and click on register button
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Woo-Commerce" store option from dropdown
    And user enters WooCommerce onboard details
      | store_url                        | store_key                          | 
      | ajajsssh | c770ee62ef5220408fbc3297a8a3e102 |
    And Click on Register button for woocommerce
    Then "Parameter 'store_url' is not valid. The required type of parameter is valid URL." error message should display on woocommerce add store window
  
 
  @AddWooCommerceStore @Sanity @WooCommerce
  Scenario:  Validate Onboarding success message when user onboard the woocommerce store and validate new store should be displayed on view store
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Woo-Commerce" store option from dropdown
    And user enters WooCommerce onboard details
      | store_url                        | store_key                          | 
      | https://sendprowoocom.azurewebsites.net  | c770ee62ef5220408fbc3297a8a3e102 |
    And Click on Register button for woocommerce
    Then Onboard WooCommerce Success Response should recieved
    When user clicks "View Store" button
    Then View Store Modal pop up should open
    And verify disconnect store button is enabled
    And verify woocommerce store added in the list
    #And Click on Disconnect Store button
    #And disconnect woocommerce store response should received
  
 
 