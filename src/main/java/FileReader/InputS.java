package FileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class InputS {
    public static void main(String[] args) throws IOException {
//      File file=new File(String.join(File.separator,"resources","test101.txt"));
        File file1 = Path.of("resources", "test101.txt").toFile();
    try (FileInputStream inputStream = new FileInputStream(file1)) {
        byte []bytes=new byte[inputStream.available()];//количество доступных байт данного файла
        int count=0;
        byte currentByte;
      while ((currentByte=(byte) inputStream.read())!=-1){
          bytes[count++]=currentByte;
        }
      String stringValue=new String(bytes);
        System.out.println(stringValue);


//        byte[] bytes=inputStream.readAllBytes();
//        String stringValue=new String(bytes);
//        System.out.println(stringValue);
    }



    }
}
