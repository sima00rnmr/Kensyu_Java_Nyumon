package ch15;
import java.util.Date;

public class Main15_11 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);//現在の実行した時間が表示される
		System.out.println(now.getTime());
		Date past = new Date(1694984000000L);//20230918 05:53の時間を表す文字列
		System.out.println(past);//既定の時間を表示する（比較用）

	}

}
