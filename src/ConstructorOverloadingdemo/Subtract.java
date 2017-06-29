package ConstructorOverloadingdemo;

public class Subtract {

	private int subtract1(int a, int b) {
		return (a - b);
	}

	private int subtract1(int a, int b, int c) {
		return (a - b - c);
	}

	public static void main(String[] args) {
		
		Subtract subtract= new Subtract();
  System.out.println(subtract.subtract1(66, 70));
		System.out.println(subtract.subtract1(80, 90, 100));
	}

}
