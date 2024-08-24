package com.spring.demo.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features={"D:\\Users\\akoka\\IdeaProjects\\demo\\demo\\src\\test\\java\\com\\spring\\demo\\features"},
        glue={"com.spring.demo.steps"},
        tags="not @skip_scenario",
        plugin={"pretty","json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt"},
        publish=true
)
public class TestRunner extends AbstractTestNGCucumberTests {


    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
