package com.spring.demo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ModalDialogPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//*[@class=\"category-cards\"]//following::div[@class=\"card-body\"]//h5[contains(text(),\"Alerts, Frame & Windows\")]")
    private WebElement AlertFramesAndWindow_frame;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Modal Dialogs\")]")
    private WebElement ModalDialog_Span;

    @FindBy(how = How.XPATH, using = "//*[@id=\"modalWrapper\"]")
    private WebElement modalWrapper_Span;

    @FindBy(how = How.XPATH, using = "//button[@id=\"showSmallModal\"]")
    private WebElement small_Button;


    @FindBy(how = How.XPATH, using = "//*[@class=\"modal-dialog modal-sm\"]")
    private WebElement modal_Button;


    @FindBy(how = How.XPATH, using = "//*[@id=\"closeSmallModal\"]")
    private WebElement close_Button;

    @FindBy(how = How.XPATH, using = "//*[@id=\"showLargeModal\"]")
    private WebElement large_Button;

    @FindBy(how = How.XPATH, using = "//*[@class=\"modal-dialog modal-lg\"]")
    private WebElement modal1_Button;

    @FindBy(how = How.XPATH, using = " //*[@id=\"closeLargeModal\"]")
    private WebElement close1_Button;


    public  void HandlingModal () throws InterruptedException {
        scrollWindow();
        scrollWindowUp(AlertFramesAndWindow_frame);

        AlertFramesAndWindow_frame.click();
        ModalDialog_Span.click();



        System.out.println(modalWrapper_Span.getAttribute("innerText"));
        scrollWindowUp(small_Button);
        small_Button.click();

        MoveToElement(modal_Button);
        MoveToElement(close_Button);
        close_Button.click();


        Thread.sleep(3000);
        large_Button.click();
         scrollWindow();


        MoveToElement(modal1_Button);
        MoveToElement(close1_Button);
        close1_Button.click();


        //  shutDown();
    }
}
