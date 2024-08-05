Feature: SPE Login page feature

  @Sanity @Login  @Shopify
  Scenario: Verify Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Login"

  @Sanity @Login  @Shopify
  Scenario: Verify Forgot Password link
    Given user is on login page
    Then forgot your password link should be displayed
    And Remember me check box should be displayed
    And Register an account link should be displayed

  @Sanity @Login  @Shopify
  Scenario: Verify successful Login to SPE Application
    Given user is on login page
    When user enters valid username and password
    And click on sign in button
    Then SendPro Enterprise home page should open
