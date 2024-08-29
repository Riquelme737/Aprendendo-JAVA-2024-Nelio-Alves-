package Abstract.Exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectagle or Circle (r/c)");
            char ch = scanner.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)");
            Color color = Color.valueOf(scanner.nextLine());

            if (ch == 'r') {
                System.out.print("Widht: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                list.add(new Circle(color, radius));
            }

            System.out.println("\nSHAPE AREAS: ");
            for (Shape shape : list) {
                System.out.println(String.format("%.2f", shape.area()));
            }

            scanner.close();
        }
    }
}
