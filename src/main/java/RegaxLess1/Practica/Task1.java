package RegaxLess1.Practica;

import java.util.regex.Pattern;

public class Task1 {
    //. один любой символ
    //[]+ -один и более символов
    // []* - от нуля до бесконечности
    // []? -либо есть либо нет символа
    // (или | или)
    // чтобы точка сработала, перед точкой обратный двойной \\.

    public static void main(String[] args) {
        String regex="[A-z]\\w*@\\w{3,}\\.(org|com)";
        String input = "Ssomev@gmail.com";
        System.out.println(Pattern.matches(regex,input));
    }
}
