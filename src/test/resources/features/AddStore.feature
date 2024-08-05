Feature: Verify Add Shopify Store Feature

  Background: 
    Given user is on login page
    When user enters valid username and password
    And click on sign in button
    Then SendPro Enterprise home page should open

  @Sanity @AddShopifyStore @Shopify
  Scenario: Verify user is able to select shopify store from Select Store dropdown
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    Then "Store URL" textbox should be displayed
    And "API Key" textbox should be displayed
    And "API Password" textbox should be displayed
    And "Shared Secret" textbox should be displayed

  @AddShopifyStore @Sanity  @Shopify
  Scenario: Verify text of shopify store labels Add Store pop up window
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    Then "Store URL" label should be displayed
    And "API Key" label should be displayed
    And "API Password" label should be displayed
    And "Shared Secret" label should be displayed

  @AddShopifyStore @Sanity  @Shopify
  Scenario: Verify text of shopify hover icons Add Store pop up window
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    Then "Shopify store url" label should be displayed on question mark icon
    And "Shopify store API key" label should be displayed on question mark icon
    And "Shopify store API password" label should be displayed on question mark icon
    And "Shopify store shared secret key" label should be displayed on question mark icon

  @AddShopifyStore @Sanity  @Shopify
  Scenario: Validate Error message when user click on register button without entering required shopify details
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    And Click on Register button
    Then "Shopify storeUrl can't be blank" error message should display
    
      @AddShopifyStore @Sanity  @Shopify
  Scenario: Validate Onboarding success message when user onboard the shopify store and validate new store should be displayed on view store
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    And user enters Shopify onboard details
      | store_url                         | api_key                          | api_password                           | shared_secret                          |
      | https://pbecommtest.myshopify.com | 8977e1cfb717f01c30e42c60b4a2c160 | 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 | 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 |
    And Click on Register button
    Then Onboard Shopify Success Response should recieved
    When user clicks "View Store" button
    Then View Store Modal pop up should open
    And verify disconnect store button is enabled
    And verify shopify store added in the list
    And Click on Disconnect Store button
    And disconnect shopify store response should received
  

  @AddShopifyStore @Sanity  @Shopify
  Scenario: Validate Error message when user enters blank api key and click on register button
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    And user enters Shopify onboard details
      | store_url                        | api_key                          | api_password                           | shared_secret                          |
      | https://pboldstore.myshopify.com | e536e2f08d2a7c16807c825ae33a6cc6 | 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 | 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 |
    And user clears "api_key" field
    And Click on Register button
    Then "Shopify apiKey can't be blank" error message should display

  @AddShopifyStore @Sanity  @Shopify
  Scenario: Validate Error message when user enters blank api password and click on register button
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    And user enters Shopify onboard details
      | store_url                        | api_key                          | api_password                           | shared_secret                          |
      | https://pboldstore.myshopify.com | e536e2f08d2a7c16807c825ae33a6cc6 | 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 | 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 |
    And user clears "api_password" field
    And Click on Register button
    Then "Shopify apiPassword can't be blank" error message should display

  @AddShopifyStore @Sanity  @Shopify
  Scenario: Validate Error message when user enters blank shared secret and click on register button
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    And user enters Shopify onboard details
      | store_url                        | api_key                          | api_password                           | shared_secret                          |
      | https://pboldstore.myshopify.com | e536e2f08d2a7c16807c825ae33a6cc6 | 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 | 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 |
    And user clears "shared_secret" field
    And Click on Register button
    Then "Shopify sharedSecret can't be blank" error message should display

  @AddShopifyStore @Sanity  @Shopify
  Scenario: Verify fields should not getting cleared when user fails to enter any of the field and click on register button
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    And user enters Shopify onboard details
      | store_url                        | api_key                          | api_password                           | shared_secret                          |
      | https://pboldstore.myshopify.com | e536e2f08d2a7c16807c825ae33a6cc6 | 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 | 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 |
    And user clears "api_password" field
    And Click on Register button
    Then "Shopify apiPassword can't be blank" error message should display
    And user checks the existing field should not be blank

  @AddShopifyStore @Sanity  @Shopify
  Scenario: Verify fields should not getting cleared when user enters any of the field  as invalid and click on register button
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    And user enters Shopify onboard details
      | store_url                        | api_key                          | api_password | shared_secret                          |
      | https://pboldstore.myshopify.com | e536e2f08d2a7c16807c825ae33a6cc6 | shjs         | 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 |
    And Click on Register button
    Then "Invalid credentials specified or scope not approved by merchant. Shopify Error: [API] Invalid API key or access token (unrecognized login or wrong password)" error message should display
    And user checks the existing field should not be blank

  @AddShopifyStore @Sanity  @Shopify
  Scenario: Validate Error message when user enters invalid store url and register shopify store
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    And user enters Shopify onboard details
      | store_url | api_key                          | api_password                           | shared_secret                          |
      | agshs     | e536e2f08d2a7c16807c825ae33a6cc6 | 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 | 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 |
    And Click on Register button
    Then "'shop' must be in the format {shop.myshopify.com}" error message should display
  
    
  @AddShopifyStore @Sanity  @Shopify
  Scenario Outline: Validate user is successfully able to onboard multiple shopify stores
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed
    When user selects "Shopify" store from dropdown
    And user enters "<store_url>" and "<api_key>" and "<api_password>" and "<shared_secret>"
    And Click on Register button
    Then Onboard Shopify Success Response should recieved
    And click on close add store pop up

    Examples: 
      | store_url                               | api_key                          | api_password                           | shared_secret                          |
      | https://pboldstore.myshopify.com        | e536e2f08d2a7c16807c825ae33a6cc6 | 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 | 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 |
     	| https://pbtestautomation.myshopify.com| 6afb2f165478b1032b0ce8268b791cab | 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 | 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 |
    
    
  #@AddShopifyStore
  #	Scenario: Validate Error message when user enters invalid api key and register shopify store
  #Given user is on SendPro Enterprise home Page
  #When user clicks "Add Store" button
  #Then Add Store Modal pop up should open
  #And Select Store Label should be displayed
  #And Select Store dropdwon should be displayed
  #When user selects "Shopify" store from dropdown
  #And user enters Shopify onboard details
  #|store_url|api_key|api_password|shared_secret|
  #|https://pbtestautomation.myshopify.com|addjd|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|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|
  #And Click on Register button
  #Then "Invalid credentials specified or scope not approved by merchant. Shopify Error: [API] Invalid Username provided for Basic Auth API access" error message should display
  #
  #
