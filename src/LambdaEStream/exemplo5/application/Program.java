package LambdaEStream.exemplo5.application;

import LambdaEStream.exemplo5.entities.Product;
import LambdaEStream.exemplo5.util.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Tv", 900.00),
                new Product("Mouse", 50.00),
                new Product("Tablet", 350.50),
                new Product("HD Case", 80.90)
        ));


        double sum = ProductService.filtredPriceSum(products, p -> p.getName().charAt(0) == 'T');

        System.out.println(String.format("%.2f", sum));
    }
}
