package Seralizabe;

import java.io.Serial;
import java.io.Serializable;
import java.rmi.server.UID;
import java.util.SplittableRandom;

public class Person implements Serializable {


    @Serial
    private static final long serialVersionUID = -3154927473625206492L;
    //нужно установить версию uid чтобы сериализовать или десиарелизовать класс
    //так как если появится новое поле, то версия класса изменится
    private int age;
    private transient String firstName;
    //ключевое слово транзит-позволяет не сериализовать поле обьекта.



    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public  int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }
}
