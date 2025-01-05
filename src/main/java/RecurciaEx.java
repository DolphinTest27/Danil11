public class RecurciaEx {
    public static void main(String[] args) {
//        int[] arr2 = new int[10];
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i]);
//        }
//        System.out.println();
//        int[] array1 = {1, 3, 4, 5, 6};
//        System.out.println(array1[3]);
//        array1[3] = 18;
//        System.out.println(array1[3]);

        int[][] arr3 = {
                {1, 3, 8},
                {2, 4, 7},
                {5, 6, 9}
        };
        PrintArray(arr3);
//        long factorial = factorial(25);
//        System.out.println(factorial);
//    }
//    public static long factorial(long value){
//        if (value==1){
//            return 1;
//        }
//    return value* factorial(value-1);
//    }
    }

    public static void PrintArray(int[]... arr3) {
        for (int i = 0; i < arr3.length; i++) {
            int[] ints = arr3[i];
System.out.println();
            for (int j = 0; j < ints.length; j++) {
                System.out.print(  ints[j]+" ");
            }
        }
    }
}
