package LambdaEStream.Exemplo2.application;

import LambdaEStream.Exemplo2.entities.Product;
import LambdaEStream.Exemplo2.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.00));
        productList.add(new Product("HD Case", 80.90));

        //Implentação de Interface -> util.PriceUpdate
        // productList.forEach(new PriceUpdate());

        //Reference Method com metodo estatico
        //productList.forEach(Product::staticPriceUpdate);

        //Reference Methodo com metodo nao estatico
        // productList.forEach(Product::nonStaticPriceUpdate);

        //Expressao lambda declarada
        //Consumer<Product> productConsumer = p -> p.setPrice(p.getPrice() * 1.1);
        //productList.forEach(productConsumer);

        //Expressao lambda inline
        //productList.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        productList.forEach(System.out::println);
    }
}
