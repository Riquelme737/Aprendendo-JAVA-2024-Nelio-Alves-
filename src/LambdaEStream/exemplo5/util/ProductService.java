package LambdaEStream.exemplo5.util;

import LambdaEStream.exemplo5.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public static double filtredPriceSum(List<Product> productList, Predicate<Product> productPredicate) {

        double sum = 0.0;

        for (Product product : productList) {
            if (productPredicate.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
