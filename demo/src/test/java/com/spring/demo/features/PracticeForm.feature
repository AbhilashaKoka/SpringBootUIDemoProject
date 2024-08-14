Feature:Checking PracticeForm Submission functionality


  Scenario: Verify Practice Form Submission with valid values
    Given I am in from landing page
    When I fill all valid credential and click on submit
      |FirstName|LastName|Gender|Email|Mobile|DOB|Subject|Hobbies|CurrentAddr|State|City|
      |Sita|Kumari|Female|sita.kumari@gmail.com|9142343241|28 JUN 1983|Computer Science |Reading|Pune, Maharastra 412121 |Uttar Pradesh|Lucknow|
    Then I am able to verify form details successfully
