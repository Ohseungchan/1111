package io.github.ohseungchan.overloading;

class Calculator{
	int left, right;
	int third = 0;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOperands(int left, int right, int third) {
		System.out.println("setOperands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}
	public void sum() {
		System.out.println(this.left+this.right+this.third);
	}
	public void avg() {
		System.out.println((this.left+this.right+this.third)/2);
	}
}
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOperands(10, 20, 30);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();
		c2.avg();
	}
}
