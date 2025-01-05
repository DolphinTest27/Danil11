package MapCard;

import java.util.List;
import java.util.stream.Collectors;

public class List4String {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 2, 4, 2, 1);
      String s=  integers.stream()
                .map(String::valueOf)
              .collect(Collectors.joining(",","c "," ss" ));
        System.out.println(s);
    }
}
