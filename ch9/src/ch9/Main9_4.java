package ch9;

/*
 * 
 * コンストラクタ：
 * newされた直後に自動的に設定される
 * 特別なメソッドのこと
 * ●定義の仕方
 * public class　クラス名{
 * 		public クラス名(){
 * 			自動的に設定する処理
 * 			}
 * 		}
 * 		①クラス名=メソッド名
 * 		②メソッド宣言に戻り値の型が設定されてない（voidもダメ）
 * 		場合、コンストラクタとみなされる
 * 
 * 
 * 
 * */
public class Main9_4 {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";//剣の名前の定義
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";//勇者の名前の定義
		/*まだhpの初期化をしていないように見えるが…
		 * ①コンストラクタによって100が代入されている
		 * ②初期化によってその値が代入されている
		 * */
		System.out.println(+h.hp);//9_8.9_9の内容を確かめる…①　

		h.hp = 200;
		System.out.println(+h.hp);//9_8.9_9の内容を確かめる…②　
		h.sword = s;//勇者hが持っている剣の定義（sで既に定義しているのでそれを使う）
		System.out.println("現在の武器は" + h.sword.name);//勇者(h)の武器(sword)の名前(name)

	}

}
