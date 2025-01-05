import java.util.List;

public class ListTest {

    public static void main(String[] args) {
         List<Integer> integers=List.of(1,2,3,4,10,20);

        integers.stream()
               .filter(value->value % 2 != 0 )
                .filter(value->value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average().ifPresent(System.out::println);
    }
}
