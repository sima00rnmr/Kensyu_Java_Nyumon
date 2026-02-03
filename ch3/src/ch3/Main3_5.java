package ch3;

/*caseラベルに複数の値を指定する（3_4のコードを簡略化しよう）*/
public class Main3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運勢を占います");
		int fortrue = new java.util.Random().nextInt(5) + 1;
		switch (fortrue) {
		//fortrueが1,2なら
		case 1, 2 -> {
			System.out.println("いいね！");
		}
		//fortrueが3なら
		case 3 -> {
			System.out.println("普通です");
		}
		//fortrueが4,5なら
		case 4, 5 -> {
			System.out.println("う～ん…");
		}

		}

	}

}
