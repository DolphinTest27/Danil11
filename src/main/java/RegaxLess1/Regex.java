package RegaxLess1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher("123 ");
        System.out.println(matcher.matches());



        String phoneNumber="+7 (981) 789-26-23";
        String regex="\\+\\d \\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}";
        Pattern pattern1=Pattern.compile(regex);
        System.out.println(Pattern.matches(regex,phoneNumber));

        Matcher matcher1=pattern1.matcher(phoneNumber);
        System.out.println(matcher1.matches());

        System.out.println(phoneNumber.matches(regex));

    }
}
