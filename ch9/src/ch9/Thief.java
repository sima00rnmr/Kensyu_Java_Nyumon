package ch9;

public class Thief {
	String name;
	int hp;
	int mp;
// 名前、hp,mpをそれぞれ指定して、インスタンス化することができる
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
//名前、hpをそれぞれ指定してインスタンス化することができる。 mpは5で初期化
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
//名前を指定してインスタンス化することができる。hpは40、mpは5でそれぞれ初期化
	public Thief(String name) {
		this(name, 40);
	}

}
