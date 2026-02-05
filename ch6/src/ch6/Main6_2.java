package ch6;

/*メソッドtasu とメソッドhiku　を移動して
 * クラスを分割する
 * クラス名はMaiｎ6_2とする
 * 
 * */
public class Main6_2 {//この行のクラス名がmainメソッドで呼び出す際に必要な情報となる

	public static int hiku(int a, int b) {
		return (a - b);

	}

	public static int tasu(int a, int b) {
		return (a + b);

	}

}
