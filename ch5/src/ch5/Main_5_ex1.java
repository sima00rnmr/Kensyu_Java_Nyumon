package ch5;

public class Main_5_ex1 {
	
	public static void methodA(){
		System.out.println("MethodA");
	}
	
	public static void methodB(){
		System.out.println("MethodB");
		methodA();
	}
	
	public static void methodC(){
		System.out.println("MethodC");
		methodA();
	}
	
	public static void main(String[] args){
		methodB();
		
	}

}
