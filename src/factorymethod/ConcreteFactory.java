package factorymethod;

import simplefactory.ConcreateProduct;
import simplefactory.Product;

public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreateProduct();
    }
}
