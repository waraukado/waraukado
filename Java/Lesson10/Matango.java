public class Matango {
	int hp = 50; // ＨＰ
	char suffix; // 識別

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println
		("キノコ" + this.suffix + "の攻撃！");
		System.out.println
		("10ポイントのダメージをあたえた！");
		h.hp -= 10;
	}
}
