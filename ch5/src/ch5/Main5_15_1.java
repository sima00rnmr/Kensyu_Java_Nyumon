package ch5;

/*5_7_1 練習問題
 * 自己紹介文の表示
 * 
 * char型の注意点＞P54
 * 
 * */
public class Main5_15_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		introduceOneself();//introduceOneselfメソッドを呼び出す
	}

	public static void introduceOneself() {
		//名前:湊雄輔、年齢:22、身長:169.9、十二支:辰 を表示

		String name = "湊雄輔";// 名前　テキスト=String型
		int age = 22; // 年齢　整数=int　型
		double siz = 169.9; //　身長　小数（浮動小数点）=double型
		char eto = '辰';// char型の時、文字の囲みは''である 　 干支　漢字（文字）一文字=char 型
		//結果を表示する
		System.out.println("私の名前は" + name + "です。歳は" + age + "です。身長は" + siz + "です。干支は" + eto + "です。");
	}
}
