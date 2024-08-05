package Data_Hora.Exemplos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exemplo_02 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2024-08-01");
        LocalDateTime d02 = LocalDateTime.parse("2024-08-01T07:01:33");
        Instant d03 = Instant.parse("2024-08-01T07:01:33Z");

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.RFC_1123_DATE_TIME;

        System.out.println("d01 = " + d01.format(fmt01));
        System.out.println("d01 = " + fmt01.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d02 = " + d02.format(fmt01));
        System.out.println("d02 = " + d02.format(fmt02));

        System.out.println("d03  = " + fmt03.format(d03));



    }
}
