package com.company;

public interface ArithmeticOperations {
    NumberParams add(NumberParams a, NumberParams b);
    NumberParams subtract(NumberParams a, NumberParams b);
    NumberParams divide(NumberParams a, NumberParams b);
    NumberParams multiply(NumberParams a, NumberParams b);
}