package javastudy.ex1216;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			String value = scanner.next();
			switch(value) {
				case "1":
					System.out.print("예금액>");
					value = scanner.next();
					balance += Integer.parseInt(value);
					break;
				case "2":
					System.out.print("출금액>");
					value = scanner.next();
					balance -= Integer.parseInt(value);
					break;
				case "3":
					System.out.print("잔고>");
					System.out.println(balance);
					break;
				case "4":
					run = false;
					break;
				default:
					System.out.println("잘못입력하셧습니다.");
			}
			/*int value = scanner.nextInt();
			switch(value) {
				case 1:
					System.out.print("예금액>");
					value = scanner.nextInt();
					balance += value;
					break;
				case 2:
					System.out.print("출금액>");
					value = scanner.nextInt();
					balance -= value;
					break;
				case 3:
					System.out.print("잔고>");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("잘못입력하셧습니다.");
			}*/

		}
		System.out.println("프로그램 종료");
	}

}
