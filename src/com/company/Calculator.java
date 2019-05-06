package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List results;

    public Calculator() {
        results = new ArrayList();
    }

    public List getResults() {
        return results;
    }

    public double getLastResult() {
        return (double)results.get(results.size()-1);
    }

    public double add(double a, double b) {
        double result = a + b;
        results.add(result);
        return result;
    }

    public double subtraction(double a, double b) {
        double result = a - b;
        results.add(result);
        return result;
    }

    public double multiplication(double a, double b) {
        double result = a * b;
        results.add(result);
        return result;
    }

    public double division(double a, double b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        double result = a / b;
        results.add(result);
        return result;
    }

    public boolean isEvenNumber(int a) {
        return a % 2 == 0;
    }

    public boolean isFloat(double a) {
        int dec = (int)a;
        return  (a - dec != 0);
    }
}
