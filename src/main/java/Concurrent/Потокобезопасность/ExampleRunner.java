package Concurrent.Потокобезопасность;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleRunner {
    public static void main(String[] args) {
        Example example=new Example(new ArrayList<>());
        List<Integer> list= Collections.synchronizedList(example.getList());
        list.add(2);
        System.out.println(list);
        System.out.println(example.getList());

    }
}
