package MapCard;

import Itterator.Person;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Person person1=new Person(1,"Da","Plehanov");
        Person person2=new Person(2,"Kara","More");
        Person person3=new Person(3,"Ova","Hore");
        Person person4=new Person(4,"Mera","Lera");
        Map<Integer,Person>map=new HashMap<>();
        map.put(person1.getId(),person1);
        map.put(person2.getId(),person2);
        map.put(person3.getId(),person3);
        map.put(person4.getId(),person4);
        System.out.println(map.get(2));
        System.out.println();

        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
      boolean n1=  map.containsKey(3);
      boolean n2=  map.isEmpty();
      boolean n3=  map.containsValue(person2);
    }
}
