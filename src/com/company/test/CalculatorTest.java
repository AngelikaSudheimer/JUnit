package com.company.test;

import com.company.Calculator;
import com.company.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void fillResultList() throws DivideByZeroException {
        List results = new ArrayList();

        results.add(calculator.add(2, 3));
        results.add(calculator.subtraction(3,6));
        results.add(calculator.division(98, 3));
        results.add(calculator.multiplication(6, 3));

        List calculatorResultList = calculator.getResults();

        for (int i = 0; i < results.size(); i++) {
            assertEquals(results.get(i), calculatorResultList.get(i));
        }
    }

    @Test
    void getLastResult() {
        calculator.add(2, 3);
        calculator.subtraction(3,6);

        assertEquals(-3, calculator.getLastResult());
    }

    @Test
    void add() {
        double result = calculator.add(2, 3);
        assertEquals(2+3, result);
    }

    @ParameterizedTest
    @ValueSource(doubles = {2, 7, 9, 323, 8})
    void subtraction(double number) {
        double result = calculator.subtraction(number, number);
        assertEquals(number - number, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"2, 9", "283.6, 94"})
    void multiplication(double number, double number2) {
        double result = calculator.multiplication(number, number2);
        assertEquals(number * number2, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"2, 9", "283.6, 94"})
    void division(double number, double number2) throws DivideByZeroException {
        double result = calculator.division(number, number2);
        assertEquals(number / number2, result);
    }

    @Test
    void divideByZero() {
        Assertions.assertThrows(DivideByZeroException.class, () -> calculator.division(2, 0));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 8, 45, 2, 98, 4})
    void isEvenNumber(int number) {
        if (number % 2 == 0) {
            assertTrue(calculator.isEvenNumber(number));
        } else {
            assertFalse(calculator.isEvenNumber(number));
        }
    }

    @ParameterizedTest
    @ValueSource(doubles = {3, 8, 45, 2, 98, 4})
    void isFloat(double number) {
        int dec = (int)number;
        if (number - dec != 0) {
            assertFalse(calculator.isFloat(number));
        } else {
            assertTrue(calculator.isFloat(number));
        }
    }
}