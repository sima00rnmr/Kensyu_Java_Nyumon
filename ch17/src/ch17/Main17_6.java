package ch17;

import java.io.FileWriter;

public class Main17_6 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");

		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			try {
				fw.close(); //close失敗時には特に何もしない
			} catch (I0Exception e) {
				; // 何もしない、の明示
			}

		}

	}

}
