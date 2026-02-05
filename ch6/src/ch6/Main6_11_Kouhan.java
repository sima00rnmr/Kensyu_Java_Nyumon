package ch6;

public class Main6_11_Kouhan {
	
	/* テスト用
	public static void main(String[] args) throws Exception {
		callDease();
		showMondokoro();}*/
		

	public static void callDease() {
		System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
	}
	public static void showMondokoro(){
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか！");
		Thread.sleep(3000); // 三秒間停止
		Main6_11_Zenhan.doTogame();//もう一度咎める
	}
}
