
public class Wand {
	private String name; // 杖の名前
	private double power; // 杖の攻撃力

	// getter、setterメソッド
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	// コンストラクタ
	Wand(String name,double power){
		this.name = name;
		this.power = power;
	}
	Wand(String name){
		this(name,1.0);
	}
	Wand(double power){
		this("木の棒",power);
	}
	Wand(){
		this("木の棒",1.0);
	}

}
