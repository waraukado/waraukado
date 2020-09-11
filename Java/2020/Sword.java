public class Sword {
	private String name; // 剣の名前
	private int damage; // 剣の攻撃力

	// getter、setterメソッド
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return this.damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
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
