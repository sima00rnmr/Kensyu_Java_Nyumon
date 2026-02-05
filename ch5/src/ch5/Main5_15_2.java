package ch5;
/*5_8_2 練習問題
 * 複数の引数を用いて表示
 * 
 * */
public class Main5_15_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// String型だから""を忘れないで！
		String titele = "x" ;
		String address ="y" ;
		String text = "z" ;
		
		email(titele,address,text);

	}

	public static void email(String titele,String address,String text) {//voidを忘れないで…！
		System.out.println(address+"に以下のメールを送信しました");
		System.out.println("件名："+titele );
		System.out.println("本文："+text);
	} 
}
