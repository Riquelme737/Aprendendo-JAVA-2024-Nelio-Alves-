package Arquivos.Exercicio;

import java.io.*;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Produtos> list = new ArrayList<>();

        // Digita o caminho do arquivo
        System.out.println("Entre com o caminho do arquivo: ");
        String origemArquivoStr = scanner.nextLine();

        // Instacia para o FILE e Mostra o Caminho
        File origemArquivo = new File(origemArquivoStr);
        String origemDiretorioStr = origemArquivo.getParent();
        System.out.println("Diretorio do seu arquivo: " + origemDiretorioStr);


        // Cria a subpasta "out" e mostra se foi criado ou não.
        boolean status = new File(origemDiretorioStr + "\\out").mkdir();
        System.out.println("Sub diretorio criado: " + status);

        // Criar o arquivo summary.csv na subpasta out
        String alvoArquivoStr = origemDiretorioStr + "\\out\\summary.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(origemArquivoStr))) {

            String itemCsv = bufferedReader.readLine();
            while (itemCsv != null) {

                String[] campos = itemCsv.split(",");
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                list.add(new Produtos(nome, preco, quantidade));

                itemCsv = bufferedReader.readLine();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(alvoArquivoStr))) {
                for (Produtos item: list) {
                    bufferedWriter.write(item.getNome() + ", " + String.format("%.2f", item.total()));
                    bufferedWriter.newLine();
                }
                System.out.println(alvoArquivoStr + " CRIADO");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
