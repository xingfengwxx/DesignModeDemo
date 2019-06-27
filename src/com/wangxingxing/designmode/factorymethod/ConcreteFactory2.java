package com.wangxingxing.designmode.factorymethod;

import com.wangxingxing.designmode.simplefactory.ConcreateProduct2;
import com.wangxingxing.designmode.simplefactory.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreateProduct2();
    }
}
