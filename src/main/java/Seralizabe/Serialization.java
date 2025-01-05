package Seralizabe;

import java.io.*;
import java.nio.file.Path;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("resources", "student.out");
//        writeObject(path);
        try (ObjectInputStream outputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object s1 = outputStream.readObject();
            System.out.println(s1);
            //инпутстрим для чтения инпут метод риил
        }
    }

    private static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
         Person danil=   new Person(25,"Danil");
         objectInputStream.writeObject(danil);

         //аутпутстрим для записи
            //аутпутстрим, метод write

        }
    }
}
