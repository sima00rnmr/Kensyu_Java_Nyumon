package ch11;

public class Character {
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name+"は逃げ出した！");
	}
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name+"の攻撃！");
		/*どれくらいの攻撃力を持ったキャラクターになるのか
		 * 設定できないよ…でも、attackを都度作るのも面倒だし…
		 */
		m.hp -=??; 
		System.out.println("敵に??のダメージを与えた！");
	}
}
