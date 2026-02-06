/*8_12 のコード
 * 
 * インスタンスのフィールド利用
 * 
 * 10で生成した勇者（インスタンス）には何も名前やHP（属性）がない状態
 * それをここではそれぞれのフィールドに値を代入していく
 * 
 * 
 *フィールドへの値の代入方法
 *変数名.フィールド名　=値；
 *で記載する
 *  
 * */
public class Main8_11 {

	public static void main(String[] args) {
		Hero h = new Hero ();

		h.name = "ミナト";
		h.hp = 100;

		System.out.println("勇者" + h.name + "を生み出した！");

	}

}
