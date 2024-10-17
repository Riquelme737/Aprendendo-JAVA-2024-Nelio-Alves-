package LambdaEStream.exemplo3.application;

import LambdaEStream.exemplo3.intities.Product;
import LambdaEStream.exemplo3.util.RemoveIF_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.00));
        productList.add(new Product("HD Case", 85.90));


        // Implementação da Interface -> util/RemoveIF_Predicate
        // productList.removeIf(new RemoveIF_Predicate());

        //Reference method com metodo estatico
        //productList.removeIf(Product::staticRemoveIF_Predicate);

        // Reference method com metodo nao estatico
        //productList.removeIf(Product::nonStaticRemoveIF_Predicate);

        //Expressão lambda declarada
        /*Predicate<Product> productPredicate = p -> p.getPrice() >= 100;
        productList.removeIf(productPredicate);*/

        //Expressão lambda inline
        double valor = 100.00;
         productList.removeIf(p -> p.getPrice() <= valor);

        productList.forEach(System.out::println);
    }
}
