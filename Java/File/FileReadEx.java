import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
 
public class FileReadEx {
    // ファイルを読み込むサンプル
    public static void main(String[] args) {
    	// Paths.get() の引数は環境により指定
        Path path1 = Paths.get("D:/File/","test1.txt");
        Charset charset = Charset.forName("MS932");

        try {
        	List<String> line = Files.readAllLines(path1,charset);
            for (String s : line) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
