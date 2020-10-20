import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		// 初期化
		String JankenTe[]={"✊","✌","✋"}; //じゃんけんの手表示用
		int setcnt=0; //スコア用　Nセット

		// インスタンス生成
		Player P1 = new Player();
		Comp C1 = new Comp();

		//　現在日時を表示
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E) aHH時mm分"); //日時表示フォーマット設定
		LocalDateTime ld = LocalDateTime.now(); //現在日時を取得
		System.out.println(ld.format(dtf));

		//ユーザー名入力（追加機能・なくてもＯＫ　不要な場合は以下2行をコメントアウト）
		System.out.println("名前を入力してください");
		P1.Pname = new java.util.Scanner(System.in).nextLine();

		//説明メッセージ
		System.out.println("2勝で1セット取得！2セット先取で勝利となります。");
		System.out.println("じゃんけんの手を数字で入力してください。　0：グー　1:チョキ　2:パー");


		//2セット先取 START
		while(P1.SetCNT < 2 && C1.SetCNT < 2){ //どちらかの獲得セット数が２になるまで繰り返す（２よりも少ない間繰り返す）

			//2勝で1セット START
			while(P1.Score[setcnt][1] < 2 && P1.Score[setcnt][2] < 2){ //プレイヤーの勝利数が２か負け数が２（コンピュータの勝数２）になるまで繰り返す（２よりも少ない間繰り返す）
				System.out.println("じゃんけんぽん！");

				// Playerの手入力
				P1.PlayerInput();

				// Computerの手入力（ランダム）
				C1.ComputerInput();

				System.out.print(P1.Pname + "："); //勝敗表示前にプレイヤー名を表示
				System.out.print(JankenTe[P1.JankenNum] + "　vs　" + JankenTe[C1.JankenNum] + "　");
				// 勝敗判定メソッドを呼び出し Syouhai
				int kekka= Syouhai(P1.JankenNum,C1.JankenNum);
				//playerの勝敗を基準に　あいこ：0、勝利：1、敗北：2が返ってくる。
				P1.Score[setcnt][kekka]++;
			}
			// 2勝で1セットEND

			// 結果出力
			System.out.println(P1.Score[setcnt][1] + "　勝　" + P1.Score[setcnt][2]+ "　負　"+ P1.Score[setcnt][0] + "引き分け");

			// どちらがセットを取得したか判定。　Score[1]はPlayerが勝った数を数えている。
			if(P1.Score[setcnt][1]==2){ 	//player勝利
				P1.SetCNT++;
			}else{ 				//comp勝利
				C1.SetCNT++;
			}
			//セットカウント表示
			System.out.println("◆◇◆◇◆　セットカウント　◆◇◆◇◆");
			System.out.println(P1.Pname + "　" + P1.SetCNT + "　－　" + "Computer　" + C1.SetCNT);

			//セット数加算
			setcnt++;

		}//2勝で1セット END

		//最終結果表示
		String LastKekka;
		if(P1.SetCNT==2){
			LastKekka ="勝ち";
		}else{
			LastKekka ="負け";
		}
		System.out.print("\n");
		System.out.println("◆◇◆◇◆　最　終　結　果　◆◇◆◇◆");
		System.out.println("◆◇◆◇◆　　　" + LastKekka + "　　　◆◇◆◇◆");
		System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println(P1.Pname + "　" + P1.SetCNT + "　－　" + "Computer　" + C1.SetCNT);
		for(int i=0;i<3;i++){
			System.out.println(i+1 + "Set：" + P1.Score[i][1] + "勝" + P1.Score[i][2] +"負" + P1.Score[i][0] +"分");
		}

	//2セット先取 END
	}


	//勝敗判定メソッド　Syouhai
	private static int Syouhai(int player,int computer){
		//playerの勝敗を基準に　あいこ：0、勝利：1、敗北：2を返す
		int kekka=0;
		int WinTe[] = {1,2,0}; //player勝利の組み合わせ

		if(player == computer){
			System.out.println("△");
			kekka = 0;
		}else if(WinTe[player]==computer){
			System.out.println("◎");
			kekka = 1;
		}else{
			System.out.println("×");
			kekka = 2;
		}
		return kekka;
	}
}
