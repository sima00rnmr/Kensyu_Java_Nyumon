package ch12;

public class Main12_ren {

	public static void main(String[] args) {
		Y[] array = new Y[2];
		
		array[0] = new A();
		array[0] = new B();
		for (Y y: array) {
			y.b();
		}
		
		

	}

}
