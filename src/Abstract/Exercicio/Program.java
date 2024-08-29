package Abstract.Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> lista = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da Pessoa #" + i);
            System.out.print("Fisica ou Juridica? (f/j) ");
            char resp = scanner.next().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Gasto anual: ");
            double rendaAtual = scanner.nextDouble();

            switch (resp) {
                case 'f':
                    System.out.print("Gasto com a saúde: ");
                    double gastoSaude = scanner.nextDouble();
                    lista.add(new PessoaFisica(nome, rendaAtual, gastoSaude));
                    break;
                case 'j':
                    System.out.print("Quantos funcionarios esta empregado? ");
                    int numerosFuncionarios = scanner.nextInt();
                    lista.add(new PessoaJuridica(nome, rendaAtual, numerosFuncionarios));
                    break;
                default:
                    System.out.print("Escreva apenas f ou j por favor. ");
            }

            double totalImposto = 0.0;
            System.out.println("\nIMPOSTO CALCULO: ");
            for (Pessoa pessoa : lista) {
                double imposto = pessoa.imposto();
                System.out.println(pessoa.getNome() + ": $ " + String.format(".2f", imposto));
                totalImposto += imposto;
            }

            System.out.println("\nIMPOSTO TOTAL: $ " + String.format(".2f", totalImposto));
        }
    }
}
