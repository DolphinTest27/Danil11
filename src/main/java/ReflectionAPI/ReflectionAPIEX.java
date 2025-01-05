package ReflectionAPI;

import java.lang.reflect.*;

public class ReflectionAPIEX {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user=new User( 25L,"Danil",24 );
       // testFields(user);
        testMethods(user);
        //   Class<? extends User> userClass = user.getClass();
        //   Class<User> userClass1 = User.class;
        //    System.out.println(aClass == userClass);
        //  testConstructor();

    }
    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor=User.class.getConstructor(Long.class,String.class);
        User danil=constructor.newInstance(20L,"Viktor");
        System.out.println(danil);
    }
    private static void testFields(Object object) throws IllegalAccessException {
        Field[] declaredFields=object.getClass().getSuperclass().getDeclaredFields();
        for (Field declaredField :
                declaredFields) {
            declaredField.setAccessible(true);//разершить прайват полям паблик(чтобы достучаться до значения)
            Object value = declaredField.get(object);
            System.out.println(declaredField.getGenericType());
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
            System.out.println(value);
        }
    }
    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Method  method= user.getClass().getDeclaredMethod("setName", String.class);
        method.invoke(user,"Daniil");
        System.out.println(user.getName());

    }
}
