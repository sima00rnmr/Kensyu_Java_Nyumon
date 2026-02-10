package ch10;

public class Main10_ren {
	
	
	public static void main(String[] args) {
		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);//毒攻撃が切れた
		}
	}
			

