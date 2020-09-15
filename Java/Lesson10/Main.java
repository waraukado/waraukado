
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//SuperHero sh = new SuperHero("S勇者");
		Hero h = new Hero("勇者");


		Matango pm = new PoisonMatango('A');
		//h.flying = true; //飛んでる状態
		h.attack(pm);
		pm.attack(h);
	}

}
