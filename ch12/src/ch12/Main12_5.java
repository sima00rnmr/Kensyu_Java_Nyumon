package ch12;

public class Main12_5 {
	public static void main(String[] arge) {
		Slime s = new Slime();
		Monster m = new Slime();
		s.run();
		/*モンスター上にもrunの記載はあるが、
		 * Slime上で上書きされた内容が結果として出力されている
		 * 
		*/
		m.run(); 
	}
}
