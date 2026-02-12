package ch10;

public class SuperHero extends Hero {
	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println(this.name + "は飛び上がった！");//名前も継承しているか試してみる

	}

	public void land() {
		this.flying = false;
		System.out.println(this.name + "は着地した！");
		this.hp -= 5;// コストを払う…なんてことできるかな？テスト

	}

	//逃げる
	/*オーバーライド（再定義している）
	 * 逃げ出した→撤退した
	 * に上書きしている
	 */
	public void run() {
		System.out.println(this.name + "は撤退した！");
	}

	/*親インスタンス部へのアクセス
	 *superは今より1つ内側のインスタンス部分を表す予約語 
	 * */
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;
		System.out.println("10ポイントのダメージを与えた！");//SuperHeroクラスの通常攻撃のダメージは10とする
		super.attack(m);
		//親インスタンス部分のattack()を呼び出している
		if (flying) {
			super.attack(m);//親インスタンス部分のattack()を呼び出している
		}
	}

	/*10_10で使用
	 * 継承とコンストラクタで使用
	 * */
	public SuperHero() {
		super();
		System.out.println("SuperHeroのコンストラクタが動作");

	}

}
