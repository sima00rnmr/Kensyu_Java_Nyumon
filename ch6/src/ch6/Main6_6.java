package ch6;
/*6_7 コード（１つずれている状態…）
*/

public class Main6_6 {
	public static void main(String[] args) {
		int a =10;
		int b =2;
		int total = ch6.logics.CalcLogic.tasu(a,b);
		int delta = calcapp.logics.CalcLogic.hiku(a,b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	
}
