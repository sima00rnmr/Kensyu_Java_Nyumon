package ch10;

/*Heroクラスを発展させたSuperHeroクラス。
 * これなら簡単だし便利！…？
 * 
 * →Heroクラスに新しいメソッドを追加したら
 * こちらのクラスも変更しなきゃいけなくなるのでは…？
 * 例えば…Heroクラスにmpを追加したら同様のコードをこっちに記載する必要がある
 * 
 * */

public class SuperHero_0 {

	String name = "ミナト";
	int hp = 100;
	boolean flying;//flyingのフィールドを追加（true/false）

	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");

	}

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

	//飛ぶ
	public void fly() {//flyの追加
		this.flying = true;//flingに成功したときの判定
		System.out.println(this.name + "は飛び上がった！");
	}

	//着地する
	public void land() {//landの追加
		this.flying = false;//flingに失敗したときの判定
		System.out.println(this.name + "は着地した！");

	}
}
