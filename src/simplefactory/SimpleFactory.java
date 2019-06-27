package simplefactory;

public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreateProduct1();
        } else if (type == 2) {
            return new ConcreateProduct2();
        }
        return new ConcreateProduct();
    }
}
