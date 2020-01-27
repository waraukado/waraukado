import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class FileWriteEx {
    // ファイルにデータをLISTから書き込むサンプル
    public static void main(String[] args) {
    	// Paths.get() の引数は環境により指定
    	Path path1 = Paths.get("D:/GitHub/waraukado/Java/File/","test1.txt");
    	Charset charset = Charset.forName("MS932");
        List<String> list = new ArrayList<>(Arrays.asList("赤","黄","青"));
     
        try {
            Files.write(path1,list,charset, 
            		StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}