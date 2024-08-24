Feature: Checking ModalDialog Functionality

  @skip_scenario
  Scenario: Verifying ModalDialog with valid values
    Given ModalDialog Landing Page
    When  Perform ModalDialog action
    Then verify  successfully ModalDialog