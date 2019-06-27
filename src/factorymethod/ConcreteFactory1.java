package factorymethod;

import simplefactory.ConcreateProduct1;
import simplefactory.Product;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreateProduct1();
    }
}
