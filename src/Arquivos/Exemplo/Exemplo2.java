package Arquivos.Exemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        String patch = "C:\\Users\\Riquelme\\Desktop\\in.txt";

        try (BufferedReader bufferedReader = new BufferedReader((new FileReader(patch)))){

            String line = bufferedReader.readLine();

            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e ) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
