package ch15;

public class Main15_4 {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder();
		for(int i = 0;i<10000 ; i++) {
			sb.append("Java");
			sb.append("Hi!"); //並べて入れたら順序どうなる？
		}
		for(int i = 0;i<10000 ; i++) {
			sb.append("Hello"); //こうだったら？
		}
		String s = sb.toString();
		System.out.println(s);

	}

}

