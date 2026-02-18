package ch16;
/*HashMapクラスの利用
 * 
 * Map
 * =2つの情報をペアで格納するデータの構造のこと
 * 
 *Map＜キーの型,値の型＞　マップ変数＝ 
 *new HashMap<キーの型,値の型>（）；
 *
 * */

import java.util.HashMap;
import java.util.Map;
public class Main16_6 {

	public static void main(String[] args) {
		Map<String, Integer> prefs =new HashMap<String, Integer>();
		//以下3つの都市名と人口をペアで格納する
		
		prefs.put("京都府",255);
		prefs.put("東京都",1261);
		prefs.put("熊本県",181);
		/*「東京=tokyo」としか紐付けていないのが
		 *東京都の人口まで呼び出すことができる 
		 * 
		 * */
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、"+tokyo);
		prefs.remove("京都府");//京都は消す
		prefs.put("熊本県",182);//熊本県の上書きをする
		int kumamoto =prefs.get("熊本県");
		System.out.println("熊本県の人口は、"+kumamoto);
	}

}
