package io.github.ohseungchan.condition;

public class LoginDemo {
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if (id.equals("egoing")) {
			if (password.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("worng");
			}
			} else {
			System.out.println("wrong");
		}
	}
}
