public class StrinBuilderrr {
    static float f1=100000000f;
    static float f2=1f;
    public static void main(String[] args) {
        System.out.println(f1+f2);
      long startTime=  System.currentTimeMillis();

        StringBuilder s1= new StringBuilder("");
        for (int i = 0; i < 100000; i++) {
            s1.append(i);

        }
       long endTime= System.currentTimeMillis();
        System.out.println("Time "+ (endTime-startTime));
    }
}
