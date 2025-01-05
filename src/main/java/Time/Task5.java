package Time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task5 {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        LocalDate prev=LocalDate.of(2018,7,7);

        Period between = Period.between(prev, now);
        System.out.println(between.getDays());
        long between1 = ChronoUnit.DAYS.between(prev, now);
        System.out.println(between1+" дней");

    }
}
