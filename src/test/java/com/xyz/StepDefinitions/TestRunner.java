package com.xyz.StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/Login.feature"
        ,glue="com.xyz.StepDefinitions",
      // plugin={"pretty","html:target/cucumber"},
        dryRun = false,
        monochrome = true
       // tags = {"@Login"}
)
public class TestRunner {
}
