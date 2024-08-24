Feature: Checking UploadAndDownload Functionality

  @skip_scenario
  Scenario: Verifying UploadAndDownload  with valid values
    Given On the Landing Page
    When User click on download and upload button and click submit button
    Then user should able to verify the UploadAndDownload button is working as expected
