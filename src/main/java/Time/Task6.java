package Time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task6 {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        LocalDate prev=LocalDate.of(2018,7,7);
        LocalDateTime localDateTime = now.atStartOfDay();
        LocalDateTime localDateTime1 = prev.atStartOfDay();

        Duration duration=Duration.between(localDateTime1,localDateTime);
        System.out.println(duration.getSeconds());

        long between = ChronoUnit.SECONDS.between(localDateTime1, localDateTime);
        System.out.println(between);
    }
}
