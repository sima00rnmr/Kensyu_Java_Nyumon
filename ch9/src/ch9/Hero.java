package ch9;
/*Heroクラスの定義
 * 
 * 
 * 
 * */
public class Hero {
	int hp;
	String name;
	Sword sword;
	
	public void attak() {
		System.out.println(this.name+"は攻撃した");
		System.out.println("敵に5ポイントのダメージを与えた");
	}
	public Hero(String name) { //以下9_8,9の内容　反映＞9_4　9_10
		/*以下を入れることで、
		 * Hero型でインスタンスを生成した時に
		 * 毎回hpを設定しなくてもよくなる
		 * 　　ゲームで全てのキャラクターに対して定義するの大変だもんね…
		 * 　＞複数人で開発をする場合はHeroクラスの作成者が責任を持つ方が良いらしい
		 * */
		this.hp =100; //hpフィールドを100で初期化
		this.name = name;//引数の値でnameフィールドを初期化している
		
	}
	/*9_12 コンストラクタのオーバーロード
	 * 忘れた…　オーバーロードとは
	 * 	同じ名前のメソッドを定義すること
	 * 　ここでは、Heroメソッドの定義を2回行っている　
	 * 　引数が異なるという点で差別化している
	 * 
	 * */
	public Hero() {//引数が異なるので同時に定義ができる
		this.name = "ダミー";
		/*Hero（）に対してはダミーの文字を初期値として入れることが出来る
		=エラー回避が出来る
		! バグが直っている> 9_4,9_6　確認
		*/
		
	}

}
