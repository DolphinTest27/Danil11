package FileReader.Practic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Задан файл с джава кодом. прочитайте текст программы из файла и все слова
 * паблик в обьявлении атрибутов и методов заменить на слова прайвет.
 * Результат сохранить в другой заранее созднанный файл.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Admin\\IdeaProjects\\untitled6\\src\\FileReader\\Practic\\Task3.java");
        Path path = Path.of(String.valueOf(file));
        String stringValue= Files.readString(path);
        String result=stringValue.replace("public","private");
        Path path1=Path.of("resources","Task3.java");
        Files.writeString(path1,result);
    }
}
