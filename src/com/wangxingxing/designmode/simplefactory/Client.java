package com.wangxingxing.designmode.simplefactory;

public class Client {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
        //do something with the product
    }
}
