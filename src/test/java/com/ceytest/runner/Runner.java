package com.ceytest.runner;

import com.ceytest.utility.CeyDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "steps",
        strict = true,
        features = {"target/parallel/features/[CUCABLE:FEATURE].feature"},
        plugin = {"json:target/cucumber-report/[CUCABLE:RUNNER].json"}
)
public class Runner {
    // [CUCABLE:CUSTOM:comment]
}
