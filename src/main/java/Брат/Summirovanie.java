package Брат;

public class Summirovanie {


    public int sum() {
        int result = 0;
        System.out.println("Сумма всех чисел" + result);
        return result;
    }
    public int sum(int a) {
        int result1 = a;
        System.out.println("Сумма всех чисел" + result1);
        return result1;

    }
    int sum(int a, int b) {
        int result2 = a + b;
        System.out.println("Сумма всех чисел" + result2);
        return result2;

    }
    public int sum(int a, int b, int c) {
        int result3 = a + b + c;
        System.out.println("Сумма всех чисел" + result3);
        return result3;

    }
    public int sum(int a, int b, int c, int e) {
        int result4 = a + b + c + e;
        System.out.println("Сумма всех чисел" + result4);
        return result4;
    }
}

class Summirovanietest {
    public static void main(String[] args) {
        Summirovanie ss = new Summirovanie();
        ss.sum();
        ss.sum(1);
        ss.sum(1,2);
        ss.sum(1,2,3);
        ss.sum(1,2,3,4);
        System.out.println("Помогаю брату");


    }
}