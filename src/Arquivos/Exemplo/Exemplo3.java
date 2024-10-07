package Arquivos.Exemplo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good Morning!", "Good Afternoon!", "Good Night!"};

        String path = "C:\\Users\\Riquelme\\Desktop\\out.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}