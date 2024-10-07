package Arquivos.Exemplo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\itens.csv");

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
