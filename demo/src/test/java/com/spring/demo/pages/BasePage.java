package com.spring.demo.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BasePage {


    @Autowired
    private WebDriver webDriver;

    JavascriptExecutor js;


    Actions action;

    WebElement element;


    @PostConstruct
    public void InitBasePage() {
        PageFactory.initElements(webDriver,this);
    }


    public void navigatePage(String url){
        webDriver.navigate().to(url);
    }


    public void scrollWindow(){
        js=(JavascriptExecutor)webDriver;
        js.executeScript("window.scrollBy(0,300)");
    }


    public void scrollWindowUp(WebElement element){
        js=(JavascriptExecutor)webDriver;
        js.executeScript("window.scrollBy(0,300)",element);
    }

    public void scrollWindowDown(){
        js=(JavascriptExecutor)webDriver;
        js.executeScript("window.scrollBy(0,-300)");
    }

    public void MoveToElement(WebElement element){
        action= new Actions(webDriver);
        action.moveToElement(element).click().perform();

    }



}
