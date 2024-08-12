package com.spring.demo;
import com.spring.demo.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SpringBootTest
public class SpringTestNGTest_Dup extends AbstractTestNGSpringContextTests{


    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private MainPage mainPage;

    @BeforeTest
    protected void setupWebDriver(){

        webDriver.navigate().to(appUrl);
    }

    @Test
    public void testLogin()  {
        mainPage.scrollWindowUp();
        mainPage.PerformLogin();
     //   mainPage.SubmitPracticeForm();
    }


    @BeforeClass(alwaysRun = true)
    @BeforeSuite(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
    super.springTestContextPrepareTestInstance();
    }

}
