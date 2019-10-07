package io.github.ohseungchan.object;

public class CalculatorDemo {
	public static void avg(int left, int right) {
		System.out.println((left + right)/2);
	}
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	public static void main(String[] args) {
		int left, right;
		
		left = 10;
		right = 100;
		
		sum(left, right);
		avg(left, right);
		
		sum(10, 20);
		sum(100, 1000);
	}

}
