package ch8;
/*仮想世界に勇者を生み出すプログラム
 * 
 * インスタンスのメソッド呼び出し
 * 
 * */
public class Main8_13 {
	 	
		String name;
		int hp;

		public void sleep() {
			this.hp = 100;
			System.out.println(this.name + "は、眠ってしまった！");
		}

		/**座った（sit）ら
		 * 座った秒数（int sec）だけ
		 * HPを回復（this.hP += sec;）する
		 * 
		 * */
		public void sit(int sec) {
			this.hp += sec;
			System.out.println(this.name + "は" + sec + "秒座った");
			System.out.println("HPが" + sec + "ポイント回復した");

		}

		public void slip() {
			this.hp-=5;
			System.out.println(this.name+"は転んだ！");
			System.out.println("5のダメージ！");
		}

		public void run() {
			System.out.println(this.name+"は逃げ出した！");
			System.out.println("GAMEOVER");
			System.out.println("最終的なHPは"+this.hp+"でした");
		}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Hero h = new Hero ();
		h.name ="ミナト";
		h.hp = 100;
		
	System.out.println("勇者"+ h.name + "を生み出しました!");
	
	h.sit(5);
	h.slip();
	h.git();
	h.run();
		
	}

}
