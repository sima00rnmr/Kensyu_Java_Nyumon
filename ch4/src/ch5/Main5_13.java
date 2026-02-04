package ch5;

/*同じ配列を参照している状態を確認する*/
public class Main5_13 {
	//int型配列を受け取り、
	//配列内の要素全てに1を加えるメソッド

	//結果をreturunで返していない
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = { 1, 2, 3 };
		incArray(array);//メソッドの実行
		//arrayの全要素を出力
		for (int i : array) {
			System.out.println(i);
		}
	}

}
