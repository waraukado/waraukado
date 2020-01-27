import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
public class FileCreateEx {
    // 新規で空ファイルを作成
    public static void main(String[] args) {
    	// Paths.get() の引数は環境により指定
    	Path path1 = Paths.get("D:/File/","test1.txt");
    	
        try {
            if (!Files.exists(path1)) { // path1に指定したファイルが存在しない場合作成
                Files.createFile(path1);
            }
	} catch (IOException e) {
			e.printStackTrace();
	}
    }
}
