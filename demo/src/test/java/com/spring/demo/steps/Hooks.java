package com.spring.demo.steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.io.IOException;


public class Hooks {

    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;


    @Before
    public void InitializeTest(Scenario scenario){
           webDriver.navigate().to(appUrl);
    }




    @After
    public void TearDownTest(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            File src= ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(src,new File("PageScreenshot.png"));
            System.out.println(scenario.getName());
        }


    }




}
