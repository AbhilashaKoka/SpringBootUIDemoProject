package com.spring.demo;
import com.spring.demo.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

@SpringBootTest
public class SpringTestNGTest extends AbstractTestNGSpringContextTests{


    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private MainPage mainPage;

    @BeforeMethod
    protected void setupWebDriver(){
        webDriver.navigate().to(appUrl);
    }

    @Test
    public void testLogin()  {
             mainPage.PerformLogin();

    }

    @Test
    public void testFormSubmit(){
            mainPage.SubmitPracticeForm();
    }


    @BeforeClass(alwaysRun = true)
    @BeforeSuite(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
    super.springTestContextPrepareTestInstance();
    }

}
