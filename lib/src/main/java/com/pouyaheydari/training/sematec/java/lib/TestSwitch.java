package com.pouyaheydari.training.sematec.java.lib;

public class TestSwitch {

    public static void main(String[] args) {
        int userInput = 10;

        switch (userInput) {
            case 1:
                System.out.println("Setting!");
                break;
            case 2:
                System.out.println("Game!");
                break;
            case 3:
                System.out.println("Tutorial!");
                break;
            case 4:
                System.out.println("Exit!");
                break;
            default:
                System.out.println("Please enter 1-4");
        }
    }
}
