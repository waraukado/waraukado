import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// ドラゴンの攻撃対象用　※すでに力尽きたキャラへの攻撃は無効
		int a_party[] = {1,2,3}; // 1=勇者、2=戦士、3=魔法使い　力尽きた場合は0を格納
		int i_party;
		//
		Hero h = new Hero("ゆうしゃ",40);
		Fighter f = new Fighter("せんし",40);
		Wizard w = new Wizard("ウィザード",50,30);
		Dragon d = new Dragon();
		Sword s1 = new Sword("鋼の剣",15);
		Sword s2 = new Sword("鉄の剣",15);
		Wand t = new Wand("魔法の杖",1.2);
		h.sword = s1;
		f.sword = s2;
		w.wand = t;

		while(h.hp > 0 && d.hp > 0) { // while文は「○○○の間継続」ヒーローのHPが0より大きく　かつ　ドラゴンのHPが０より大きい間
			// Heroの攻撃
			if(h.hp > 0){
				h.attack(d);
				if(d.hp<=0){break;} // 攻撃終了時のドラゴンのHPチェック
			}

			// Fighterの攻撃
			if(f.hp > 0){
				f.attack(d);
				if(d.hp<=0){break;} // 攻撃終了時のドラゴンのHPチェック
			}

			// Wizardの回復行動（エイド）
			if(w.hp > 0){
				// 回復対象が力尽きていないか判定
				do{
					i_party = a_party[new Random().nextInt(2)]; // a_party配列から攻撃対象を決定。0はすでに力尽きたメンバーなので、0以外が選ばれるまで繰り返し
				}while(i_party == 0);

				switch(i_party){
					case 1:
						w.aid(h);
						break;
					case 2:
						w.aid(f);
						break;
				}
				i_party = 0; // 初期化
			}

			// ドラゴンの攻撃
			do{
				i_party = a_party[new Random().nextInt(a_party.length)]; // a_party配列から攻撃対象を決定。0はすでに力尽きたメンバーなので、0以外が選ばれるまで繰り返し
			}while(i_party == 0);

			switch(i_party){
				case 1: //攻撃対象：勇者
					d.attack(h);
					break;
				case 2: //攻撃対象：戦士
					d.attack(f);
					break;
				case 3: //攻撃対象：魔法使い
					d.attack(w);
					break;
			}

			// 勇者以外が力尽きたか判定
			if(f.hp <= 0){
				a_party[1] = 0; // 戦士が力尽きていた場合はa_partyの先頭から2番目に0を格納
			}
			if(w.hp <= 0){
				a_party[2] = 0; // 魔法使いが力尽きていた場合はa_partyの先頭から3番目に0を格納
			}
			i_party = 0; // 初期化

			System.out.println("=========================================");
		}
		// GAME OVER
		System.out.println("*****************************************");
		System.out.println("**               GAME OVER             **");
		System.out.println("*****************************************");
		System.out.println("勇者：" + h.name + " HP：" + h.hp);
		System.out.println("戦士：" + f.name + " HP：" + f.hp);
		System.out.println("魔法使い：" + w.name + " HP：" + w.hp + " MP：" + w.mp);
	}

}
