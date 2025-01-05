package Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task8 {

    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDateTime with = localDateTime.with(t -> t.plus(42L, ChronoUnit.DAYS));
        System.out.println(localDateTime);
        System.out.println(with);

    }

}
