import java.util.Collection;
import java.util.Collections;

public class Generics {
    private  Object[] objects;
    private int size;

    public Generics(int initialSize){
        this.objects=new Object[initialSize];
    }
    public void add(Object element){
        objects[size++]=element;

    }
    public Object get(int index){
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}
