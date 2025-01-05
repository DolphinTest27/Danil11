package Itterator.Homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integers = List.of();
        System.out.println(count(integers));

    }

    private static int count(List<Integer> list) {
        return new HashSet<>(list).size();

    }
}
