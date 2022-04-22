package com.crossminds.cucumberexample.service.calculator;

import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This is the Steps class containing Cucumber glue for testing the Calculator service.
 *
 * If a class contains glue annotations or it implements <code>En<code/> the Cucumber will introspect it and evaluate Spring annotations.
 * We also don't have to annotate the Steps class with Spring annotations like <code>@Component</code>.
 */
public class CalculatorSteps implements En {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorSteps(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;

        When("Test that sum\\({int}, {int}) equals {int}", this::testSum);
        When("Test that crazyOperation\\({int}, {int}, {int}) equals {int}", this::testCrazyOperation);
    }

    private void testSum(int argument1, int argument2, int expectedResult) {
        assertThat(calculatorService.sum(argument1, argument2)).isEqualTo(expectedResult);
    }

    private void testCrazyOperation(int argument1, int argument2, int argument3, int expectedResult) {
        assertThat(calculatorService.crazyOperation(argument1, argument2, argument3)).isEqualTo(expectedResult);
    }

}
