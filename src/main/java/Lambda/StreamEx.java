package Lambda;

import java.util.List;
import java.util.stream.IntStream;

public class StreamEx {
    public static void main(String[] args) {
        List<String> list = List.of("11", "22", "33", "44", "55");

        IntStream.range(0,10).forEach(System.out::println);



    }
}
