package com.wangxingxing.designmode.memento;

/**
 * Memento Interface to Originator
 *
 * This interface allows the originator to restore its state
 */
public interface PreviousCalculationToCareTaker {
    int getFirstNumber();
    int getSecondNumber();
}
