package Interface.exercicio.model.application;

import Interface.exercicio.model.entities.Contract;
import Interface.exercicio.model.entities.Parcelas;
import Interface.exercicio.model.services.ContratoServico;
import Interface.exercicio.model.services.PaypalServico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(scanner.nextLine(), dtf);
        System.out.print("Valor do contrato: ");
        double valorContrato = scanner.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int n = scanner.nextInt();

        Contract contrato = new Contract(numero,data,valorContrato);

        ContratoServico contratoServico = new ContratoServico(new PaypalServico());
        contratoServico.processoContrato(contrato, n);

        System.out.println("Parcelas: ");
        for (Parcelas parcelas: contrato.getParcelas()) {
            System.out.println(parcelas);
        }

        scanner.close();
    }
}
