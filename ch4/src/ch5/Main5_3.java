package ch5;

/*メインメソッド以外からのメソッド呼び出し*/
public class Main5_3 {

	public static void methodA() {
		System.out.println("methodA");
		methodB();

	}

	public static void methodB() {
		System.out.println("methodB");
	}

}
