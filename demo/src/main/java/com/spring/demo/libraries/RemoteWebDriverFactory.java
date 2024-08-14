package com.spring.demo.libraries;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import java.net.URL;

@Configuration
@Profile("remote")
public class RemoteWebDriverFactory {

    @Value("${grid.url}")
    public URL  gridUrl;


    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "chrome")
    @Scope("driverScope")
    public WebDriver getRemoteWebDriverForChrome(){
        ChromeOptions chromeOptions=new ChromeOptions();
        return new RemoteWebDriver(gridUrl, chromeOptions);
    }

    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "edge")
        public WebDriver getRemoteWebDriverForEdge(){
        EdgeOptions edgeOptions=new EdgeOptions();
        return new RemoteWebDriver(gridUrl, edgeOptions);
    }
}
