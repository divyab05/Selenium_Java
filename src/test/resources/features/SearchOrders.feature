Feature: Verify Search Order Feature of SPE Ecomm Application

  Background: 
    Given user is on login page
    When user enters valid username and password
    And click on sign in button
    Then SendPro Enterprise home page should open

  @SearchOrder @Sanity   @Shopify
  Scenario: Verify fields dropdown values on Search Order Page
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user clicks on Fields dropdown
    Then fields dropdown should display expected values
      | fields       |
      | Order Number |
      | Source       |
      | Receiver     |

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify Operator dropdown values on Search Order Page
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user clicks on Operator dropdown
    Then Operator dropdown should display expected values
      | fields       |
      | Equal To     |
      | Not Equal To |
      | Starts With  |
      | Ends With    |
      | Contains     |

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user is able to Search using Source as Shopify from Search from Value
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Source" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown
    And user enters text from Search for value
      | data    |
      | Shopify |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Marketplace" column should show "Shopify"

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user is able to Search using Reciever from Search from Value
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
     And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Receiver" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Contains" from the operator dropdown
    And user enters text from Search for value
      | data |
      | John Podolski |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Receiver" column should show "John Podolski"

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user is able to Search using Order Number from Search from Value
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Order Number" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Contains" from the operator dropdown
    And user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "4668279652592"

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user is able to Search using starts with filter from Search from Value
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Order Number" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Starts With" from the operator dropdown
    And user enters text from Search for value
      | data |
      |  466 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show column value starts with "466"

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user is able to Search using ends with filter from Search from Value
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Source" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Ends With" from the operator dropdown
    And user enters text from Search for value
      | data |
      | pify |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Marketplace" column should show column value ends with "pify"

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user is able to Search using Not Equals filter from Search from Value
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user clicks on Fields dropdown
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user selects "Source" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Not Equal To" from the operator dropdown
    And user enters text from Search for value
      | data    |
      | Shopify |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Marketplace" column should not show "Shopify"

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user can search the data with multiple conditions using AND Condition with Receiver field filter and Contains operator
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Receiver" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Contains" from the operator dropdown
    And user enters text from Search for value
      | data |
      | John Podolski |
    And User clicks on Add button
    And verify Condition dropdown should display expected values
      | fields |
      | And    |
      | Or     |
    And user selects "And" from the Condition drodpown
    And user clicks on Fields dropdown
    And user selects "Source" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown
    And user enters text from Search for value
      | data    |
      | Shopify |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Receiver" column should show "John Podolski"
    And verify "Marketplace" column should show "Shopify"

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user can search the data with multiple conditions using AND Condition with OrderNumber field filter and Equals operator
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Order Number" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Starts With" from the operator dropdown
    And user enters text from Search for value
      | data |
      |  466 |
    And User clicks on Add button
    And verify Condition dropdown should display expected values
      | fields |
      | And    |
      | Or     |
    And user selects "And" from the Condition drodpown
    And user clicks on Fields dropdown
    And user selects "Source" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown
    And user enters text from Search for value
      | data    |
      | Shopify |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show column value starts with "466"
    And verify "Marketplace" column should show "Shopify"

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user can search the data with multiple conditions using OR Condition
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Source" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown
    And user enters text from Search for value
      | data    |
      | Shopify |
    And User clicks on Add button
    And verify Condition dropdown should display expected values
      | fields |
      | And    |
      | Or     |
    And user selects "Or" from the Condition drodpown
    And user clicks on Fields dropdown
    And user selects "Receiver" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown
    And user enters text from Search for value
      | data |
      | John Podolski |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Receiver" column should show "John Podolski"
    And verify "Marketplace" column should show "Shopify"

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify when user click on clear button all parameters should reset to default value
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Order Number" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Starts With" from the operator dropdown
    And user enters text from Search for value
      | data |
      |  466 |
    And User clicks on Add button
    And verify Condition dropdown should display expected values
      | fields |
      | And    |
      | Or     |
    And user selects "And" from the Condition drodpown
    And user clicks on Fields dropdown
    And user selects "Source" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown
    And user enters text from Search for value
      | data    |
      | Shopify |
    And User clicks on Add button
    And User clicks on clear button
    Then verify fields dropdown should set to default value
    And operator dropdown should set to default value
    And condition dropdown should set to default value
    And search for value textbox should be set to blank
    And Search Text Area fields should be set to blank

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify Search Results should display less than or equal to 10 records per page
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    Then verify Search order page should display less than or equal to 10 records per page

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user should be able to navigate to the next page when there are more than 10 records
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And Check the order count should be greater than 10
    Then verify next page pagination icon is enabled
    And user clicks on next page

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user is able to navigate to all pages of Search Records
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And Check the order count should be greater than 10
    Then verify next page pagination icon is enabled
    And validate user is able to navigate to all pages

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify user is able to navigate to previous page in Search Records Page
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And Check the order count should be greater than 10
    Then verify next page pagination icon is enabled
    And user clicks on next page
    Then previous page navigation button should be enabled
    And user clicks on previous page button

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify if user is on search results page, show Results button is disabled
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    Then show results button is disabled

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify if user is on search results page, Launch view APP button is disabled
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    Then launch view app button is disabled on "New Order" page

  @SearchOrder @Sanity  @Shopify
  Scenario: Verify No Results found should get displayed when No Results is matched with search criteria
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Order Number" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown
    And user enters text from Search for value
      | data |
      |  000 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify no rows should be displayed in Search Results

  @SearchOrder @Sanity  @Shopify
  Scenario: Validate all column values of a new order created should match with actual values on search results page
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user clicks on Fields dropdown
    And user selects "Order Number" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown
    And user enters text from Search for value
      | data          |
      | 4668279652592 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "4668279652592"
    And verify "Receiver" column should show "John Podolski"
    And verify "Marketplace" column should show "Shopify"
    And verify "Receiver Address Line1" column should show "1951 Carolina Avenue"
    And verify "Receiver City" column should show "RABUN GAP"
    And verify "Receiver State" column should show "GA"
    
   
   @SearchWooCommerceStore @WooCommerce
  Scenario: Verify user is able to Search using Source as woocommerce from Search from Value
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user verify that column "Marketplace" as "WooCommerce" exists after sync order for "Source"
    Then verify "Marketplace" column should show "WooCommerce"
    
    
    @SearchWooCommerceStore @WooCommerce
    Scenario: Verify user is able to Search using order number for woocommerce and validate order details
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder Search tab
    And user enters FromDate
    |FromDate|
    |10/04/2021|
    And user verify that column "Marketplace" as "WooCommerce" exists after sync order for "Source"
    Then verify "Marketplace" column should show "WooCommerce"
    And User clicks on clear button
    And user clicks on Fields dropdown
    And user selects "Order Number" from the fields dropdown
    And user clicks on Operator dropdown
    And user selects "Equal To" from the operator dropdown
    And user enters text from Search for value
      | data          |
      | 206 |
    And User clicks on Add button
    And user clicks on Search button
    Then verify "Order Number" column should show "206"
    And verify "Receiver" column should show "William Harvey"
    And verify "Marketplace" column should show "WooCommerce"
    And verify "Receiver Address Line1" column should show "4 Pennsylvania Plaza, New York, NY"
    And verify "Receiver City" column should show "Newyork"
    And verify "Receiver State" column should show "NY"
    

   