package ch8;
/*インスタンス利用のまとめ
 *
 * フィールドを呼び出す
 * 変数名.フィールド名
 * 
 * メソッドを呼び出す
 * 変数名.メソッド名()
 * 
 * 
 * 
 * 
 * */


public class Main8_15 {//Matango
	int hp;
	final int LEVEL =10;
	char suffix;
	public void rnm() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	
	public static void main(String[] args) {
		Hero h =new Hero();
		h.name ="ミナト";
		h.hp = 100;
		
		matango m1 =new Matango();
		m1.hp =50;
		m1.suffix ='A';
		
		Matango m2= new Matango();
		m2.hp = 48;
		m2.suffix ='B';
		
		h.ship();
		m1.run();
		m2.run();
		h.run();
		
		
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix ='A'
				

	}

}
