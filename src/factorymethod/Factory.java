package factorymethod;

import simplefactory.Product;

public abstract class Factory {

    public abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
    }
}
