public class Sword {
	String name; // 剣の名前
	int damage; // 剣の攻撃力


	// コンストラクタ
	Sword(String name,int damage){
		this.name = name;
		this.damage = damage;
	}
	Sword(String name){
		this(name,15);
	}
	Sword(int damage){
		this("鉄の剣",damage);
	}
	Sword(){
		this("鉄の剣",15);
	}

}