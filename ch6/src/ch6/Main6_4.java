
/*クラスをパッケージに所属させる
 *6_5のコード
 * 
 * */
package calcapp.main;

public class Main6_4 {//本誌ではclass Calc


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
