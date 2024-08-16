Feature: Checking WebTable Functionality


  Scenario: Verify WebTable search by valid Name
    Given WebTable Landing Page
    When Enter Name in Search Box and search
          |Name|
         |Kierra|
    And Click on edit to edit the registration form
    And Click on Submit
    Then verify search button is working as expected
