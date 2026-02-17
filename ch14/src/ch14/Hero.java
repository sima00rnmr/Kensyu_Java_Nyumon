package ch14;
 /*h1==h2か否かを判断するのではなく中身を見て判断する場合の
  *コードの修正equals以下
  * 　
  */
public class Hero {
	int hp;
	String name;
	static int money;

	public String toString() {
		return "名前:" + this.name + "/HP:" + this.hp;
	}

	public boolean equals(Object o) {//名前が等しいかどうかで判断
		if (this == o) {
			return true;
		}
		if (o instanceof Hero h) {
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}

	
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random()*1000);
	}
	
}
