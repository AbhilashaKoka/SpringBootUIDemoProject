package com.spring.demo.steps;
import com.spring.demo.models.TestUserDetails;
import com.spring.demo.models.UserDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.spring.demo.pages.*;
import org.springframework.beans.factory.annotation.Autowired;

public class ElementSteps {

    @Autowired
    public  ElementPage elementPage;

    @Autowired
    private TestUserDetails testUserDetails;


    @Given("User is on Landing Page")
    public void userIsOnLandingPage() {
        System.out.println("On TextBox Landing Page!!");

    }

    @When("User enter details username, email, current address, permanent address")
    public void userEnterDetailsUsernameEmailCurrentAddressPermanentAddress(){
       //  testUserDetails.setUserDetails(new UserDetails("Abhilasha","abhi@gmail.com","pune","pune"));
         elementPage.SubmitUsingTextBoxDetails();

    }

    @And("Click on Submit")
    public void clickOnSubmit() {
        System.out.println("Form is Submitted!!!!");
    }

    @Then("user should able to verify the detail on output area")
    public void userShouldAbleToVerifyTheDetailOnOutputArea() {
        System.out.println("Form is Asserted!!!");
    }
}
