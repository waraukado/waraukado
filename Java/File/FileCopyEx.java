import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
    // FileInputStreamとFileOutputStreamを使用したファイルのコピー
  public static void main(String[] args) {
    try (FileInputStream in = new FileInputStream("D:/GitHub/waraukado/Java/File/sample.jpg");
        FileOutputStream out = new FileOutputStream("D:/GitHub/waraukado/Java/File/sample2.jpg")) {
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