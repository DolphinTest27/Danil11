package FileReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutInputStream {
    public static void main(String[] args) throws IOException {
        File file=new File("resources\\test101.txt");
        boolean newFile = file.createNewFile();//создать новый файл(выкидывает эксепшн)
        boolean b= file.exists();//сущевствует ли файл
       System.out.println(newFile);
        System.out.println(file.isDirectory());//это дерриктория ?
        System.out.println(file.isFile());//это файл?
        System.out.println(file.getName());//имя файла
        System.out.println(file.getParent());//кто предок у данного файла
        System.out.println(file.length());//размер файла
        System.out.println(file.canExecute());//
        System.out.println(file.canWrite());//
        System.out.println(file.canRead());//выполнение, считывание и запись. Read(читать) Write(писать) Execute-выполнять
        System.out.println(file.canRead());

        File dir=new File("resources\\dir\\11\\Derka");
        boolean mkdir = dir.mkdirs();//создать все пути к конечной дирриктории
        System.out.println(mkdir);
        //OutputStream outputStream=file.

    }
}
