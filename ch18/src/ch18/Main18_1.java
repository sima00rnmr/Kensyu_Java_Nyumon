package ch18;
import java.io.FileWriter;
public class Main18_1 {

	public static void main(String[] args)throws Exception {
		FileWriter fw = new FileWriter("data.txt"); 
		fw.write('こ');
		fw.write('ん');
		fw.write('に');
		fw.write('ち');
		fw.write('は');
		fw.write('ち');
		fw.close();
	}

}
