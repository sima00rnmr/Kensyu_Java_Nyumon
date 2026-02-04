package ch5;
/*戻り値の例
 * 
 * 値を戻す…
 * 呼び出されたメソッドから呼び出し元のメソッドに値を戻すこと
 * 
 * 戻り値（返り値）…
 * 値を戻す際に戻された値の事
 * 
 * */

public class Main5_7 {

	public static int add(int x,int y) {
		// TODO 自動生成されたメソッド・スタブ
		int ans = x +y;
		return ans; //ansの値を返してねー

	}
	public static void main(String[] args) {
		 add(100,10);//addメソッドの呼び出し
		System.out.println("100+10=" + ans);
	}

}
