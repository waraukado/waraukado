public class Hero {
	String name; // 名前
	int hp; // ＨＰ
	static final int MAX_HP = 100;
	Sword sword; //勇者が装備している剣

	//攻撃
	public void attack(Dragon d){
		int damage;
		if(this.hp < Hero.MAX_HP * 0.2) {
			damage = (int)this.sword.damage/2;
		}else {
			damage = this.sword.damage;
		}
		d.hp -= damage;
		System.out.println("勇者" + this.name + "の攻撃！　ドラゴンに" + damage + "のダメージ");
		if(d.hp <=0 ){d.defeat();}
	}
	//力尽きた
	public void defeat(){
		System.out.println("勇者" + this.name + "は力尽きた・・・");
	}


	// コンストラクター
	Hero(String name,int hp){
		this.name = name;
		this.hp = hp;
	}
	Hero(String name){
		this(name,Hero.MAX_HP);
	}
	Hero(){
		this("ダミー");
	}
}