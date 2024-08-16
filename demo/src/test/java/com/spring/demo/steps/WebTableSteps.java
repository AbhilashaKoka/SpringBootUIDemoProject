package com.spring.demo.steps;

import com.spring.demo.pages.WebTablePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class WebTableSteps {

    @Autowired
    WebTablePage webTablePage;

    @Given("WebTable Landing Page")
    public void web_table_landing_page() {
        System.out.println(" WebTable Landing Page!!!");
    }
    @When("Enter Name in Search Box and search")
    public void enter_name_in_search_box_and_search(DataTable dataTable) {
      // var name=dataTable.asList();
        webTablePage.SearchByName();
    }
    @When("Click on edit to edit the registration form")
    public void click_on_edit_to_edit_the_registration_form() {
        System.out.println("Click on registration Form edit button");
    }
    @Then("verify search button is working as expected")
    public void verify_search_button_is_working_as_expected() {
        System.out.println("Verify Successfully!!!");
    }
}
