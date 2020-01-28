import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileEnsyuu {

	public static void main(String[] args) {
		// Paths.get() の引数は環境により指定
    	Path path1 = Paths.get("M:\\java\\","TextWrite.txt"); // 元ファイルのパス
    	Path path2 = Paths.get("M:\\java\\","TextWrite2.txt"); // コピー先ファイルのパス

    	Charset charset = Charset.forName("MS932");

    	List<String> list = new ArrayList<>(Arrays.asList("〒024-0013　岩手県北上市藤沢22地割123番地1","北上コンピュータ・アカデミー","学籍番号：00000","菅原　健"));

        try {
            if (!Files.exists(path1)) { // path1に指定したファイルが存在しない場合作成
                Files.createFile(path1);
                Files.write(path1,list,charset,
                		StandardOpenOption.TRUNCATE_EXISTING);
            }
        } catch (IOException e) {
			e.printStackTrace();
        }

        // ファイルコピー


        try {
            Files.copy(path1,path2);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
