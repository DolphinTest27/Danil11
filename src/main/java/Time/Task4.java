package Time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        String s1="03-11-1997T09:24";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime=LocalDateTime.parse(s1,dateTimeFormatter);
        System.out.println(localDateTime);

        Instant instant=localDateTime.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime));
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());

    }

}
