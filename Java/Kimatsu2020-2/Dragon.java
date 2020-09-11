import java.util.Random;
public class Dragon {
	private String name = "ドラゴン";
	private int hp = 150;
	private int damage = 15;

	// 攻撃
	public void attack(Hero h){
		int a_damage = new Random().nextInt(21) + damage; // ダメージ量を決定（基本ダメージ＋0～20）
		System.out.print("ドラゴンの攻撃　");
		//攻撃対象：勇者
		h.setHp(h.getHp() - a_damage);
		System.out.println("勇者" + h.getName() + "は" + a_damage + "のダメージを受けた");
		if(h.getHp() <= 0){h.defeat();} // 勇者が力尽きたか？判定
	}

	public void attack(Fighter f){
		int a_damage = new Random().nextInt(21) + damage; // ダメージ量を決定（基本ダメージ＋0～20）
		System.out.print("ドラゴンの攻撃　");
		//攻撃対象：戦士
		f.setHp(f.getHp() - a_damage);
		System.out.println("戦士" + f.getName() + "は" + a_damage + "のダメージを受けた");
		if(f.getHp() <= 0){f.defeat();} // 戦士が力尽きたか？判定
	}
	
	public void attack(Wizard w){
		int a_damage = new Random().nextInt(21) + damage; // ダメージ量を決定（基本ダメージ＋0～20）
		System.out.print("ドラゴンの攻撃　");
		//攻撃対象：魔法使い
		w.setHp(w.getHp() - a_damage);
		System.out.println("魔法使い" + w.getName() + "は" + a_damage + "のダメージを受けた");
		if(w.getHp() <= 0){w.defeat();} // 魔法使いが力尽きたか？判定
	}

	public void attack(Hero h,Fighter f,Wizard w){
		int hantei = new Random().nextInt(3); //　攻撃対象をランダムに決定
		int a_damage = new Random().nextInt(21) + damage; // ダメージ量を決定（基本ダメージ＋0～20）
		System.out.print("ドラゴンの攻撃　");
			if(hantei == 0) {
				//攻撃対象：勇者
				h.setHp(h.getHp() - a_damage);
				System.out.println("勇者" + h.getName() + "は" + a_damage + "のダメージを受けた");
				if(h.getHp() <= 0){h.defeat();} // 勇者が力尽きたか？判定
			}else if(hantei==1) {
				//攻撃対象：戦士
				f.setHp(f.getHp() - a_damage);
				System.out.println("戦士" + f.getName() + "は" + a_damage + "のダメージを受けた");
				if(f.getHp() <= 0){f.defeat();} // 戦士が力尽きたか？判定
			}else {
				//攻撃対象：魔法使い
				w.setHp(w.getHp() - a_damage);
				System.out.println("魔法使い" + w.getName() + "は" + a_damage + "のダメージを受けた");
				if(w.getHp() <= 0){w.defeat();} // 魔法使いが力尽きたか？判定
			}
	}

	//力尽きた
	public void defeat(){
		System.out.println("ドラゴンを倒した！！");
	}

	// getter setterメソッド
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return this.damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
}
