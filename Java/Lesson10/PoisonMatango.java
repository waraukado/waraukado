public class PoisonMatango extends Matango {
	//毒攻撃可能回数
	int cnt = 5;

	//攻撃（オーバーライド）
	public void attack(Hero h) {
		//①通常攻撃
		super.attack(h);
		if(this.cnt > 0) { //②毒攻撃の残りがあるか？
			System.out.println
			("さらに毒の胞子をばらまいた！");
			int damage = h.hp / 5; //③HeroのHPの1/5
			System.out.println
			(damage  + "ポイントのダメージ");
			h.hp -= damage; //④HeroのHPを減らす
			this.cnt--; //⑤毒攻撃可能回数マイナス１
		}
	}

	PoisonMatango(char suffix){
		super(suffix);
	}
}
