package ch9;

public class Main9_4 {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";//剣の名前の定義
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";//勇者の名前の定義
		h.hp = 100;
		h.sword = s;//勇者hが持っている剣の定義（sで既に定義しているのでそれを使う）
		System.out.println("現在の武器は" + h.sword.name);//勇者(h)の武器(sword)の名前(name)
	}

}
