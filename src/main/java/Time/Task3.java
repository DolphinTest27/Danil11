package Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void main(String[] args) {
        String s1="03-11-1997T09:24";

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        LocalDateTime localDateTime=LocalDateTime.parse(s1,dateTimeFormatter);
        System.out.println(localDateTime);


    }
}
