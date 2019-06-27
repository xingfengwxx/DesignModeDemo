package factorymethod;

import simplefactory.ConcreateProduct2;
import simplefactory.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreateProduct2();
    }
}
