package com.calc;

import java.util.Scanner;
import java.util.Arrays;

public class Calculator {

    private int solution;
    private static int num1;
    private static int num2;
    private char operators;

    public Calculator() {
        solution = 0;
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);
        // operands.close();
        // operators.close();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int square(int num1) {
        return num1 * num1;
    }

    public int[] getNumbers() {
        Scanner operators = new Scanner(System.in);
        int[] numbers = new int[2];
        System.out.print("\nFirst Number: ");
        numbers[0] = operators.nextInt();
        System.out.print("\nSecond Number: ");
        numbers[1] = operators.nextInt();
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    public String getOperator() {
        Scanner operands = new Scanner(System.in);
        String operator;
        System.out.print("\nOperator (+, -, *, /, sq): ");
        operator = operands.next();
        return operator;
    }

    public void calc(String operator) {
        switch (operator) {
            case ("+"):
                add(num1, num2);
                break;
            case ("-"):
                subtract(num1, num2);
                break;
            case ("*"):
                multiply(num1, num2);
                break;
            case ("/"):
                divide(num1, num2);
                break;
            case ("sq"):
                square(num1);
                break;
        }

    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.getNumbers();
        calc.getOperator();
        calc.calc("*");

    }

}
