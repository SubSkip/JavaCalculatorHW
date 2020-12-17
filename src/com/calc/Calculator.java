package com.calc;

import java.util.*;

public class Calculator {

    private int solution;
    private int[] numbers;
    private String operator;

    public int add() {
        return numbers[0] + numbers[1];
    }

    public int subtract() {
        return numbers[0] - numbers[1];
    }

    public int multiply() {
        return numbers[0] * numbers[1];
    }

    public int divide() {
        return numbers[0] / numbers[1];
    }

    public int square() {
        return numbers[0] * numbers[0];
    }

    public void getNumbers() {
        Scanner operators = new Scanner(System.in);
        numbers = new int[2];
        System.out.print("\nFirst Number: ");
        numbers[0] = operators.nextInt();
        System.out.print("\nSecond Number: ");
        numbers[1] = operators.nextInt();
        // System.out.println(Arrays.toString(numbers));

    }

    public void getOperator() {
        Scanner operands = new Scanner(System.in);
        // String operator;
        System.out.print("\nOperator (+, -, *, /, sq): ");
        operator = operands.next();
        // System.out.println(operator);

    }

    public int calc() {
        switch (operator) {
            case ("+"):
                solution = add();
                break;
            case ("-"):
                solution = subtract();
                break;
            case ("*"):
                solution = multiply();
                break;
            case ("/"):
                solution = divide();
                break;
            case ("sq"):
                solution = square();
                break;
        }
        return solution;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.getNumbers();
        calc.getOperator();
        System.out.println(calc.calc());

    }

}
