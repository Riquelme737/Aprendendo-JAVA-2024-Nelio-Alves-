package Data_Hora.Exemplos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exemplo_01 {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // (agora) -> Data-hora (local / global)
        LocalDate d01 = LocalDate.now(); // Sem horas
        LocalDateTime d02 = LocalDateTime.now(); // Com horas
        Instant d03 = Instant.now();

        //Texto ISO 8601 || Data-hora (local / lobal)  -> Data-hora
        LocalDate d04 = LocalDate.parse("2024-08-01");
        LocalDateTime d05 = LocalDateTime.parse("2024-08-01T01:30:26");
        Instant d06 = Instant.parse("2024-08-01T01:30:26Z");
        Instant d07 = Instant.parse("2024-08-01T01:30:26-03:00"); // Com Fuso Horario São Paulo

        // Texto formato customizado com DateTimeFormatter -> Data-hora (local / global)
        LocalDate d08 = LocalDate.parse("01/08/2024", fmt01);
        LocalDateTime d09 = LocalDateTime.parse("01/08/2024 07:17", fmt02);

        // dia, mês, ano, [horário] -> Data-hora local
        LocalDate d10 = LocalDate.of(2024,8,1);
        LocalDateTime d11 = LocalDateTime.of(2024,8,1,00,00);

        System.out.println("(Agora) -> Data-hora");
        System.out.println("Local: ");
        System.out.println("LocalDate d01 = " + d01);
        System.out.println("LocalDateTime d02 = " + d02);
        System.out.println("Global: ");
        System.out.println("Instant d03 = " + d03);
        System.out.println("------------------------------------------");
        System.out.println("Texto ISO 8601 -> Data-hora");
        System.out.println("Local: ");
        System.out.println("LocalDate d04 = " + d04);
        System.out.println("LocalDateTime d05 = " + d05);
        System.out.println("Global: ");
        System.out.println("Instant d06 = " + d06);
        System.out.println("Instant d07 com fuso horario São Paulo = " + d07);
        System.out.println("------------------------------------------");
        System.out.println("Texto formato customizado com DateTimeFormatter -> Data-hora");
        System.out.println("LocalDate d08 = " + d08);
        System.out.println("LocalDateTime d09= " + d09);
        System.out.println("------------------------------------------");
        System.out.println("dia, mês, ano, [horário] -> Data-hora local");
        System.out.println("LocalDate d10 = " + d10);
        System.out.println("LocalDateTime d11 = " + d11);
    }
}
