package javastudy.ex1216;

import java.util.Scanner;//ctrl+Shift+O(영어)

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);	
		String value = "";
		while(!value.equals("q")) {//""++"q" -> !fakse -> true
			System.out.print("입력>");
			value = scanner.next();
			System.out.println(value);
		}
	}
}
