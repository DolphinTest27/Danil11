package MapCard;

import Itterator.Person;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEx  {
    public static void main(String[] args) {
      List<String> list = Arrays.asList( "Da", "nene","Net","Nene");
        Collections.sort(list);
        System.out.println(list);
      List<Person> list2=  Arrays.asList(new Person(1,"da","net"),
        new Person(5,"da","net"),
       new Person(3,"da","net")
                );
    Collections.sort(list2);
    System.out.println(list2);
    list2.sort(Comparator.comparing(Person::getName));
    }


}
