import java.util.Arrays;

public class Taask {

    public static void main(String[] args) {
        RecurciaEx ex1=new RecurciaEx();
        
printArr(new int[]{2, 3, 4, 6});
    }
    public static void printArr(int[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]+" ");
        }
        System.out.println();
        System.out.println("values = " + Arrays.toString(values));
    }
}
