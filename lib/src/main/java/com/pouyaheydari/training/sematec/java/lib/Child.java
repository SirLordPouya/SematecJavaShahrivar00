package com.pouyaheydari.training.sematec.java.lib;

public class Child extends Parent {


    public void coding() {
        learn();
        name = "Pouya";
        designation = "Developer";
        printName();
    }

    @Override
    public void printName() {
        System.out.println("Mr./Ms. " + name);
    }
}
