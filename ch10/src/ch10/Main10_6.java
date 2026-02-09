package ch10;
/*上書きされる側が親
 * って考えるとイメージ湧きやすいのかも？
 * 
 * */
public class Main10_6 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.run();//逃げ出したと表示される
		
		SuperHero sh = new SuperHero();
		sh.run();//オーバーライドしているから撤退になるはず…

	}

}
