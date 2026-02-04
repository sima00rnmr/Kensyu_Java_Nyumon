package ch5;
/*return文の後に処理は書けない
 * ※エラー文
 * 
 * return文は値を戻すだけではなく、メソッドの終了も行う 
→その後ろに処理を書くことが出来ない

*/
public class Main5_9 {

	public static int sample() {
・
・
・
return 1;
int x=10; // この一文が実行されないためエラーを起こす
	}

}
