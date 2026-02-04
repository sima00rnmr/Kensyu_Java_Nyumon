package ch5;
/*5_11
 * オーバーロード　その２
 *引数の数が異なる場合
 *
 * 引数の型が同じでも、引数の数が異なる場合は
 * 引数の数で判別してメソッドを呼び出してくれる
 * →同じ名前のメソッドで定義をすることができる
 * 
 * オーバーロードはシグネチャが重複しない場合のみ許される
 * とおぼえておく
 * 
 * シグネチャ…
 * メソッド宣言の際に記述するメソッド名、引数の個数や型とその並び順のような情報の総称
 * 　	add(int x,int y) ←これのこと
 * */
public class Main5_11 {

	public static int add(int x,int y) {//1つ目のaddメソッド、引数の数は2つ…①
		return x + y;
	}
	public static int add(int x,int y,int z) {//2つめのaddメソッド、引数は3つ…②
		return x + y + z;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("10+20="+ add(10,20) );// 引数の数は2つなので①のaddメソッドを呼び出している
		System.out.println(("10+20+30=") + add(10,20,30));// 引数の数は3つなので②のaddメソッドを呼び出している
		
	}

}
