package Itterator.SetEx;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String>set=new TreeSet<>();
        set.add("bbbb");
        set.add("eeee");
        set.add("vvvv");
        set.add("aaaa");
        set.add("bbbb");
        System.out.println(set);
    }
}
