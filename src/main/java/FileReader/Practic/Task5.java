package FileReader.Practic;

import javax.print.DocFlavor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Task5  {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Admin\\IdeaProjects\\untitled6\\src\\FileReader\\Practic\\Task4.java");
        Path path= Path.of(String.valueOf(file));
        Path result= Path.of("resources","Task4.java");

        try (Stream<String> lines = Files.lines(path)) {
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(result, CREATE)) {
                lines.map(StringBuilder::new)
                        .map(StringBuilder::reverse).
                        forEach(line -> {
                            try {
                                bufferedWriter.write(line.toString());
                                bufferedWriter.newLine();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
            }
        }

    }


}
