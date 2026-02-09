package ch9;
/*コンストラクタをオーバーロードした際のクラスの利用
 * 
 * */
public class Main9_13 {

	public static void main(String[] args) {
		/*文字列引数があるため、
		 * 1つ目で指定したコンストラクタが適用され、
		 * h1はミナトと表示される*/
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.name);
		
		Hero h2 = new Hero();//引数がないため、Hero上で2つ目に設定したコンストラクタのダミーが適用される
		System.out.println(h2.name);
	}

}
