package ch6;

/*計算機プログラム
 * メソッドtasu 
 * メソッドhiku
 *　数値は　a=10 b=2 ←引数で作成 
 */
public class Main6_1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = (a + b);
		int delta = (a - b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

	public static int tasu(int a, int b) {
		return (a + b);
	}

	public static int hiku(int a, int b) {
		return (a - b);
	}
}
