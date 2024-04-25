package FactoryMethodPattern;

import FactoryMethodPattern.Interface.Product;

public class Main {

    public static void main(String[] args){
        FriesFactory factory = new FriesFactory();
        Product fries = factory.getProduct("無鹽的");
        fries.describe();
    }
}
