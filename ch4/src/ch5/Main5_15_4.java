package ch5;

/*仕様書を参考に2つのメソッドを作成する
 * メソッド caleTriangleArea
 * 処理　引数として受け取った底辺長と高さから、三角形の面積を求めて、戻す
 * メソッド caleTriangleArea
 * 処理　引数として受け取った半径から円の面積を求めて戻す
 * */
public class Main5_15_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double triangleArea = caleTriangleArea(10.0, 5.0);//三角形の面積の引数
		double circleArea = caleCircleArea(5.0);//円の面積の引数

		System.out.println("三角形の面積は" + triangleArea + "平方cm");
		System.out.println("円の面積は" + circleArea + "平方㎝");
	}

	public static double caleTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;

	}

	public static double caleCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;

	}

}
