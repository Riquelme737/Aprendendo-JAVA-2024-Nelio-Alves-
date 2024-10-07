package Arquivos.Exemplo;

import java.io.File;
import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file patch: ");
        String strPatch = scanner.nextLine();

        File path = new File(strPatch);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPatch: " + path.getPath());

        scanner.close();
    }
}
