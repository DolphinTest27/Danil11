package ReflectionAPI;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
    int age() default 18 ;
    //Target- ггде будет видна наша анотация.(к чему будет применена)
    //Retention -где будет видна. рантайм, в коде, и нигде.
}
