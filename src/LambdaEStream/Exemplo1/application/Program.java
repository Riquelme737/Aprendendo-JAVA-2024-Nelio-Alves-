package LambdaEStream.Exemplo1.application;


import LambdaEStream.Exemplo1.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static int comparatorProduct(Product p1, Product p2) {
      return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Notebook", 1200.00));
        productList.add(new Product("Tablet", 450.00));

        /*Comparator<Product> comparator = (p1, p2) -> p2.getPrice().compareTo(p1.getPrice());*/

        productList.sort((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));
        productList.sort(Program::comparatorProduct);

        for (Product p : productList) {
            System.out.println(p);
        }
    }
}
