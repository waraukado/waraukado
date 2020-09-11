
public class Wizard {
    private String name; // 名前
    private int hp; // ＨＰ
    private int mp; // MＰ
    private static final int MAX_HP = 50;
    private static final int MAX_MP = 30;
	Wand wand; //魔法使いが装備している杖

	
    // エイド（回復）勇者
    public void aid(Hero h){
        if(this.mp >=5){
            if(h.getHp() < (int)(h.getMAX_HP() * 0.2)){
                int recover =  (int)(this.wand.getPower() *5);
                h.setHp(h.getHp() + (int)(this.wand.getPower() *5));
                this.setMp(this.getMp() - 5);
                System.out.println(this.getName() + "は、エイドを唱えた");
                System.out.println(h.getName() + "のHPが" + recover + "回復した" );
            }
        }else{
            System.out.println("MPがたりない！");
        }
    }

    // エイド（回復）戦士
    public void aid(Fighter f){
        if(this.mp >=5){
            if(f.getHp() < (int)(f.getMAXHP() * 0.2)){
                int recover =  (int)(this.wand.getPower() *5);
                f.setHp(f.getHp() + recover);
                this.setMp(this.getMp() - 5);
                System.out.println(this.getName() + "は、エイドを唱えた");
                System.out.println(f.getName() + "のHPが" + recover + "回復した" );
            }
        }else{
            System.out.println("MPがたりない！");
        }
    }
    
    //力尽きた
	public void defeat(){
		System.out.println("魔法使い" + this.getName() + "は力尽きた・・・");
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
        return Wizard.MAX_HP;
    }
    public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
    }
    public int getMAXMP(){
        return Wizard.MAX_MP;
    }

    // コンストラクター
    Wizard(String name,int hp,int mp){
		this.name = name;
        this.hp = hp;
        this.mp = mp;
	}
	Wizard(String name,int hp){
		this(name,hp,Wizard.MAX_MP);
	}
	Wizard(String name){
		this(name,Wizard.MAX_HP,Wizard.MAX_MP);
	}
	Wizard(){
		this("ダミー");
	}
}
