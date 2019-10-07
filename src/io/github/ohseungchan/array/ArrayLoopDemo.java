package io.github.ohseungchan.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] members = {"가나나", "다라마", "바사아"};
		for (int i=0; i<members.length; i++) {
			String member = members[i];
			System.out.println(member + " 상담완료");
		}
	}
}
