package ch16;
import java.util.ArrayList;
import java.util.Iterator;

public class Main16_2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("a");
		names.add("b");
		names.add("c");
		Iterator<String> it =names.iterator();
		while(it.hasNext()) {
			String e =it.next();
			System.out.println(e);
		}
		
	}

}
