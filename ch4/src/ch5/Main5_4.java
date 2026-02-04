package ch5;

/*引数を１つだけ渡す
 * ※引数　メソッドをよびだすさいに、呼び出し元から値を渡す事ができる。
 * この時に渡される値の事
 * */
public class Main5_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("メソッドを呼び出します");
		hello("湊");//"湊"を渡してhelloメソッドを呼び出す
		hello("朝香");//"朝香"を渡してhelloメソッドを呼び出す
		hello("菅原");//"菅原"を渡してhelloメソッドを呼び出す
		System.out.println("メソッドを呼び出しが完了しました");
	}

	public static void hello(String name) {//hello()の中身を引っ張ってくるよ、以下（）で値を使うことが出来るよ、の意
		System.out.println(name + "さん、こんにちは");

	}
}
