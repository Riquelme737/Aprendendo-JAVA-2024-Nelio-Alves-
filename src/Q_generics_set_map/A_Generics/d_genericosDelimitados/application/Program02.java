package Q_generics_set_map.A_Generics.d_genericosDelimitados.application;

import Q_generics_set_map.A_Generics.d_genericosDelimitados.entities.Product;
import Q_generics_set_map.A_Generics.d_genericosDelimitados.services.CalculationService_Generics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program02 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        String path = "/home/rsantos/IdeaProjects/Aprendendo-JAVA-2024-Nelio-Alves-/temp/g1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationService_Generics.max(list);
            System.out.println("Most expensive: " + x);

        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
