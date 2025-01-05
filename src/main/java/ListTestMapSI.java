import java.util.Map;

public class ListTestMapSI {
    public static void main(String[] args) {
        Map<String,Integer> stringIntegerMap=Map.of(
                "Daaa",2,
                "124",3,
                "2",3,
                "1",3,
                "4",3,
                "Daa",3,
                "3",3
        );

        int result = stringIntegerMap.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
    }
}
