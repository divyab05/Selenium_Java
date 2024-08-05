Feature: Verify Print Label Feature of SPE Ecomm Application

  Background: 
    Given user is on login page
    When user enters valid username and password
    And click on sign in button
    Then SendPro Enterprise home page should open
    And user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Order Number" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify when user clicks on first row in search results then print label page should open
    When user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "4668279652592"
    When user clicks first row on search results
    Then Print label page should open with text as "John & Podolski"

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify all mandatory fields should display on Print label page
    When user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "4668279652592"
    When user clicks first row on search results
    Then Print label page should open with text as "John & Podolski"
    And verify "show_results_btn" should be present on the page
    And verify "search_order_input" should be present on the page
    And verify "searchForButton" should be present on the page
    And verify "reset_all_button" should be present on the page
    And verify "select_carrier_dropdown" should be present on the page
    And verify "select_service_dropdown" should be present on the page
    And verify "select_customerPackage_dropdown" should be present on the page
    And verify "input_weight_in_lb" should be present on the page
    And verify "input_weight_in_oz" should be present on the page
    And verify "length_input" should be present on the page
    And verify "width_input" should be present on the page
    And verify "height_input" should be present on the page
    And verify "rate_btn" should be present on the page
    And verify "print_btn" should be present on the page

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify all mandatory fields for Ship To section on Print label page
    When user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "4668279652592"
    When user clicks first row on search results
    Then Print label page should open with text as "John & Podolski"
    And verify "ship_to_attention" should be present on the page
    And verify "ship_to_company" should be present on the page
    And verify "ship_to_addressline1" should be present on the page
    And verify "ship_to_addressline2" should be present on the page
    And verify "ship_to_addressline3" should be present on the page
    And verify "ship_to_state" should be present on the page
    And verify "ship_to_city" should be present on the page
    And verify "ship_to_zipcode" should be present on the page
    And verify "ship_to_country" should be present on the page
    And verify "validate_btn" should be present on the page
    And verify "ship_to_phone" should be present on the page
    And verify "ship_to_email" should be present on the page

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify all mandatory fields for Ship From section on Print label page
    When user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "4668279652592"
    When user clicks first row on search results
    Then Print label page should open with text as "John & Podolski"
    And user clicks on ship from link
    And verify "ship_from_name_input" should be present on the page
    And verify "ship_from_company_input" should be present on the page
    And verify "ship_from_address1" should be present on the page
    And verify "ship_from_address2" should be present on the page
    And verify "ship_from_address3" should be present on the page
    And verify "ship_from_city" should be present on the page
    And verify "ship_from_state" should be present on the page
    And verify "ship_from_zip" should be present on the page
    And verify "ship_from_country" should be present on the page
    And verify "ship_from_phone_input" should be present on the page
    And verify "ship_from_email_input" should be present on the page
    And verify "carrier_account_ship_from" should be present on the page

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify show results button should be enabled and when user clicks on show results button then New order page should display
    When user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "4668279652592"
    When user clicks first row on search results
    Then Print label page should open with text as "John & Podolski"
    And Show Results button should be enabled
    When user clicks on show Results button
    Then New Order page should display

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify Ship To data on print label page
    When user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "4668279652592"
    When user clicks first row on search results
    Then Print label page should open with text as "John & Podolski"
    And verify "ship_to_attention" should display "John Podolski"
    And verify "ship_to_company" should display "John & Podolski"
    And verify "ship_to_addressline1" should display "1951 Carolina Avenue"
    And verify "ship_to_city" should display "RABUN GAP"
    And verify "ship_to_state" should display "GEORGIA"
    And verify "ship_to_zipcode" should display "30568"
    And verify "ship_to_country" should display "UNITED STATES"
    And verify "ship_to_phone" should display "+17069427185"
    And verify "ship_to_email" should display "john_podl@yopmail.com"

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify user should able to rate transaction
    When user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "4668279652592"
    When user clicks first row on search results
    Then Print label page should open with text as "John & Podolski"
    And user checks  "1" in "input_weight_in_lb" field
    And user checks  "900" in "input_weight_in_oz" field
    And user enters "1" in "length_input" field
    And user enters "1" in "width_input" field
    And user enters "1" in "height_input" field
    And verify rate button should be enabled
    And user selects Carrier as "UPS API"
    When user clicks on rate button
    Then total cost should get displayed in Shipping Summary section

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify user should able to Print transaction
    When user enters text from Search for value
      | data          |
      | 4656807575792 |
    And User clicks on Add button
    And user clicks on Search button
    And user verify that order number "4668279652592" exists after sync order
    Then verify "Order Number" column should show "4668279652592"
    When user clicks first row on search results
    Then Print label page should open with text as "John & Podolski"
    And user checks  "1" in "input_weight_in_lb" field
    And user checks  "900" in "input_weight_in_oz" field
    And user enters "1" in "length_input" field
    And user enters "1" in "width_input" field
    And user enters "1" in "height_input" field
    And verify rate button should be enabled
    And user selects Carrier as "UPS API"
    When user clicks on rate button
    Then total cost should get displayed in Shipping Summary section
    And verify print button is enabled
    When user clicks on print button
    Then print tab should open
    When user clicks on show result button
    Then Processed Order tab should present
    And user clicks on processed order tab
    Then Processed order tab should open
    And user enters text from Search for package
      | data          |
      | 4668279652592 |
    And user click on search proccesed order button
    Then check the search results should display results for column "Order #" is "4668279652592"

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify Launch view APP button is enabled on processed order tab
    When user clicks on processed order tab on Search Order Page
    Then Processed order tab should open
    And user enters text from Search for package
      | data          |
      | 4668279652592 |
    And user click on search proccesed order button
    Then check the search results should display results for column "Order #" is "4668279652592"
    And check the launch view APP button is enabled

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify when user clicks on Launch view app button and search already processed order then order should get displayed on search results
    When user clicks on processed order tab on Search Order Page
    Then Processed order tab should open
    And user enters text from Search for package
      | data          |
      | 4668279652592 |
    And user click on search proccesed order button
    Then check the search results should display results for column "Order #" is "4668279652592"
    And check the launch view APP button is enabled
    When user clicks on launch view APP
    Then view app window should open
    And user enters text to search order in view app
      | data          |
      | 4668279652592 |
    Then user click on search view app button
    Then check the search results of view app should display results for column "Order #" is "4668279652592"

  @PrintLabel @Sanity  @Shopify
  Scenario: Verify when user rate and print the transaction it should get removed from New order
    When user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify no rows should be displayed in Search Results
    
    
   @PrintLabelWooCommerce @WooCommerce
  Scenario: Verify Ship To data on print label page for WooCommerce
  	And user verify that column "Order Number" as "206" exists after sync order for "Order Number"
    Then verify "Order Number" column should show "206"
    When user clicks first row on search results
    Then Print label page should open with text as "Harvey Publication"
    And verify "ship_to_attention" should display "William Harvey"
    And verify "ship_to_company" should display "Harvey Publication"
    And verify "ship_to_addressline1" should display "4 Pennsylvania Plaza, New York, NY"
    And verify "ship_to_city" should display "Newyork"
    And verify "ship_to_state" should display "NEW YORK"
    And verify "ship_to_zipcode" should display "10001"
    And verify "ship_to_country" should display "UNITED STATES"
    And verify "ship_to_phone" should display "2128920292"
    And verify "ship_to_email" should display "manjitkumar.dahiya@pb.com"
    
    @PrintLabelWooCommerce @WooCommerce
  Scenario: Verify user should able to rate transaction for WooCommerce order
    And user verify that column "Order Number" as "206" exists after sync order for "Order Number"
    Then verify "Order Number" column should show "206"
    When user clicks first row on search results
    Then Print label page should open with text as "Harvey Publication"
    #And user checks  "2" in "input_weight_in_lb" field
    And user checks  "081" in "input_weight_in_oz" field
    And user enters "1" in "length_input" field
    And user enters "1" in "width_input" field
    And user enters "1" in "height_input" field
    And verify rate button should be enabled
    And user selects Carrier as "UPS API"
    When user clicks on rate button
    Then total cost should get displayed in Shipping Summary section
    
    
     @PrintLabelWooCommerce @WooCommerce
  Scenario: Verify user should able to Print transaction for WooCommerce
    And user verify that column "Order Number" as "207" exists after sync order for "Order Number"
    Then verify "Order Number" column should show "207"
    When user clicks first row on search results
    Then Print label page should open with text as "Harvey Publication"
    And user checks  "2" in "input_weight_in_lb" field
    And user checks  "844" in "input_weight_in_oz" field
    And user enters "1" in "length_input" field
    And user enters "1" in "width_input" field
    And user enters "1" in "height_input" field
    And verify rate button should be enabled
    And user selects Carrier as "FedEx Web Services"
    When user clicks on rate button
    Then total cost should get displayed in Shipping Summary section
    And verify print button is enabled
    When user clicks on print button
    Then print tab should open
    When user clicks on show result button
    Then Processed Order tab should present
    And user clicks on processed order tab
    Then Processed order tab should open
    And user enters text from Search for package
      | data          |
      | 207 |
    And user click on search proccesed order button
    Then check the search results should display results for column "Order #" is "207"
    
    
     @PrintLabelWooCommerce @Sanity @WooCommerce
  Scenario: Verify Launch view APP button is enabled on processed order tab
    When user clicks on processed order tab on Search Order Page
    Then Processed order tab should open
    And user enters text from Search for package
      | data          |
      | 208 |
    And user click on search proccesed order button
    Then check the search results should display results for column "Order #" is "208"
    And check the launch view APP button is enabled

  @PrintLabelWooCommerce  @Sanity @WooCommerce
  Scenario: Verify when user clicks on Launch view app button and search already processed order then order should get displayed on search results
    When user clicks on processed order tab on Search Order Page
    Then Processed order tab should open
    And user enters text from Search for package
      | data          |
      | 208 |
    And user click on search proccesed order button
    Then check the search results should display results for column "Order #" is "208"
    And check the launch view APP button is enabled
    When user clicks on launch view APP
    Then view app window should open
    And user enters text to search order in view app
      | data          |
      | 208 |
    Then user click on search view app button
    Then check the search results of view app should display results for column "Order #" is "208"

  @PrintLabelWooCommerce @Sanity @WooCommerce
  Scenario: Verify when user rate and print the transaction it should get removed from New order
    When user enters text from Search for value
      | data          |
      | 208 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify no rows should be displayed in Search Results
    
    
