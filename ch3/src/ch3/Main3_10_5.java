package ch3;
/*3_8_6 練習問題
 * 乱数を用いて数あてゲームのコードを作成する*/
public class Main3_10_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("【数あてゲーム】");
		// 乱数を用いて0-9の整数を1つ生成する
		int ans = new java.util.Random().nextInt(10);
		//for構文を使って5回処理(i)する
		for (int i = 0;i < 5;i++) {
			System.out.println("0～9の数字を入力してください");
			// 整数の入力を受け付ける
			int num = new java.util.Scanner(System.in).nextInt();
			//　変数ansと変数numが同じ場合は当たりの表記　異なる場合ははずれと表示して処理を続ける
			if (num == ans){
				System.out.println("当たり！");
				//当たった場合は処理を終了（ゲーム終了）する
				break;
			}else {
				System.out.println("違います");
				
			}
		}
		//ブロック外でゲームを終了しますの表記
		System.out.println("ゲームを終了します");
		
	}

}
