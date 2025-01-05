package Lambda;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamLambda {
    public static void main(String[] args) {
        List<String>strings=List.of("22","22","33");
        OptionalInt reduce = OptionalInt.of(strings.stream()
                .map(s -> s + s)
                .map(Integer::valueOf)
                .filter(v -> v % 2 == 0)
                .sorted()
                .limit(5).mapToInt(Integer::intValue).reduce(2,(x, y) -> x *= y));
        System.out.println(reduce);
       IntStream intStream= IntStream.of(1,4,3,1,5);

    }
}
