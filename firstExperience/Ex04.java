package javastudy.ex1216;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//주사위 두개를 굴려 합이5인경우에 멈춘다.
		while(true) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			System.out.println("("+dice1+","+dice2+")");
			if(dice1+dice2==5) {
				break;
			}
		}
		
	}

}
