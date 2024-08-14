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
public class PracticeFormPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//*[@class=\"category-cards\"]//following::div[@class=\"card-body\"]//h5[contains(text(),\"Forms\")]")
    private WebElement Frame_forms;

    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Practice Form\")]")
    private WebElement Options_PracticeForms;

    @FindBy(how = How.XPATH, using = "//*[@class=\"practice-form-wrapper\"]")
    private WebElement Wrapper_PracticeForm;

    @FindBy(how = How.XPATH, using = "//*[@id=\"firstName\"]")
    private WebElement InputBox_FirstName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"lastName\"]")
    private WebElement InputBox_LastName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"userEmail\"]")
    private WebElement InputBox_Email;

    @FindBy(how = How.XPATH, using = "//*[@id=\"genterWrapper\"]//following::label[contains(text(),\"Male\")]//preceding-sibling::input[@name=\"gender\"]")
    private WebElement RadioButton_Male;
    @FindBy(how = How.XPATH, using = "//*[@id=\"userNumber\"]")
    private WebElement Inputbox_Mobile;
    @FindBy(how = How.XPATH, using = "//*[@id=\"dateOfBirthInput\"]")
    private WebElement Inputbox_DateOfBirth;
    @FindBy(how = How.XPATH, using = "//div[@class=\"subjects-auto-complete__input\"]/input[@type=\"text\"]")
    private WebElement Inputbox_Subject;
    @FindBy(how = How.XPATH, using ="//div[@id=\"hobbiesWrapper\"]//label[contains(text(),\"Reading\")]//preceding-sibling::input")
    private WebElement CheckBox_Hobbies;
    @FindBy(how = How.XPATH, using ="//*[@id=\"uploadPicture\" and @type=\"file\"]")
    private WebElement Upload_Picture;
    @FindBy(how = How.XPATH, using ="//textArea[@id=\"currentAddress\"]")
    private WebElement TextArea_CurrentAdress;
    @FindBy(how = How.XPATH, using ="//input[@id=\"react-select-3-input\"]")
    private WebElement DropDown_States;
    @FindBy(how = How.XPATH, using ="//*[@id=\"react-select-4-input\"]")
    private WebElement DropDown_City;
    @FindBy(how = How.XPATH, using ="//*[@id=\"submit\"]")
    private WebElement submitButton;

    @FindBy(how = How.XPATH, using ="//*[@class=\"modal-dialog modal-lg\"]")
    private WebElement ModalBox;

    @FindBy(how = How.XPATH, using =" //*[@class=\"modal-dialog modal-lg\"]/div/div[3]/button[@type=\"button\"]")
    private WebElement Button_ModalBoxClose;
    @FindBy(how = How.XPATH, using ="//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr")
    private List<WebElement> Table_Coloumn;

    @FindBy(how = How.XPATH, using ="//*[@class=\"category-cards\"]//following::div[@class=\"card-body\"]//h5[contains(text(),\"Forms\")]")
    private WebElement Frame_formFrames;
    @FindBy(how = How.XPATH, using ="//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Practice Form\")]")
    private WebElement PracticeForms;



    public void SubmitPracticeForm() {
        scrollWindowUp(Frame_formFrames);
        Frame_formFrames.click();
        PracticeForms.click();
        scrollWindowUp(InputBox_FirstName);

        InputBox_FirstName.sendKeys("xyz", Keys.TAB);
        InputBox_LastName.sendKeys("ABC", Keys.TAB);
        InputBox_Email.sendKeys("XYZ@gmail.com", Keys.TAB);
        scrollWindowUp(RadioButton_Male);

        if(!RadioButton_Male.isSelected()){
            MoveToElement(RadioButton_Male);
            RadioButton_Male.sendKeys(Keys.TAB);
        }
        scrollWindowUp(Inputbox_Mobile);

        Inputbox_Mobile.sendKeys("90249234234", Keys.TAB);
        scrollWindowUp(Inputbox_DateOfBirth);

        Inputbox_DateOfBirth.sendKeys("25 JAN 2024", Keys.TAB, Keys.ENTER, Keys.TAB);
        scrollWindowUp(Inputbox_Subject);

        Inputbox_Subject.sendKeys("Computer Science",Keys.TAB, Keys.TAB);
        scrollWindowUp(CheckBox_Hobbies);

        if(!CheckBox_Hobbies.isSelected()) {
            MoveToElement(CheckBox_Hobbies);
            CheckBox_Hobbies.sendKeys(Keys.TAB, Keys.TAB);
        }

        Upload_Picture.sendKeys("D:\\Users\\akoka\\Downloads\\sampleFile.jpeg");
        scrollWindowUp(TextArea_CurrentAdress);
        TextArea_CurrentAdress.sendKeys("adafafdhdlhdgl",Keys.TAB);
        DropDown_States.sendKeys("Uttar Pradesh", Keys.TAB,Keys.TAB);
        DropDown_City.sendKeys("Agra",Keys.TAB,Keys.TAB);
        submitButton.submit();
    }


    public void HandlingModalBox()
    {
        scrollWindowUp(ModalBox);

        for(WebElement rows:Table_Coloumn) {
            String str1 = rows.findElement(By.xpath("td[1]")).getAttribute("innerText");
            String str2 = rows.findElement(By.xpath("td[2]")).getAttribute("innerText");
            System.out.println(str1 + ":" + str2);
        }

        Button_ModalBoxClose.sendKeys(Keys.ESCAPE);


    }
}





