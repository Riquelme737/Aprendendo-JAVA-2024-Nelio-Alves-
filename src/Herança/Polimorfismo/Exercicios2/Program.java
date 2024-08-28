package Herança.Polimorfismo.Exercicios2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        Scanner scanner = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the numbers of product: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            if (typeProduct == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            } else if (typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scanner.next());
                productList.add(new UsedProduct(name, price, date));
            } else if (typeProduct == 'c') {
                productList.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product currentProducts : productList) {
            System.out.println(currentProducts.priceTag());
        }

        scanner.close();
    }
}
