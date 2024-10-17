package LambdaEStream.exemplo3.util;

import LambdaEStream.exemplo3.intities.Product;

import java.util.function.Predicate;

public class RemoveIF_Predicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.00;
    }
}
