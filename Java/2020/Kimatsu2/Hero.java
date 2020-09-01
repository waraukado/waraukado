public class Hero {
	// 【属性】
	String name; // 名前
	int hp; // ＨＰ
  	int MAX_hp = 100;
	Sword sword; //勇者が装備している剣
	
	// 【操作】
	void attack(){
    
  	}
  	void defeat(){
    		
  	}
  

	// コンストラクター
	Hero(String name,int hp){
		this.name = name;
		this.hp = hp;
	}
	
	Hero(String name){
		this.name = name;
		this.hp = MAX_hp;
	}

	Hero(){
		this("ダミー");
	}
}
