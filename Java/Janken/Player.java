import java.util.InputMismatchException;
import java.util.Scanner;


public class Player extends Character{
	String Pname;
	void PlayerInput(){
		while(true) {
			Scanner scn = new Scanner(System.in);
			try{
				this.JankenNum = scn.nextInt();
				if(this.JankenNum>=0 && this.JankenNum<=2){
					//System.out.println(JankenTe[this.JankenNum]);
					break;
				}
				System.out.println("0から2の範囲の数字を入力してください");
			}
			catch(InputMismatchException e){
				System.out.println("数字を入力してください");
			}
		}
	}
}