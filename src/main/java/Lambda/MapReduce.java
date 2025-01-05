package Lambda;

import java.util.Optional;//нет метода peek, но можно в методе map создать свой метод peek
import java.util.function.Consumer;
import java.util.stream.Stream;//есть метод peek и мы можем делать с нашими обьектами разные операции

public class MapReduce {
    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(new Student(18, "Danil"),
                        new Student(19, "Viktor"),
                        new Student(14, "Katya"),
                        new Student(11, "Misha"),
                        new Student(54, "Vanya")
                )
//                .parallel()
                .sequential()
//                .map(Student::getAge)
//                .filter(age -> age >20)
                .reduce((student, student2) -> student.getAge() > student2.getAge() ? student : student2);
        //что-то на подобие метода фор ич для стрима
        maybeStudent.ifPresent(System.out::println);//?если не равно null тогда выведеться на консоль: в противном выдаст один обьект типа опшинал
//        maybeStudent.map(Student::getName).filter(name->name.length()>2).ifPresent(System.out::println);

        Integer empty = maybeStudent.map(Student::getAge)
                .filter(age -> age > 20)
                .flatMap(age -> Optional.of(age * 2)).get();
        System.out.println(empty);
    }
}
