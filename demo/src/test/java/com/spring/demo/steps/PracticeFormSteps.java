package com.spring.demo.steps;

import com.github.dockerjava.api.model.Link;
import com.spring.demo.pages.ElementPage;
import com.spring.demo.pages.PracticeFormPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PracticeFormSteps {


    @Autowired
    PracticeFormPage practiceFormPage;


    @Given("I am in from landing page")
    public void i_am_in_from_landing_page() {
        System.out.println("PracticeForm Landing Page!!!");

    }
    @When("I fill all valid credential and click on submit")
    public void i_fill_all_valid_credential_and_click_on_submit(DataTable dataTable)  {
        var data=dataTable.asList();
        String FirstName= data.get(0);
//        String LastName=data.get(1);
//        String Gender=data.get(2);
//        String Email=data.get(3);;
//        String Mobile=data.get(4);
//        String DOB=data.get(5);
//        String Subject=data.get(6);
//        String Hobbies=data.get(7);
//        String CurrentAddr=data.get(8);
//        String State=data.get(9);
//        String City=data.get(10);
          practiceFormPage.SubmitPracticeForm();
    }
    @Then("I am able to verify form details successfully")
    public void i_am_able_to_verify_form_details_successfully() {
        practiceFormPage.HandlingModalBox();

    }


}
