package ch13;

public class Hero {
	//フィールドは基本privareに設定する
	private String name;
	private int hp;
	private Sword sword;

	//メソッドは基本publicに設定する
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}

	/*dieメソッドはprivateに設定している
	 * このクラス以外からのアクセスを禁じている
	 */
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAMEOVERです。");
	}

	/*name（勇者の名前）に関しては
	 * 他のクラスのメソッドからも頻繁に呼ばれる。
	 * その場合、フィールド呼び出すためだけのメソッドを作成する必要がある
	 * フィールドへのアクセスはprivateで禁止だが
	 * このメソッドであればアクセス可なので
	 * 他のクラスは此処を通して呼び出す必要がある
	 * h.getNameで呼び出すことが出来る！
	 */
	public String getName() {
		return this.name;
	}

	/*フィールドのhpへはアクセス禁止だが、別のクラスの挙動を通じて
	 * 勇者のhpを増減させたい場合は
	 * sleep()やattack()メソッドを通せば可能
	 * 直接フィールドは弄れないし、こちらで増減の数値を
	 * 決定しているので
	 * 極端な話、宿屋クラスの設定ミスで勇者のhpを減らしちゃったり
	 * そんなミスを防げる
	 *
	 * */
	void sleep() { //修飾のないメソッドは自分の所属するパッケージまでならアクセスを許可している
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (hp <= 0) {
			this.die();
		}

	}

	public void setName(String name) {
		this.name = name;
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである、処理中断");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる、処理中断");
		}
		if (name.length() > 8) {
			throw new IllegalArgumentException("名前が長すぎる、処理中断");
		}
	}

}
