package ch9;
/*二つのHero型変数を利用する
 * 
 * インスタンスの独立性：
 * 同じクラスから生まれても、異なるインスタンスであれば互いに影響を受けない
 * 
 * */

public class Main9_1 {

	public static void main(String[] args) {
		Hero h1;//ch9.Heroに定義済み
		h1 = new Hero();//h1の定義
		h1.hp = 100;//h1の初期化
		Hero h2;
		h2 = new Hero();//h1の定義
		System.out.println(h1.hp);//ここでは100になる

		h1 = h2;//番地情報のコピーなのでこの段階ではh2にh1(=100)インスタンスの情報は入っていない
		System.out.println(h2.hp);//ここでは0になる 番地情報はあるけど数値の初期化を行っていないから
		h2.hp = 200;//ここで初めてh1=h2=200と定義される

		System.out.println(h2.hp);//ここでは200になる
		System.out.println(h1.hp);//ここでは200になる
	}

}
