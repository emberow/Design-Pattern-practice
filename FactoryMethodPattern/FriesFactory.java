package FactoryMethodPattern;

import FactoryMethodPattern.Interface.Factory;
import FactoryMethodPattern.Interface.Product;

public class FriesFactory implements Factory {

    // 返回一般的薯條
    @Override
    public Product getProduct() {
        return new FrenchFries();
    }

    // 客製化薯條
    public Product getProduct(String state) {
        return new FrenchFries("無鹽的");
    }
    
}
 