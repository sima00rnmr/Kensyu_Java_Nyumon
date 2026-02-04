package ch3;

/*3_8_5練習問題
 * switch構文を使ってコードを書く
 * 
 *  print>2_6_2
 *  数字をいれる>2_6_6
 *  switch>3_4_2
 *  defaultの処理について>p120 */
public class Main3_10_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("[メニュー]1:検索2:登録3:削除4:変更＞");
		int selected = new java.util.Scanner(System.in).nextInt();

		switch (selected) {
		case 1 -> {
			System.out.println("検索します");
		}
		case 2 -> {
			System.out.println("登録します");
		}
		case 3 -> {
			System.out.println("削除します");
		}
		case 4 -> {
			System.out.println("変更します");
		}
		/*変数　selectedが1-4の何れでもない場合は何もしないため、デフォルトの記述は不要。
		 * 特段何か記載が無い場合は省略してOK　P120
		default -> {
			System.out.println("");
		}
		*/
		}

	}

}
