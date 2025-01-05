package RegaxLess1;

import java.nio.file.StandardOpenOption;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {
    public static void main(String[] args) {
        String phoneNumber="+7 (881) 123-26-56 dkpqw wqkdpi +7 (765) 789-89-33" +
                "dwqk qwkp +7 (911) 21-91-21 jkdqw@@!#Klde +7 (953) 13-26-13 dwqq";
        String regex="(?:\\+\\d) \\((?<code>\\d{3})\\) (\\d{2})-\\d{2}-\\d{2}";
        //(внутри это чтобы было без скобок) - код группы
        //?<сode> - дать имя группе
        // \\(\\) - чтобы какой-то символ не имел значение-
        // -а был как часть регулярного выражения двойной обратный слэш
        // \\2 - найти такую же группу как вторая
        // ?: - исключить группу из списка поиска
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(phoneNumber);
        //чтобы вызвать метод find обязательно использовать класс метчер

        StringBuffer stringBuffer=new StringBuffer();
        while (matcher.find()) {
            Matcher matcher1 = matcher.appendReplacement(stringBuffer, "xxxxxx");

        }
        matcher.appendTail(stringBuffer);//если подстрока заканчивается не на найденный элемент,
  // и нужен хвост,то добавить его самосоятельно, иначе теряем хвост строки
        System.out.println(stringBuffer.toString());
            //  System.out.println(matcher.group());
            //дефолтно, вызывает совпадение и выводит полностю на экран

            //   System.out.println(matcher.group(1));
            //показывает только группу указанную в метод.
            // группу подходящую под параметры


            // System.out.println(matcher.group("code"));
            //возврат группы, которую назвали, чтобы не путаться,
            // этот вариант лучше всех

            //метод груп, перегружен. один из вариантов, возврат групп (1)(2)(3)


    }
}
