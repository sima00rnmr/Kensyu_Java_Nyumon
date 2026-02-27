package ch12;

public abstract class Character {
	String name;
	int hp;

	public void run() {

	}
	/*
	 * 12_9の内容
	 * 引数にMonsterクラスを指定することで
	 * お化けキノコだけではなくMonsterを継承している
	 *子クラス全てをattackの対象としてみなすことができる 
	 * 
	 */
	public abstract void attack(Monster m);

}
