package calcapp.main;
/*import文はこのような記載でも可能
 * 
 * */

import calcapp.logics.*;//calcapp.logics.CalcLogicをインポート

public class Main6_9 {
	public static void main(String[] args) {
		int a =10;
		int b =2;
		int total = CalcLogic.tasu(a , b);
		int delta = calcapp.logicCalcsLogic.hiku(a , b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	
}
