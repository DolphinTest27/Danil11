import java.util.List;
import java.util.stream.Collectors;

public class ListTest2Set {
    public static void main(String[] args) {
      List<String>list=  List.of(
                "string-1",
                "string-10",
                "string-11",
                "string-4",
                "string-6",
                "string-10",
                "string-11",
                "string-12",
                "string-13");
        int size = list.stream()
                .filter(s -> s.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(size);
        Long size2 = list.stream()
                .filter(s -> s.length() > 8)
                .distinct()//вернуть только уникальные элементы. дистинг.
                .count();//дать счетчик, сколько всего элементов осталось
        System.out.println(size2);
    }
}
