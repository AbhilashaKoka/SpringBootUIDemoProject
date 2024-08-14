package com.spring.demo.steps;

import com.spring.demo.pages.UploadAndDownloadPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class UploadAndDownloadSteps {

    @Autowired
    UploadAndDownloadPage uploadAndDownloadPage;

    @Given("On the Landing Page")
    public void on_the_landing_page() {
        System.out.println("User is on the Landing Page!!!");
    }
    @When("User click on download and upload button and click submit button")
    public void user_click_on_download_and_upload_button_and_click_submit_button() throws InterruptedException {
        uploadAndDownloadPage.HandlingUploadAndDownload();

    }
    @Then("user should able to verify the UploadAndDownload button is working as expected")
    public void user_should_able_to_verify_the_upload_and_download_button_is_working_as_expected() {
        System.out.println("User perform  assertion!!");
    }

}
