package com.wangxingxing.designmode.observer;

public class CurrentConditionDisplay implements Observer {

    public CurrentConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
