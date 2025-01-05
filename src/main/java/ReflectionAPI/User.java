package ReflectionAPI;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class User extends Person implements Serializable, Comparable<User> {

    private String name;
    @Annotation(age = 20)
    private int age;

    public User(Long id, String name, int age) {
        super(id);
        this.name = name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}'+ super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public int compareTo(@NotNull User o) {
        return 0;
    }
}
