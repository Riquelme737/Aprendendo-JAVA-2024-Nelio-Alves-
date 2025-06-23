package Q_generics_set_map.A_Generics.c_solucaoGenerics;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintService<String>printService = new PrintService<>();

        System.out.print("How many values? ");
        int x = scanner.nextInt();

        // NÃO É MAIS PERMITIDO, "TYPE SAFETY"!
        //printService.addValue("Maria");

        for (int i = 0; i < x ; i++) {
            String value = scanner.next();
            printService.addValue(value);
        }

        // NÃO É MAIS NECESSÁRIO O CAST, "TYPE SAFETY"!
        // Integer a = (Integer) printService.first();

        printService.print();
        String a = printService.first();
        System.out.println("First: " + a);

        scanner.close();
    }
}
