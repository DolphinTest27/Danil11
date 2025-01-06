import java.time.Instant;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IfElse {
    public static void main(String[] args) {
        IntStream iterator = IntStream.range(1,100);
        iterator.forEach(System.out::println);





        int value=10;
        if (value<0){
            System.out.println(value);
        }else if (value>=0){
            System.out.println("Число больше или равно нулю");
        }

    }
}
