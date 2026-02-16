package ch12;

public class Main12_1 {
	public static void main(String[] args) {
		
		/*Lifeって…インターフェースだったんじゃ？
		 *   →インスタンス化は出来ないけど型（箱）
		 *   としては使うことが出来るので
		 *   左辺に来る分には問題ない。
		 *   newする際、右辺は通常クラスである必要はある
		 *   Lifeという括り（箱）の中のウィザードだよ！
		 *   って、なってる
		 */
		Life lf =new Wizard(); 
	}

}
