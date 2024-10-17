package LambdaEStream.exemplo4.application;

import LambdaEStream.exemplo4.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.00));
        productList.add(new Product("HD Case", 85.90));

        Function<Product, String> productStringFunction = product -> product.getName().toUpperCase();

        List<String> names = productList.stream().map(productStringFunction).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
