package ch3;
/*伝統的なswitch文の利用　
 * 
 * 
 * 現場ではよく見かけるけど、breakを書き忘れるとコンパイルエラーを起こすことなく処理が進んでしまうので危険…*/
public class Main3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("貴方の運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		case 1, 2: //ブロックではなく、:とbreakで囲んでいるような構造
			System.out.println("いいね！");
			break;//break忘れに注意！　忘れるとエラーを起こすことなく以下の処理を行ってしまう
		case 3:
			System.out.println("普通です");
			break;
		case 4, 5:
			System.out.println("う～ん…");
		}
	}
}
