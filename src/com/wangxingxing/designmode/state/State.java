package com.wangxingxing.designmode.state;

public interface State {

    /**
     * 投入25分钱
     */
    void insertQuarter();

    /**
     * 退回25分钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
