package Q_generics_set_map.A_Generics.d_genericosDelimitados.application;

import Q_generics_set_map.A_Generics.d_genericosDelimitados.services.CalculationService_NaoGenerics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String path = "/home/rsantos/IdeaProjects/Aprendendo-JAVA-2024-Nelio-Alves-/temp/g1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }
            Integer x = CalculationService_NaoGenerics.max(list);
            System.out.println("Max: " + x);

        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
