package com.pouyaheydari.training.sematec.java.lib;

public class MyClass {


    int age = 30;
    double pi = 3.14;
    boolean isMale = true;
    boolean isAdult = false;
    String name = "Pouya 12536884866886";
    String address = "asdads asd asd asd asd";
    char c = 'A';

    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println(result);

        int age = calculateAge(1900);
        System.out.println(age);
    }

    public static int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int calculateAge(int birthYear) {
        int result = getCurrentYear() - birthYear;
        return result;
    }

    public static int getCurrentYear() {
        return 2021;
    }

    public void printName() {
        System.out.println("Pouya Heydari");
    }
}


//  /   slash
//  \   back slash
//  -   dash
//  _   underline
//  #   sharp/ number
//  &   ampersand
//  ,   comma
//  .   dot
//  ~   Tilde
//  |   pipeline
//  []  brace
//  {}  curly brace
//  :   colon
//  ;   semi-colon
//  '   Single quotation
//  "   double quotation