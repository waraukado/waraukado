public class Hero {
	// 【属性】
	String name; // 名前
	int hp; // ＨＰ
	
	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージをあたえた！");
	}
	
	public void run() { //逃げる
		System.out.println(this.name + "は、逃げ出した！");
	}

	// コンストラクター
	Hero(String name,int hp){
		this.name = name;
		this.hp = hp;
	}
	Hero(String name){
		this.name = name;
		this.hp = 100;
	}

	Hero(){
		this("ダミー");
	}
}
