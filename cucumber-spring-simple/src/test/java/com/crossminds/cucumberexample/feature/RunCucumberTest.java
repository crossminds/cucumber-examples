package com.crossminds.cucumberexample.feature;

import com.crossminds.cucumberexample.configuration.TestConfiguration;
import cucumber.api.CucumberOptions;
import cucumber.api.java8.GlueBase;
import cucumber.api.junit.Cucumber;
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
        })
@ContextConfiguration(classes = TestConfiguration.class)
public class RunCucumberTest implements GlueBase {
}
