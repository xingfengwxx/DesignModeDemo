package com.wangxingxing.designmode.factorymethod;

import com.wangxingxing.designmode.simplefactory.ConcreateProduct;
import com.wangxingxing.designmode.simplefactory.Product;

public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreateProduct();
    }
}
