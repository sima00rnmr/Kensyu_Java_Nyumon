package ch10;

public class PoisonMatango extends Matango {	
	/*PoisonMatangoは毒を用いた攻撃が可能な限り
	 *残り回数をintフィールドとして持っており、初期値は5*/
	int PoisonCount = 5;

	public PoisonMatango(char suffix) {//PoisonMatango pm = new PoisonMatango('A')でインスタンス化出来るクラスとする
		super(suffix);
	}

	public void attack(Hero h) { //他のMatangoと同様attackを行い、その際の挙動として毒による攻撃がある
		super.attack(h);
		if (this.PoisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;//勇者のHPの	1/5を削る
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ");
			this.PoisonCount--;//毒攻撃の回数を減らす
		}

	}

	

	

	//

}
