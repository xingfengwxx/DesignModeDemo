package com.wangxingxing.designmode.factorymethod;

import com.wangxingxing.designmode.simplefactory.Product;

public abstract class Factory {

    public abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
    }
}
