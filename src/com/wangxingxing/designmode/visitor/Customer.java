package com.wangxingxing.designmode.visitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Element {

    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
