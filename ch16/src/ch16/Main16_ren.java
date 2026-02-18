package ch16;
import java.util.HashMap;
import java.util.Map;
public class Main16_ren {
/*
 * 自分の誤答メモ　一応出力は一緒だけど…　仕様に全然沿ってない
	public static void main(String[] args) {
		Hero h1 =new Hero();
		h1.name="斎藤";
		Hero h2 =new Hero();
		h2.name="鈴木";
		Map<String, Integer> kill =new HashMap<String, Integer>();
		kill.put("斎藤",3);
		int saito =kill.get("斎藤");
		kill.put("鈴木",7);
		int suzuki =kill.get("鈴木");
		System.out.println(h1.name+"が倒した敵の数="+saito);
		System.out.println(h2.name+"が倒した敵の数="+suzuki);

	}
	*/
	public static void main(String[] args) {
		Hero h1 =new Hero("斎藤");
		Hero h2 =new Hero("鈴木");
		Map<String, Integer> heroes =new HashMap<String, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		for(Hero key : heroes.keySet()) {
		int value=heroes.get(key);
		System.out.println(key.getName()+"が倒した敵＝"+ value);
		}
	
	}

}
