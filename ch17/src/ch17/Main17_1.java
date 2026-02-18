package ch17;
import java.io.FileWriter;
public class Main17_1 {

	public static void main(String[] args) {
		try {
			FileWriter fw =new FileWriter("date.tet");
			
		}catch (I0Exception e){
			System.out.println("エラーが発生");
		}

	}

}
