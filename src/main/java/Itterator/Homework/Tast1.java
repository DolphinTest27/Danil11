package Itterator.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tast1 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>( Arrays.asList(1,2,3,11,31,44,46,32,13));
        List<Integer> result = integerList(list);
        System.out.println(result);
    }
    private static  List<Integer>integerList(List<Integer>list){
        List<Integer> result=new ArrayList<>();
        for (Integer value :
                list) {
            if (value%2!=0){
                result.add(value);
            }
            
        }
        return result;
    }
}
