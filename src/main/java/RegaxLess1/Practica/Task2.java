package RegaxLess1.Practica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String regex="0[xX][0-9a-fA-F]+";
        int value=0xF12aB12;
        String input="dwqw 0xaA12 fewm 0XA39 fwedomk qwkd 0XKK12 fwk 0x12DaF";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println(value+ " : value");
    }
}
