package ch9;
/*Heroクラスの定義
 * 
 * 
 * 
 * */
public class Hero {
	int hp;
	String name;
	Sword sword;
	
	public void attak() {
		System.out.println(this.name+"は攻撃した");
		System.out.println("敵に5ポイントのダメージを与えた");
	}

}
