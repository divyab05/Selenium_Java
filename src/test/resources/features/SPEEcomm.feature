Feature: Verify SPE Ecomm APP Functionality on SPE

  Background: 
    Given user is on login page
    When user enters valid username and password
    And click on sign in button
    Then SendPro Enterprise home page should open

  @Sanity @EcommHomePage  @Shopify
  Scenario: Verify all the buttons and fields should be properly synchronized on UI
    Given user is on SendPro Enterprise home Page
    Then "Add Store" button is displayed
    And "View Store" button is displayed
    And "Sync Store" button is displayed
    And "Refresh Store" button is displayed

  @Sanity @EcommHomePage  @Shopify
  Scenario: Verify text of all buttons of SPE Ecomm APP on SPE Application
    Given user is on SendPro Enterprise home Page
    Then text of "Add Store" button should be "ADD STORE"
    Then text of "View Store" button should be "VIEW STORE"
    Then text of "Sync Store" button should be "SYNC ORDER"
    Then text of "Refresh Store" button should be "REFRESH"

  @Sanity @EcommHomePage  @Shopify
  Scenario: Verify on click of Add store, pop up window should be open.
    Given user is on SendPro Enterprise home Page
    When user clicks "Add Store" button
    Then Add Store Modal pop up should open
    And Select Store Label should be displayed
    And Select Store dropdwon should be displayed

  @Sanity @EcommHomePage  @Shopify
  Scenario: Verify on click of View Store, pop up window should be open.
    Given user is on SendPro Enterprise home Page
    When user clicks "View Store" button
    Then View Store Modal pop up should open
    And "StoreName" Label should be displayed
    And "Store Key" Label should be displayed
    And "Country Code" Label should be displayed
    And "Action Label" Label should be displayed

  @Sanity @EcommHomePage  @Shopify
  Scenario: Verify all fields in New order section on SPE Application
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder tab
    Then Verify "Search Option" field should be displayed
    And Verify "Condition" field should be displayed
    And Verify "Operator" field should be displayed
    And Verify "Search For Value" field should be displayed
    And Verify "Add Button" field should be displayed
    And Verify "Search Button" field should be displayed
    And Verify "Clear Button" field should be displayed
    And Verify "Search Text Area" field should be displayed

  @Sanity @EcommHomePage  @Shopify
  Scenario: Verify all columns of Search Results table in New order section on SPE Application
    Given user is on SendPro Enterprise home Page
    When user is on NewOrder tab
    Then Verify "Order Number" column should be displayed
    And Verify "Date" column should be displayed
    And Verify "Receiver" column should be displayed
    And Verify "Marketplace" column should be displayed
    And Verify "Receiver Address Line1" column should be displayed
    And Verify "Shipped" column should be displayed
    And Verify "Receiver Address Line2" column should be displayed
    And Verify "Receiver Address Line3" column should be displayed
    And Verify "Receiver City" column should be displayed
    And Verify "Receiver State" column should be displayed
