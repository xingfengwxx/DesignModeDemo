package com.wangxingxing.designmode.visitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements Element {

    private String name;
    private List<Item> items = new ArrayList<>();

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Item item : items) {
            item.accept(visitor);
        }
    }
}
