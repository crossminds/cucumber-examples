package com.crossminds.cucumberexample.service.calculator;

/**
 * The calculator service business interface.
 */
public interface CalculatorService {

    /**
     * Calculate the sum of two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     *
     * @return The sum of both integers.
     */
    int sum(int a, int b);

    /**
     * Apply a crazy function to three integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     *
     * @return The result of the crazy function.
     */
    int crazyOperation(int a, int b, int c);
}
