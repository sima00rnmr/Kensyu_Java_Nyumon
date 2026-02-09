package ch9;

public class Main9_6 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name ="ミナト";
		h1.hp = 100;//hpを初期化
		
		
		Hero h2 = new Hero();
		h2.name ="アサカ";
		h2.hp = 100;
		
		Wizard w = new Wizard();//Wizardクラスを定義する（healが使えるクラス）
		w.name ="スガワラ";
		w.hp = 50;
		//w.heal(ここに回復したい対象の名前を入れる)
		w.heal(h1);//スガワラ(w)がミナト(h1)のHPを10回復(heal)　100→110
		w.heal(h2);//スガワラがアサカのHPを10回復　100→110
		w.heal(h2);//スガワラがアサカのHPを10回復　100→120
		/*w.heal(w)
		 * これは出来なかった。
		 * 何故なら、Wizardクラスでhealが使える対象はHeroクラスのみであると定義をしているから
		 * …勇者クラス以外も回復の対象としたい場合はどうすればいいんだろう？
		 * */
		System.out.println("現在"+h1.name+"はHPが"+h1.hp+h2.name+"はHPが"+h2.hp);//答え合わせの行
	}

}
