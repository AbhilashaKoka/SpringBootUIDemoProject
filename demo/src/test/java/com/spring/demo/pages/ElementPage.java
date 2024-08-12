package com.spring.demo.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ElementPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//*[@id='userName']")
    private WebElement UserName;
    @FindBy(how = How.XPATH, using = "//*[@id='userEmail']")
    private WebElement Email;
    @FindBy(how = How.XPATH, using = "//*[@id=\"currentAddress\"]")
    private WebElement CurrentAddr;
    @FindBy(how = How.XPATH, using = "//*[@id='permanentAddress']")
    private WebElement PermanentAddr;
    @FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
    private WebElement SubmitButton;
    @FindBy(how = How.XPATH, using = "//*[@class=\"category-cards\"]//following::div[@class=\"card-body\"]//h5[contains(text(),\"Elements\")]")
    private WebElement Element_frame;
    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Text Box\")]")
    private WebElement TextBox_Span;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Check Box\")]")
    private WebElement CheckBox_Span;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Radio Button\")]")
    private WebElement RadioButton_Span;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Web Tables\")]")
    private WebElement WebTables_Span;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\" Buttons\")]")
    private WebElement Button_Span;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Links\")]")
    private WebElement Links_Span;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Broken Links - Images\")]")
    private WebElement BrokenLinksImages_Span;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Upload and Download\")]")
    private WebElement UploadDownload_Span;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Dynamic Properties\")]")
    private WebElement DynamicProperties_Span;


    public void SubmitUsingTextBoxDetails(){
         scrollWindowUp();
        Element_frame.click();
        TextBox_Span.click();
        UserName.sendKeys("XYZ");
        Email.sendKeys("xyz@gmail.com");
        CurrentAddr.sendKeys("DownTown, GreenStreet Lane43, London");
        PermanentAddr.sendKeys("London,UK", Keys.TAB);
        SubmitButton.submit();
    }





}