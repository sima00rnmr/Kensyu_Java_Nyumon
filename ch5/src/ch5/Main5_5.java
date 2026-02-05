package ch5;

/*5_5
 * 複数の引数を渡す
 *  public static void メソッド名(引数リスト) {
 *  メソッドの処理
 *  ｝
 *  の流れ…
 * 
 * */
public class Main5_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		add(100, 20);//…①
		add(200, 50);//…②

	}

	//複数の引数を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);//①、②それぞれの処理の結果が出てくる（①100+20,②200+50）
	}

}
