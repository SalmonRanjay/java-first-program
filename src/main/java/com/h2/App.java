package com.h2;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int doubleTheNumber(int number) {
        return number * 2;
    }

    private static int add(int[] numbers) {
        return Arrays.stream(numbers).reduce(0, Integer::sum);
//        int sum = 0;
//        for(int num : numbers){sum += num;}
//        return sum;
    }



}
