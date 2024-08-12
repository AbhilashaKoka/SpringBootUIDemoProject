Feature: Checking TestBox Functionality


  Scenario: Verifying Textbox login with valid values
    Given User is on Landing Page
    When User enter details username, email, current address, permanent address
    And Click on Submit
    Then user should able to verify the detail on output area
