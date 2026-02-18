package ch16;
/*なんか変な物が呼び出されちゃう
 * ちょくちょくimport文が書き換わっちゃうのも原因？
 * 
 * 
 * 
 * 
*/
import java.util.HashMap;
import java.util.Map;
public class Main16_7 {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
			prefs.put("京都府",255);
			prefs.put("東京都",1261);
			prefs.put("熊本県",181);
			for(String key : prefs.keySet()) {
				int value =prefs.get(key);
				System.out.println(key+"の人口は"+ value);						
			}
		
			
		

	}

}
