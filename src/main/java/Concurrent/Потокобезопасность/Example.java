package Concurrent.Потокобезопасность;

import java.util.ArrayList;
import java.util.List;
public class Example {
    private final List <Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
        //либо чтобы всегда возвращал копию обьекта
    }

    public  List<Integer> getList() {
        return new ArrayList<>(list);
        //гетер сделать так, чтобы всегда возвращал новый лист
    }
}
