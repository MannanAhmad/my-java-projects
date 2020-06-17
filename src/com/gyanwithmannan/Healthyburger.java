package com.gyanwithmannan;

public class Healthyburger extends Hambarger{
    private String addHealthyItem1Name;
    private double addHealthyItem1Price;

    private String addHealthyItem2Name;
    private double addHealthyItem2Price;

    public Healthyburger(String meat, double price) {
        super("Healty", meat, price, "brown rye bread");

    }
    public void addHealthyItem1ToHamburger(String name, double price){
        this.addHealthyItem1Name = name;
        this.addHealthyItem1Price = price;
    }
    public void addHealthyItem2ToHamburger(String name, double price){
        this.addHealthyItem2Name = name;
        this.addHealthyItem2Price = price;
    }
    @Override
    public double itemizedHamburger(){
        double hamburgerPrice = super.itemizedHamburger();
        //System.out.println(super.name +" Hamburger, On a roll "+this.typeOfRoll+" And the price is "+this.price+"$.");

        if(this.addHealthyItem1Name != null){
            hamburgerPrice += this.addHealthyItem1Price;
            System.out.println("Added "+this.addHealthyItem1Name+" with an extra "+this.addHealthyItem1Price+ "$.");
        }
        if(this.addHealthyItem2Name != null){
            hamburgerPrice += this.addHealthyItem2Price;
            System.out.println("Added "+this.addHealthyItem2Name+" with an extra "+this.addHealthyItem2Price+ "$.");
        }
        return hamburgerPrice;
    }



}
