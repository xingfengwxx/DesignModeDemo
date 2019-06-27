package com.wangxingxing.designmode.factorymethod;

import com.wangxingxing.designmode.simplefactory.ConcreateProduct1;
import com.wangxingxing.designmode.simplefactory.Product;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreateProduct1();
    }
}
