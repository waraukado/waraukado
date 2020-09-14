public class Fighter {
    String name; // 名前
	int hp; // ＨＰ
    static final int MAX_HP = 100;
    Sword sword; //戦士が装備している剣

	//攻撃
	public void attack(Dragon d){
		int damage;
		if(this.hp < Fighter.MAX_HP * 0.2) {
			damage = (int)this.sword.damage/2;
		}else {
			damage = this.sword.damage;
		}
        d.hp -= damage;
        System.out.println("戦士" + this.name + "の攻撃！　ドラゴンに" + damage + "のダメージ");
        if(d.hp <=0 ){d.defeat();}
    }
    //力尽きた
	public void defeat(){
		System.out.println("戦士" + this.name + "は力尽きた・・・");
    }


	// コンストラクター
	Fighter(String name,int hp){
		this.name = name;
		this.hp = hp;
	}
	Fighter(String name){
		this(name,Fighter.MAX_HP);
	}
	Fighter(){
		this("ダミー");
	}
}