package ReflectionAPI.Taski;

import ReflectionAPI.User;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car=Car.valueOf("Mashiba","Domasnaja"  );
     //    System.out.println(car);
        System.out.println(generateInsert(car));
        //     Table annotation = car.getClass().getAnnotation(Table.class);
      //  System.out.println(annotation);
     //   String brand = car.getClass().getDeclaredField("brand").getAnnotation(Column.class).name();
      //  System.out.println(brand);
    }
    public static String generateInsert(Car car){
        String template = "INSERT INTO %s.%s(%s) VALUES(%s);";
        Table table = car.getClass().getAnnotation(Table.class);//получаем все анотации класса
        Field[] declaredFields = car.getClass().getDeclaredFields();// получаем все наши поля.
        String fieldNames = Arrays.stream(declaredFields)//стрим полей.
                .filter(field -> field.isAnnotationPresent(Column.class))//сортируем, является ли поле помечено анотацией коллум
                .sorted(Comparator.comparing(Field::getName))//сортируем по имени
                .map(field -> field.getAnnotation(Column.class))//дайте поле помеченное анотацией
                .map(Column::name)//дайте имя методов анотации(Стринг)//получаем название полей, которые находятся в Анотации Colum
                .collect(Collectors.joining(","));//методом джонинг ставим делиметр


        String fieldValues = Arrays.stream(declaredFields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .sorted(Comparator.comparing(Field::getName))
                .peek(field -> field.setAccessible(true))
                .map(field -> {
                    try {
                        return field.get(car);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(value -> "'" + value + "'")
                .collect(Collectors.joining(","));
        return String.format(template,table.schema(),table.name(),fieldNames,fieldValues);

    }


}
