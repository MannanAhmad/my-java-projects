package com.gyanwithmannan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hambarger hamburger = new Hambarger("Normal","Chicken",2.34,"Brownbread");
//        hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("cheese",.34);
        hamburger.addHamburgerAddition2("lattes",.21);
        hamburger.addHamburgerAddition3("tomato",1.23);
        hamburger.addHamburgerAddition4("pickle",.12);
        hamburger.itemizedHamburger();
        System.out.format("Total price is "+hamburger.itemizedHamburger()+"$.\n");

        Healthyburger healthyburger = new Healthyburger("Mutton",3.49);
//        healthyburger.addHamburgerAddition2("egg",2.34);
        healthyburger.addHealthyItem1ToHamburger("egg",2.13);
        healthyburger.itemizedHamburger();
        System.out.format("Total Healthy burger price is "+healthyburger.itemizedHamburger()+"$.\n");


    }
}
