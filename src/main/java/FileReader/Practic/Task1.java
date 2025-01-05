package FileReader.Practic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
1. Задан файл с текстом, найти и вывести в концоль все слова
 начинающиейся с гласной буквы.
 */
public class Task1 {
    private static final String VOWElS="уеыаоэяиюУЕЫАОЭЯИЮ";
    public static void main(String[] args) throws IOException {
//        File file=new File();


        Path path=Path.of("resources","test1.poem");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()){
                String word= scanner.next();
                String firstSymbol= String.valueOf(word.charAt(0));
                if (VOWElS.contains(firstSymbol)){ // можно через чар и !=-1 через индексОф
                    System.out.print(word+" ");
                }
            }
        }


    }
}
