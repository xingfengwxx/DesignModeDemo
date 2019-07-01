package com.wangxingxing.designmode.composite;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.println("--");
        }
        System.out.println("left: " + name);
    }

    @Override
    void add(Component component) {
        throw new UnsupportedOperationException(); // 牺牲透明性换取单一职责原则，这样就不用考虑是叶子节点还是组合节点
    }

    @Override
    void remove(Component component) {
        throw new UnsupportedOperationException();
    }
}
