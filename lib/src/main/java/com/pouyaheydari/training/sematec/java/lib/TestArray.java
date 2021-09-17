package com.pouyaheydari.training.sematec.java.lib;

import java.util.ArrayList;

public class TestArray {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Pouya Heydari");
        names.add("Alireza Khojasteh");
        names.add("Farnoosh Farhadi");
        names.add("Hossein Rashid");
        names.add("Mina Rajabi");



        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }
    }
}
