package com.udacity.jdnd.course1.service;

public class FizzBuzzService {

    /**
     * If number is divisible by 3, return "Fizz". If divisible by 5,
     * return "Buzz", and if divisible by both, return "FizzBuzz". Otherwise,
     * return the number itself.
     *
     * @Throws IllegalArgumentException for values < 1
     */
    public String fizzBuzz(int number) {
        StringBuilder sb = new StringBuilder();
        if (number % 3 == 0) sb.append("Fizz");
        if (number % 5 == 0) sb.append("Buzz");
        return sb.toString().equals("") ? Integer.toString(number) : sb.toString();
    }
}
