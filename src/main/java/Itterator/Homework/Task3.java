package Itterator.Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,String>map=Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Reges",
                "Hal", "Perkins"
        );
System.out.println(isUnique(map));
    }
    public static boolean isUnique(Map<String,String> map){

        return map.size()==new HashSet<>(map.values()).size();
    }
}
