package ch5;

/*メインメソッド以外からのメソッド呼び出し
 * ①→④へ
 * 先頭にmain以外のメソッドを置いてプログラムを実行しても、mainメソッドから動くことを確認する。
 * */
public class Main5_3 {
	//先頭にmain以外のメソッドを置いている
	public static void methodA() { //　
		System.out.println("methodA");//②
		methodB();// methodBメソッドの呼び出し（引数）　③

	}

	public static void methodB() {
		System.out.println("methodB");//④
	}

	public static void main(String[] args) {
		methodA();// methodAメソッドの呼び出し①
	}

}
