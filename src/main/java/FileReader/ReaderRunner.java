package FileReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test101.txt");
        try (Stream<String> file2 = Files.lines(path)) {
            file2.forEach(System.out::println);
        }

//        File file = Path.of("resources", "test101.txt").toFile();
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(file)) ) {
//            String collect = fileReader.lines()
//                    .collect(Collectors.joining("\n"));
//            System.out.println(collect);
//
//        }


    }
}
