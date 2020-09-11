
public class Fighter {
    private String name; // 名前
	private int hp; // ＨＰ
    private static final int MAX_HP = 100;
    Sword sword; //戦士が装備している剣

	//攻撃
	public void attack(Dragon d){
		int damage;
		if(this.hp < Fighter.MAX_HP * 0.2) {
			damage = (int)this.sword.getDamage()/2;
		}else {
			damage = this.sword.getDamage();
		}
        d.setHp(d.getHp()- damage);
        System.out.println("戦士" + this.getName() + "の攻撃！　ドラゴンに" + damage + "のダメージ");
        if(d.getHp() <=0 ){d.defeat();}
    }
    //力尽きた
	public void defeat(){
		System.out.println("戦士" + this.getName() + "は力尽きた・・・");
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
    public int getMAXHP(){
        return Fighter.MAX_HP;
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
