package com.pouyaheydari.training.sematec.java.lib;

public class TestIf {

    public static void main(String[] args) {
        int age = 50;
        boolean isMale = false;
        boolean isDoctor = false;

        // AND
        if (isMale == true && age >= 18) {
            System.out.println("You are a soldier now!");
        }


        if (age >= 80 || isDoctor == true) {
            System.out.println("Use vaccine!");
        }


        if (age < 4) {
            System.out.println("Infant");
        } else if (age < 10) {
            System.out.println("Kid");
        } else if (age < 20) {
            System.out.println("Teen");
        } else if (age < 50) {
            System.out.println("Young");
        } else if (age < 80) {
            System.out.println("Mid-age");
        } else {
            System.out.println("Old");
        }


    }
}
