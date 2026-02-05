package ch5;
/*5_8_3 練習問題
 *8_2の問題にメソッドemailをオーバーロード
 * 
 * */
public class Main5_15_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String titele = "x" ;
		String address ="y" ;
		String text = "z" ; //念のため残していたけど…不要？
		
		email (titele,address);//引数の数が同じ②が呼び出される（型がいずれもStringで同じだから引数の数で判断する）

	}

	public static void email(String titele,String address,String text) {//引数が3つ　今回呼び出されない…①
		System.out.println(address+"に以下のメールを送信しました");
		System.out.println("件名："+titele );
		System.out.println("本文："+text);
	}
	public static void email(String address,String text) {//引数が2つ　こちらが呼び出される…②
		System.out.println(address+"に以下のメールを送信しました");
		System.out.println("件名：無題" );
		System.out.println("本文：" + text);
	}
}
