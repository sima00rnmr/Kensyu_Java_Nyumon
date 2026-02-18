package ch17;

import java.io.FileWriter;

public class Main17_4 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.tet");
			fw.write("hello!");
		} catch (I0Exception e) {
			System.out.println("エラーです！");
		}

		

	}

}
