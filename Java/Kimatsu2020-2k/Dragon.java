import java.util.Random;
public class Dragon {
	String name = "ドラゴン";
	int hp = 150;
	int damage = 15;

	// 攻撃
	public void attack(Hero h){
		int a_damage = new Random().nextInt(21) + damage; // ダメージ量を決定（基本ダメージ＋0～20）
		System.out.print("ドラゴンの攻撃　");
		//攻撃対象：勇者
		h.hp = h.hp - a_damage;
		System.out.println("勇者" + h.name + "は" + a_damage + "のダメージを受けた");
		if(h.hp <= 0){h.defeat();} // 勇者が力尽きたか？判定
	}

	public void attack(Fighter f){
		int a_damage = new Random().nextInt(21) + damage; // ダメージ量を決定（基本ダメージ＋0～20）
		System.out.print("ドラゴンの攻撃　");
		//攻撃対象：戦士
		f.hp -= a_damage;
		System.out.println("戦士" + f.name + "は" + a_damage + "のダメージを受けた");
		if(f.hp <= 0){f.defeat();} // 戦士が力尽きたか？判定
	}

	public void attack(Wizard w){
		int a_damage = new Random().nextInt(21) + damage; // ダメージ量を決定（基本ダメージ＋0～20）
		System.out.print("ドラゴンの攻撃　");
		//攻撃対象：魔法使い
		w.hp -= a_damage;
		System.out.println("魔法使い" + w.name + "は" + a_damage + "のダメージを受けた");
		if(w.hp <= 0){w.defeat();} // 魔法使いが力尽きたか？判定
	}

	
	//力尽きた
	public void defeat(){
		System.out.println("ドラゴンを倒した！！");
	}


}
