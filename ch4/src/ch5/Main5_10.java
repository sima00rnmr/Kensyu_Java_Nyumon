package ch5;
/*オーバーロード　引数の型が異なる場合
 * 
 * 例え処理内容が似ていたとしても　メソッドに同じ名前をつけることは出来ない
 * オーバーロード(多重定義)…　
 * 例外的に同じ名前のメソッドを複数定義する方法
 * 
 * この例上にあるように
 * 仮引数の型がそれぞれ異なる場合は同じ名前のメソッドを複数定義することが可能
 * */
public class Main5_10 {
	
	/*確認のため　書籍（P189）上では、①→②→③の順に並んでいるが、
	 * ①→③→②の順に並べ替えても同じ結果が得られるか確認している
	 * */

	public static  int add(int x,int y) {//int型なので整数…①
	return	x + y;
		
	}
	public static String add(String x,String y) {// String型なのでテキスト…③
		return x + y;
	}
	
	public static double add(double x,double y) { // doble型なので小数…②
		return x + y;
	} 
	
	
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println(add(10,20));// ()の仮引数が整数の為１つめの　int add…記載の　addメソッド が呼び出される
		System.out.println(add(3.5,2.7));// ()の仮引数が少数の為2つめの　double add…記載の　addメソッド が呼び出される
		System.out.println(add("Hello","World"));// ()の仮引数がテキストの為3つめの　String add…記載の　addメソッド が呼び出される
		
	}

}
