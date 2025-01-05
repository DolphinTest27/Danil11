package RegaxLess1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
    public static void main(String[] args) {
        String phoneNumber="+7 (881) 22-26-56 dkpqw wqkdpi +7 (765) 34-89-33 " +
                "dwqk qwkp +7 (911) 13-91-21 jkdqw@@!#Klde +7 (953) 11-26-13 dwqq";
        String regex="(?:\\+\\d) \\((?<code>\\d{3})\\) (\\d{2})-(\\d{2})-(\\d{2})";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(phoneNumber);
        Matcher matcher1= pattern.matcher(phoneNumber);

            StringBuilder secret;
           while (matcher.find()){
                   secret = new StringBuilder(matcher.replaceAll("Secret"));
                 System.out.println(secret);
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (matcher1.find()){
            String gr1=matcher1.group(2);
            String gr2=matcher1.group(3);
            String gr3=matcher1.group(4);
           matcher1.appendReplacement(stringBuilder, "$2 - $3 - $4 |");
        }
        matcher1.appendTail(stringBuilder);
        System.out.println(stringBuilder);
        System.out.println(phoneNumber.replaceAll(regex, "Da,Net?"));
        System.out.println(phoneNumber);
    }
}
