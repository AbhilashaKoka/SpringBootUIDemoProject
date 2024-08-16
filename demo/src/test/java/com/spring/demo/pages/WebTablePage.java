package com.spring.demo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WebTablePage extends BasePage {


    @FindBy(how = How.XPATH, using = "//*[@class=\"category-cards\"]//following::div[@class=\"card-body\"]//h5[contains(text(),\"Elements\")]")
    private WebElement Elements_frame;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Web Tables\")]")
    private WebElement WebTable_Span;

    @FindBy(how = How.XPATH, using = "//input[@id=\"searchBox\"]")
    private WebElement Search_Box;

    @FindBy(how = How.XPATH, using = "//Button[@id=\"addNewRecordButton\"]")
    private WebElement add_Button;

    @FindBy(how = How.XPATH, using = "//span[@id=\"edit-record-1\"]")
    private WebElement edit_button;

    @FindBy(how = How.XPATH, using = "//span[@id=\"delete-record-1\"]")
    private WebElement delete_Button;

    @FindBy(how = How.XPATH, using = "//div[@class='rt-table']")
    private WebElement table_name;

    @FindBy(how = How.XPATH, using = "//div[@class='rt-thead -header']")
    private WebElement Table_Header;

    @FindBy(how = How.XPATH, using = "//div[@class='rt-tbody']")
    private WebElement table_Body;
    @FindBy(how = How.XPATH, using = "//div[@class='rt-tr-group']")
    private List<WebElement> Row_Group;
    @FindBy(how = How.XPATH, using = " //div[@class='rt-td']")
    private List<WebElement> table_row;

    @FindBy(how = How.XPATH, using = "//div[@class=\"modal-content\"]//div/div[contains(text(), \"Registration Form\")]")
    private WebElement Registration_Modal;



    @FindBy(how = How.XPATH, using = "//div[@class=\"action-buttons\"]//span[@title=\"Edit\"]")
    private WebElement edit_button_Row;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
    private WebElement submit_Button;

    public  void SearchByName(){
        scrollWindow();
        scrollWindowUp(Elements_frame);
        Elements_frame.click();
        WebTable_Span.click();
         Search_Box.sendKeys("Kierra", Keys.ENTER);
         scrollWindow();
        for(WebElement row:table_row)
        {
            row.findElement(By.xpath("//div[@class=\"action-buttons\"]//span[@title=\"Edit\"]")).click();
            MoveToElement(Registration_Modal);
            break;
        }

        submit_Button.submit();
    }
}
