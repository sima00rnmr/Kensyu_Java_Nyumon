package ch11;

public class Hero {
	String name = "ミナト";
	int hp = 100;

	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");

	}

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");

	}

	public static void main(String[] args) {

	}

	//10_7より追記　継承できないslipを設定
	// 転ぶ 
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転倒した！");
		System.out.println("5のダメージ！");

	}

	/*10_10で使用
	 * 継承とコンストラクタで使用
	 * */
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");

	}

}
