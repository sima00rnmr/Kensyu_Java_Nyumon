package ch3;
/*制御構造
 * 
 * forループの構造を二重にして九九一覧表を出力する*/
public class Main3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);//掛け算の結果を出力
				System.out.print(" ");//空白を出力
			}
			System.out.println("");//改行を出力
		}
	}

}
