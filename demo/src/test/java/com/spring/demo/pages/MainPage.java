package com.spring.demo.pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@ConditionalOnProperty(name="env",havingValue="qa")
public class MainPage extends BasePage{

    @Autowired
    private ElementPage elementPage;

    @Autowired
    private PracticeFormPage practiceFormPage;

     @Autowired
    private UploadAndDownloadPage uploadAndDownloadPage;

    @Autowired
    private ModalDialogPage modalDialogPage;


    @Autowired
    private WebTablePage webTablePage;


    public void PerformLogin()  {
        scrollWindow();
        elementPage.SubmitUsingTextBoxDetails();
    }



    public void SubmitPracticeForm() {
        scrollWindow();
        practiceFormPage.SubmitPracticeForm( );
        practiceFormPage.HandlingModalBox();
    }

    public void UploadAndDownload() throws InterruptedException {
        scrollWindow();
        uploadAndDownloadPage.HandlingUploadAndDownload();
    }


    public void ModalDialog() throws InterruptedException {
        scrollWindow();
        modalDialogPage.HandlingModal();
    }

    public void WebTableSearchByName()
    {
        scrollWindow();
        webTablePage.SearchByName();
    }

}
