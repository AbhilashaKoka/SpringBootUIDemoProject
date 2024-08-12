package com.spring.demo.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features={"D:\\Users\\akoka\\IdeaProjects\\demo\\demo\\src\\test\\java\\com\\spring\\demo\\features"},
         glue={"com.spring.demo.steps","com.spring.demo.intregration",
                "com.spring.demo.api"},
         tags="not @skip_scenario",
         plugin={"pretty","json:target/cucumber-reports/cucumber.json",
         "html:target/cucumber-reports/cucumber-report.html",
         "rerun:target/rerun.txt"},
         publish=true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
