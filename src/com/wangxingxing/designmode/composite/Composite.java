package com.wangxingxing.designmode.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> child;

    public Composite(String name) {
        super(name);
        child = new ArrayList<>();
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.println("--");
        }
        System.out.println("Composite: " + name);
        for (Component component : child) {
            component.print(level + 1);
        }
    }

    @Override
    void add(Component component) {
        child.add(component);
    }

    @Override
    void remove(Component component) {
        child.remove(component);
    }
}
