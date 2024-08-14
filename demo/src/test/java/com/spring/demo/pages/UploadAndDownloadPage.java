package com.spring.demo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UploadAndDownloadPage  extends BasePage{
    @FindBy(how= How.XPATH,using="//*[@id=\"app\"]/div/div/div/div[2]/div[2]")
    private  WebElement title;
    @FindBy(how= How.XPATH,using="//*[@id=\"downloadButton\"]")
    private  WebElement DownloadButton;
    @FindBy(how= How.XPATH,using="//*[@id=\"uploadFile\"]")
    private  WebElement uploadButton;
    @FindBy(how= How.XPATH,using=" //*[@id=\"uploadedFilePath\"]")
    private WebElement FilePath;
    @FindBy(how = How.XPATH, using = "//*[@class=\"category-cards\"]//following::div[@class=\"card-body\"]//h5[contains(text(),\"Elements\")]")
    private WebElement Element_frame;
    @FindBy(how = How.XPATH, using = "//*[@class=\"accordion\"]//div[@class=\"element-group\"]//following::span[@class=\"text\" and contains(text(),\"Upload and Download\")]")
    private WebElement UploadDownload_Span;


    public  void HandlingUploadAndDownload() throws InterruptedException {
        scrollWindow();
        Element_frame.click();
        UploadDownload_Span.click();
        Path pathOfDownloadFolder = Paths.get(System.getProperty("user.home") + "\\Downloads");
        if (Files.exists(pathOfDownloadFolder) && Files.isDirectory(pathOfDownloadFolder)) {
            System.out.println("Directory Exist!!");
        } else {
            System.out.println("Directory does not exist!!!");
        }
        scrollWindowUp(title);
        DownloadButton.click();
        Thread.sleep(5000);
        File currentFile = new File(System.getProperty("user.home") + "\\Downloads\\sampleFile.jpeg");
        if (currentFile.exists()) {
            System.out.println("File Exist!!");
        } else {
            System.out.println("File does not exist!!!");
        }
        uploadButton.sendKeys(System.getProperty("user.home") + "\\Downloads\\sampleFile.jpeg");

    }
}
