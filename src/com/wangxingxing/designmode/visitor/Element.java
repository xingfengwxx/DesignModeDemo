package com.wangxingxing.designmode.visitor;

public interface Element {
    void accept(Visitor visitor);
}
