package com.template;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if (a > b) return a;
        return b;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        byte[] chars = input.getBytes(StandardCharsets.UTF_8);
        return chars.length;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String[] chars = input.split("");
        StringBuilder reversedChars = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            reversedChars.append(chars[i]);
        }
        return reversedChars.toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        for (int i = 1; i < number; i++) {
            if (i == 1) continue;
            if (number % i == 0) return false;
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++)
            if (array[i] < min) min = array[i];

        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int total = 0;
        for (int j : array) total += j;
        return total;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32.0;
    }
}
