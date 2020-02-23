import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws Exception{
        //Teamインスタンス生成
        Team teams[] = {new Team("ライナーズ"),new Team("シャトルズ"),
                        new Team("レッドスパークス"),new Team("シーウェーブス"),
                        new Team("ウォーターガッシュ"),new Team("ブルーズマーズ"),
                        new Team("ヴォルテクス"),new Team("ブルーシャークス")};
        //CSVファイル読み込み
        // Paths.get() の引数は環境により指定
        
        Path path1 = Paths.get("Score.csv");
        Charset charset = Charset.forName("UTF-8");
        
        try {
        	List<String> line = Files.readAllLines(path1,charset);
            for (String s : line) {
                //String sdata[] = s.split(",");
                int[] i_sdata = Stream.of(s.split(",")).mapToInt(Integer::parseInt).toArray();
                //集計
                ScoreAgg(i_sdata,teams);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //表示
        ScoreDisp(teams);
        
        //プロパティファイル出力
        PfileWrite(teams[2]);
    }

    //集計
    public static void ScoreAgg(int[] a,Team[] teams){
        //総得点加算
        teams[a[0]-1].setTokuten(teams[a[0]-1].getTokuten() + a[2]); //HOME;
        teams[a[1]-1].setTokuten(teams[a[1]-1].getTokuten() + a[3]); //AWAY
        //総失点加算
        teams[a[0]-1].setShiten(teams[a[0]-1].getShiten() +  a[3]); //HOME
        teams[a[1]-1].setShiten(teams[a[1]-1].getShiten() +  a[2]); //AWAY
        //総トライ数加算
        teams[a[0]-1].setTrys(teams[a[0]-1].getTrys() + a[4]); //HOME
        teams[a[1]-1].setTrys(teams[a[1]-1].getTrys() + a[5]); //AWAY
        //勝ち点計算
        if(a[2] > a[3]){ //HOME勝ち
            teams[a[0]-1].setWinpoint(teams[a[0]-1].getWinpoint() + 4);
            teams[a[0]-1].setWin(teams[a[0]-1].getWin() + 1);
            teams[a[1]-1].setLose(teams[a[1]-1].getLose() + 1);
            if(a[2] - a[3] <= 7){ //AWAY７点差以内負け
                teams[a[1]-1].setWinpoint(teams[a[1]-1].getWinpoint() + 1);
            }

        }else if(a[2] < a[3]){ //AWAY勝ち
            teams[a[1]-1].setWinpoint(teams[a[1]-1].getWinpoint() + 4);
            teams[a[1]-1].setWin(teams[a[1]-1].getWin() + 1);
            teams[a[0]-1].setLose(teams[a[0]-1].getLose() + 1);
            if(a[3] - a[2] <= 7){ //HOME７点差以内負け
                teams[a[0]-1].setWinpoint(teams[a[0]-1].getWinpoint() + 1);
            }
        }else{ //引き分け
            teams[a[0]-1].setWinpoint(teams[a[0]-1].getWinpoint() + 2);
            teams[a[1]-1].setWinpoint(teams[a[1]-1].getWinpoint() + 2);
            teams[a[0]-1].setDrow(teams[a[0]-1].getDrow() + 1);
            teams[a[1]-1].setDrow(teams[a[1]-1].getDrow() + 1);
        }
        //ボーナス点計算
        if(a[4] - a[5] >=3){ //HOME 3トライ差以上
            teams[a[0]-1].setWinpoint(teams[a[0]-1].getWinpoint() + 1);
        }
        if(a[5] - a[4] >=3){ //AWAY 3トライ差以上
            teams[a[1]-1].setWinpoint(teams[a[1]-1].getWinpoint() + 1);
        }
    }

    //表示
    public static void ScoreDisp(Team[] teams){
        // 見出しを表示する場合はココに
        for(Team T : teams){
            System.out.println(T.getName()+ "：" + T.getWin() + "勝"
                               +T.getLose() + "敗" + T.getDrow()
                               + "分　" + T.getWinpoint()+ "点");
        }
    }

    //プロパティファイル出力
    public static void PfileWrite(Team teams){
        String strpass = "score.propertise";  // プロパティファイルのパス
        Properties p = new Properties();
        try {
            // 書き込み
            p.setProperty("name", teams.getName());
            p.setProperty("teamno", String.valueOf(teams.getTeamno()));
            p.setProperty("win", String.valueOf(teams.getWin()));
            p.setProperty("lose", String.valueOf(teams.getLose()));
            p.setProperty("drow", String.valueOf(teams.getDrow()));
            p.setProperty("tokuten", String.valueOf(teams.getTokuten()));   
            p.setProperty("shiten", String.valueOf(teams.getShiten()));
            p.setProperty("trys", String.valueOf(teams.getTrys()));
            p.setProperty("winpoint", String.valueOf(teams.getWinpoint()));
            p.store(new FileOutputStream(strpass), "Team Data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
