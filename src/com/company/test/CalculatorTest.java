package com.company.test;

import com.company.Calculator;
import com.company.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void fillResultList() {
    }

    @Test
    void getLastResult() {
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

    @Test
    void division() {
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

    @Test
    void isFloat() {
    }
}