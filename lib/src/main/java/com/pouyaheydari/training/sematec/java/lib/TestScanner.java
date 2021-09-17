package com.pouyaheydari.training.sematec.java.lib;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your birth year:");
        int birthYear = s.nextInt();
        int age = calculateAge(birthYear);
        System.out.println("Your age is: " + age);
    }

    public static int calculateAge(int birthYear) {
        return 2021 - birthYear;
    }
}
