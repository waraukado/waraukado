public class Wizard {
    String name; // 名前
    int hp; // ＨＰ
    int mp; // MＰ
    static final int MAX_HP = 50;
    static final int MAX_MP = 30;
	Wand wand; //魔法使いが装備している杖


    // エイド（回復）勇者
    public void aid(Hero h){
        if(this.mp >=5){
            if(h.hp < (int)(Hero.MAX_HP * 0.2)){
                int recover =  (int)(this.wand.getPower() *5);
                h.hp += (int)(this.wand.getPower() *5);
                this.mp -= 5;
                System.out.println(this.name + "は、エイドを唱えた");
                System.out.println(h.name + "のHPが" + recover + "回復した" );
            }
        }else{
            System.out.println("MPがたりない！");
        }
    }

    // エイド（回復）戦士
    public void aid(Fighter f){
        if(this.mp >=5){
            if(f.hp < (int)(Fighter.MAX_HP * 0.2)){
                int recover =  (int)(this.wand.getPower() *5);
                f.hp += recover;
                this.mp -= 5;
                System.out.println(this.name + "は、エイドを唱えた");
                System.out.println(f.name + "のHPが" + recover + "回復した" );
            }
        }else{
            System.out.println("MPがたりない！");
        }
    }

    //力尽きた
	public void defeat(){
		System.out.println("魔法使い" + this.name + "は力尽きた・・・");
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