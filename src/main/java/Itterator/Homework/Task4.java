package Itterator.Homework;

import Task5List.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;

public class Task4 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Dnil", "Semenyk", 66),
                new Person("Katya", "Pr'''''''''oe", 28),
                new Person("Viktor", "Madigulator", 17),
                new Person("Misha", "Dantito", 2),
                new Person("Max", "Kalibo", 6),
                new Person("Le.mar", "Pivvna", 45)
        );
        people.stream()
                .filter(fullName->fullName.getFullName().length()<15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer,List<String>> collect = people.stream()//создали мап из наших персонов
                .collect(groupingBy(Person::getAge, mapping(Person::getFullName, toList())));
                //группинг бай(ключем будет возраст)||Мепинг, дайте значение полного имени, по ключам в виде листа
        System.out.println(collect);

        Map<Integer,Person>personas = people.stream().collect(toMap(Person::getAge, Function.identity()));
        System.out.println(personas);



    }
}
