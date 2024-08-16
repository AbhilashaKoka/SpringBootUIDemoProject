package com.spring.demo.steps;

import com.spring.demo.pages.ModalDialogPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class ModalDialogSteps {


    @Autowired
    ModalDialogPage modalDialogPage;

    @Given("ModalDialog Landing Page")
    public void modal_dialog_landing_page() {
        System.out.println("ModalDialog landing Page!!");
    }
    @When("Perform ModalDialog action")
    public void perform_modal_dialog_action() throws InterruptedException {
       modalDialogPage.HandlingModal();

    }
    @Then("verify  successfully ModalDialog")
    public void verify_successfully_modal_dialog() {
        System.out.println("Successfully Handles Modal Dialog!!");
    }

}
