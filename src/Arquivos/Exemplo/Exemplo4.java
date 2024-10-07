package Arquivos.Exemplo;

import java.io.File;
import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder patch: ");
        String strPatch = scanner.nextLine();

        File patch = new File(strPatch);

        File[] folders = patch.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = patch.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPatch + "\\subdir").mkdir();
        System.out.println("Directory created with successfuly " + success);


        scanner.close();
    }
}
