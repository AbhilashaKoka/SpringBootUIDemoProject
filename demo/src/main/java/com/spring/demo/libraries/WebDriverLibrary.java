package com.spring.demo.libraries;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;


@Configuration
@Profile("!remote")
public class WebDriverLibrary {

    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "chrome")
    @Scope("driverScope")
    public WebDriver getChromeDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        // Enable headless mode if CHROME_HEADLESS environment variable is set
        String headlessEnv = System.getenv("CHROME_HEADLESS");
        if ("true".equalsIgnoreCase(headlessEnv)) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
        }

        return new ChromeDriver(options);
    }

    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "edge")
    public WebDriver getFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new EdgeDriver();
    }




}
