package FileReader;

import java.io.*;
import java.nio.file.Path;

public class OutPutBuffer {
    public static void main(String[] args) throws IOException {
        File file= Path.of("resources","outPut.txt").toFile();
        try ( BufferedOutputStream
         bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(file,true))){
            // создаем в try с ресурсами, чтобы не закрывать потоки
            String value="Hello World";//значение
            bufferedOutputStream.write(value.getBytes()); //запишите в виде байт значение
            bufferedOutputStream.write(System.lineSeparator().getBytes());//разделитель на разных платформах. чтобы перейти на новую строку

        }
    }
}
