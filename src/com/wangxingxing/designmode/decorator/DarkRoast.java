package com.wangxingxing.designmode.decorator;

public class DarkRoast implements Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
