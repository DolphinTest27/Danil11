package Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task2 {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now().plusDays(100);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String format = now.format(dateTimeFormatter);
        System.out.println(format);

    }
}
