import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CsvRead{
    public static void main(String[] args){
        // 指定した場所からＣＳＶファイルを読み込み
        Path path1 = Paths.get("Score.csv");
        Charset charset = Charset.forName("UTF-8");

        try {
            List<String> line = Files.readAllLines(path1,charset);
            //CSVから１行ずつ読み込んで処理
            //　例）"2,6,45,17,7,3"
            
            for (String s : line) {
                //カンマ区切りで分割してString型配列に格納
                String sdata[] = s.split(","); 
                //　例）sdata={"2","6","45","17","7","3"}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}