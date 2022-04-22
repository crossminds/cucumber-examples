package com.crossminds.cucumberexample.feature;

import com.crossminds.cucumberexample.configuration.TestConfiguration;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

/**
 * The Cucumber tests runner.
 *
 * It's important for the class to implement <code>GlueBase</code> for Cucumber to process the <code>@ContextConfiguration</code> annotation.
 */
@RunWith(Cucumber.class)
@CucumberOptions(glue = {
            "com.crossminds.cucumberexample.configuration",
            "com.crossminds.cucumberexample.feature",
            "com.crossminds.cucumberexample.service.calculator"},
        features = {
            "classpath:/calculator"
        },
        plugin = {"pretty",
                "html:target/cucumber-html-report", "json:target/cucumber-json-reports/cucumber-calculator-json-report.json"
        })
@ContextConfiguration(classes = TestConfiguration.class)
@CucumberContextConfiguration
public class RunCucumberTest {
}
