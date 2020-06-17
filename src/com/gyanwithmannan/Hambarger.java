package com.gyanwithmannan;

public class Hambarger {
    private String name;
    private String meat;
    private double price;
    private String typeOfRoll;

    private String additionItem1Name;
    private double additionItem1Price;

    private String additionItem2Name;
    private double additionItem2Price;

    private String additionItem3Name;
    private double additionItem3Price;

    private String additionItem4Name;
    private double additionItem4Price;

    public Hambarger(String name, String meat, double price, String typeOfRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.typeOfRoll = typeOfRoll;
    }

    public void addHamburgerAddition1( String name, double price){
        this.additionItem1Name = name;
        this.additionItem1Price = price;
    }

    public void addHamburgerAddition2( String name, double price){
        this.additionItem2Name = name;
        this.additionItem2Price = price;
    }

    public void addHamburgerAddition3( String name, double price){
        this.additionItem3Name = name;
        this.additionItem3Price = price;
    }

    public void addHamburgerAddition4( String name, double price){
        this.additionItem4Name = name;
        this.additionItem4Price = price;
    }

    public double itemizedHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name +" Hamburger, On a roll "+this.typeOfRoll+" And the price is "+this.price+"$.");

        if(this.additionItem1Name != null){
            hamburgerPrice += this.additionItem1Price;
            System.out.println("Added "+this.additionItem1Name+" with an extra "+this.additionItem1Price+ "$.");
        }
        if(this.additionItem2Name != null){
            hamburgerPrice += this.additionItem2Price;
            System.out.println("Added "+this.additionItem2Name+" with an extra "+this.additionItem2Price+ "$.");
        }
        if(this.additionItem3Name != null){
           hamburgerPrice += this.additionItem3Price;
            System.out.println("Added "+this.additionItem3Name+" with an extra "+this.additionItem3Price+ "$.");
        }
        if(this.additionItem4Name != null){
            hamburgerPrice += this.additionItem4Price;
            System.out.println("Added "+this.additionItem4Name+" with an extra "+this.additionItem4Price+ "$.");
        }
        return hamburgerPrice;
    }
}
