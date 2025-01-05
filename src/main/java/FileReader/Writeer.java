package FileReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Writeer {
    public static void main(String[] args) throws IOException {
        List<String> list= new ArrayList<>();
        list.add("Da");
        list.add("1241");
        list.add("few");
        list.add("fweqw");

        Path path=Path.of("resources", "test10Path.txt");
        Files.write(path, list);

        File file= Path.of("resources","test1.poem").toFile();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.append("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.append("Hello Java");
        }
    }
}
