package ch12;

public class Main12_ren {

	public static void main(String[] args) {
		Y[] y = new Y[2];
		
		y[0] = new A();
		y[0] = new B();
		for (Y y:y) {
			y.b();
		}
		
		

	}

}
