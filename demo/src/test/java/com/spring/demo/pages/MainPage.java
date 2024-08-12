package com.spring.demo.pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@ConditionalOnProperty(name="env",havingValue="qa")
public class MainPage extends BasePage {
    @Autowired
    private ElementPage elementPage;

    @Autowired
    private PracticeFormPage practiceFormPage;



    public void PerformLogin() {
        scrollWindowUp();
        elementPage.SubmitUsingTextBoxDetails();
    }

    public void SubmitPracticeForm(){
        scrollWindowUp();
        practiceFormPage.SubmitPracticeForm( );
        practiceFormPage.HandlingModalBox();
    }


}
