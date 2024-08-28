package Herança.Polimorfismo.Exercicios;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced? (y/n) ");
            char outSourced = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if (outSourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalChager = scanner.nextDouble();
                employeeList.add(new OutsourceEmployee(name, hours, valuePerHour, additionalChager));
            } else {
                employeeList.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println("\nPAYMENT: ");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        scanner.close();
    }
}
