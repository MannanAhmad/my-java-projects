package com.gyanwithmannan;

public class DeluxeBurger extends Hambarger {
    public DeluxeBurger() {
        super("Deluxe", "Checken & Mutton", 16.34, "big brown");
        super.addHamburgerAddition1("Chips",3.23);
        super.addHamburgerAddition2("Cold drink", 2.12);
    }

    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Can not add extra things to deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add extra things to deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add extra things to deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add extra things to deluxe burger.");
    }
}
