package Q_generics_set_map.A_Generics.a_problemaMotivador01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintService printService = new PrintService();

        System.out.print("How many values? ");
        int x = scanner.nextInt();

        for (int i = 0; i < x ; i++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println(printService.first());

        scanner.close();
    }
}
