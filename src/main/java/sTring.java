import java.sql.SQLOutput;
import java.util.Arrays;

public class sTring {
    public static void main(String[] args) {
        String s="DWKK:) :( :) :) fewef :( fewe:(";
        String replace = replace(s);
        System.out.println(replace);
    }
    public static String replace(String s){
        return s.replace(":(",":)");
    }
}
//class Class2{
//    public static void main(String[] args) {
//        String value="Da 123 nfeijdsd Da";
//        String word="Da";
//        System.out.println(isStartAndEnd(value,word));
//
//
//    }
//    public static boolean isStartAndEnd(String s,String s1){
//        return s.startsWith(s1) && s.startsWith(s1);
//    }
//}
//class Class3{
//    public static void main(String[] args) {
//        String result = format("Danil", "Viktorovich", "Semenuk");
//        System.out.println(result);
//    }
//    public static  String format(String firstName,String lastName,String patronymicName){
////char firstNameChar=firstName.toUpperCase().charAt(0);
////char lastNameChar=lastName.toUpperCase().charAt(0);
////char patronymicNameChar=patronymicName.toUpperCase().charAt(0);
//char firstNameChar=Character.toUpperCase(firstName.charAt(0));
//char lastNameChar=Character.toUpperCase(lastName.charAt(0));
//char patronymicNameChar=Character.toUpperCase(patronymicName.charAt(0));
//return String.format("%s.%s.%s.",firstNameChar,lastNameChar,patronymicNameChar);
//    }
//}
class Class4{
    public static void main(String[] args) {
        String value ="12345678900";
        int n=3;
        String[]result=split(value,n);
        String string = Arrays.toString(result);
        System.out.println(string);

    }
    public static String[] split(String value,int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);//округление в большую сторону
        String[] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            int endIndex= Math.min(value.length(), i + n);
            String substring = value.substring(i, endIndex);
            result[counter] = substring;
            counter++;

        }
        return result;
    }
}
