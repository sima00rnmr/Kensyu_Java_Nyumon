package ch3;

/*冗長ですっきりしないコード*/
public class Main3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("貴方の運勢を占います");
		int fortrue = new java.util.Random().nextInt(4) + 1; //1~4の乱数が発生
		if (fortrue == 1) {
			System.out.println("大吉");
		} else if (fortrue == 2) {
			System.out.println("中吉");
		} else if (fortrue == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}

	}
}
