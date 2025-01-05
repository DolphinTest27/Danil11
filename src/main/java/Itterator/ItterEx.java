package Itterator;

import java.util.Iterator;
import java.util.List;

public class ItterEx {
    public static void main(String[] args) {
        List<Integer>list=List.of(1,2,3,4,5,6);
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            System.out.print(integer+" ");
        }
        System.out.println();
        int count=1;
        for (Integer integer :
                list) {
            System.out.println(count+" : " +integer+" ");
            count++;
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next=iterator.next();
            System.out.println(next);
        }
        list.iterator().forEachRemaining(System.out::println);

    }
}
