package javastudy.ex1222.ex;

import java.util.Scanner;

public class Ex01_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int num = 1;
		int scoreMe = 0;
		int scoreCom = 0;
		int scoreSam = 0;
		
		
		game:while(run) {
			System.out.println(num+"번째 대결!!");
			int sc = scanner.nextInt();
			if(sc==4) {
				run=false;
				System.out.println("게임을 종료합니다.");
				break game;
			}
			num++;
			int random = (int)(Math.floor(Math.random()*3)+1);
		
			String com = "";
			String me = "";
			if(random == 1) {
				com = "가위";
			}else if(random == 2) {
				com = "바위";
			}else if(random == 3) {
				com = "보";
			}
			
			if(sc == 1) {
				me = "가위";
			}else if(sc == 2) {
				me = "바위";
			}else if(sc == 3) {
				me = "보";
			}
			
			System.out.println("컴퓨터는 "+com+"를 냈습니다.");
			System.out.println("나는 "+me+"를 냈습니다.");
			System.out.println("");
			if(random==1&&sc==2 || random==2&&sc==3 || random==3&&sc==1) {
				scoreMe++;
			}else if(random==2&&sc==1 || random==3&&sc==2 || random==1&&sc==3) {
				scoreCom++;
			}else {
				scoreSam++;
			}
		}
		if(scoreMe>scoreCom) {
			System.out.println("대결 결과 : "+num+"판중 "+scoreMe+"번 이겼으므로 이겼습니다.");
		}else if(scoreMe<scoreCom) {
			System.out.println("대결 결과 : "+num+"판중 "+scoreCom+"번 졌으므로 졌습니다.");
		}else {
			System.out.println("대결 결과 : "+num+"판중 "+scoreMe+"번 이기고 "+scoreCom+"번 지고 "+scoreSam+"번 비겼으므로 비겼습니다.");
		}
	}
}
