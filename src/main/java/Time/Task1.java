package Time;

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(2020, 6, 25, 19, 47);
        LocalDateTime localDateTime1 = of.plusMonths(3);
        System.out.println(localDateTime1.toLocalDate());
        System.out.println(localDateTime1.toLocalTime());

    }
}
