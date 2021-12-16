package javastudy.ex1216;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i=0; i<studentNum;i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = scanner.nextInt();
				}
			}else if(selectNo == 3) {
				for(int i=0; i<studentNum;i++) {
					System.out.println("scores["+i+"]> "+scores[i]);
				}
			}else if(selectNo == 4) {
				int max=0;
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수 : "+max);
				
			}else if(selectNo == 5) {
				run = false;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

}
