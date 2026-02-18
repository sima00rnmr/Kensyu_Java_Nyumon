package ch16;

import java.util.ArrayList;
import java.util.List;

public class Main16_8 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		h.name = "スガワラ";//ここで上書きを行うと…
		System.out.println(list.get(0).name);//スガワラの表示がされる

	}

}
