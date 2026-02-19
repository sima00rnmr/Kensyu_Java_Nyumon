package ch17;

/*try-with-resources文の利用
 * 
 * finallyブロックを記載しなくても、closeメソッドを呼び出してくれる
 * ーーーーーーーー
 * try(closeが必要な変数の宣言)｛
 * 本来の処理
 * ｝catch(例外クラス 変数名)｛
 * 例外が発生したときの処理
 * ｝
 * ーーーーーーーーーー
 * 17_6記載のコードを修正すると以下のようになる
 * 
 * 
 *
 * */
import java.io.FileWriter;

public class Main17_10 {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello!");

		} catch (Exception e) {
			System.out.println("何らかの例外が発生");
		}

	}

}
