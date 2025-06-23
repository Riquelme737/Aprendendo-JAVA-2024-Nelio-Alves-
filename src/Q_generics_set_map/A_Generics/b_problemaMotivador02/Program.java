package Q_generics_set_map.A_Generics.b_problemaMotivador02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintService printService = new PrintService();

        System.out.print("How many values? ");
        int x = scanner.nextInt();

        printService.addValue("Maria");

        for (int i = 0; i < x ; i++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        Integer a = (Integer) printService.first();
        System.out.println("First: " + a);

        scanner.close();
    }
}
