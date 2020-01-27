import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
    // FileInputStreamとFileOutputStreamを使用したファイルのコピー
  public static void main(String[] args) {
    try (FileInputStream in = new FileInputStream("C:/File/sample.jpg");
        FileOutputStream out = new FileOutputStream("C:/File/sample2.jpg")) {
        int data= in.read();
        while (data != -1) {
            out.write(data);
            data = in.read();
        }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
