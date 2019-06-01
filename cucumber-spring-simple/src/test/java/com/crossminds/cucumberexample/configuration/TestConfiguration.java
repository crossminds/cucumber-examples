package com.crossminds.cucumberexample.configuration;

import com.crossminds.cucumberexample.ApplicationConfiguration;
import org.springframework.context.annotation.Import;

/**
 * Tests Spring application context configuration.
 */
@Import(ApplicationConfiguration.class)
public class TestConfiguration {
}
