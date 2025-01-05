public class Mesaz {
    public static void main(String[] args) {
       int value=3013;
     System.out.println(Math.floorMod(value,100));
       int testValue=value%100;
       if (testValue==13){
           System.out.println("Последняя цифра "+testValue);
       }

        }
    }

