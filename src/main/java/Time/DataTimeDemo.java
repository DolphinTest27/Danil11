package Time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DataTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now=ZonedDateTime.now();//хранит дату, время. милисекунды и сколько отклонение от UTC
        System.out.println(now);// покажи мне текущую дату и время
        long long1=now.toInstant().toEpochMilli();//покажи сколько милисекунд от отсчета UTC
        System.out.println(long1);//можем использовать методы или преобразовывать в другие классы
        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);
        ZonedDateTime bezSecondTime = now.truncatedTo(ChronoUnit.SECONDS);//уберите все, что после секунд.
        System.out.println(bezSecondTime+"   ++++");
        System.out.println();
        System.out.println(plus);
        //Возвращает новые обьекты. неизменяемые обьекты.(строки)
        LocalDateTime of = LocalDateTime.of(2020, 11, 12, 13, 4, 13);

        LocalTime now1 = LocalTime.now(ZoneOffset.UTC);
        System.out.println(now1+" 111");//показать дату без зоны gmt и без информации о смешении
    }
}
