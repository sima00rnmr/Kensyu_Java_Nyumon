package ch11;

/*抽象メソッドを含むのでpublic abstract class クラス名｛
 * で宣言しないとコンパイルエラーを起こす
 * 
 */
public abstract class Character {
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name+"は逃げ出した！");
	}
	//戦う
	/*
	 *  public abstract 戻り値の型　メソッド名(引数);
	 * を用いることで抽象メソッドにすることができる
	 * 
	 * */
	public abstract void attack(Matango m);
	
    /* {
		System.out.println(this.name+"の攻撃！");
		/*どれくらいの攻撃力を持ったキャラクターになるのか
		 * 設定できないよ…でも、attackを都度作るのも面倒だし…
		 *
		m.hp -=??; 
		System.out.println("敵に??のダメージを与えた！");
	}
*/
}
