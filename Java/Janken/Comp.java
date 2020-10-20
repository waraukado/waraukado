import java.util.Random;


public class Comp extends Character{
	// Computerの手入力（ランダム）
	void ComputerInput(){
		Random rnd = new Random();
		this.JankenNum = rnd.nextInt(3);
	}
}