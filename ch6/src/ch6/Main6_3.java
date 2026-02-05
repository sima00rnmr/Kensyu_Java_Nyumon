package ch6;
/*6_1のメインメソッド部分のみの記載（分割する
 * メインメソッド内の修正
 * →13,14行目を修正
 * 
 * 修正前のコードを6_3、修正後を6_4としていたので
 * このソースファイルを_3及び_4のファイルとする
 * 
 * ）*/
public class Main6_3 {// 

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a =10;
		int b = 2;
		
		/*本来、tasu,hiku だけでは情報がないためエラーになるが
		 * クラス名の[Main6_2]を記載することによって、
		 * Main6_2のソースファイル上に存在する
		 * tasuとhikuのメソッドを参照することができる。
		 * */
		int total = Main6_2.tasu( a , b ); 
		int delta = Main6_2.hiku( a , b );
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}
