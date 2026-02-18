package ch17;
import java.io.FileWriter;
public class Main17_5 {

	public static void main(String[] args) {
		try {
			FileWriter fw =new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		}catch(Exception e) {//Exceptionの子孫どれでもキャッチ
			System.out.println("何らかの例外が発生しました");
		}

	}

}
