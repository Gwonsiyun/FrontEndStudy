package javastudy.ex1216;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문
		//1.for문
		//1~10까지 출력
		int i = 0;
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		//1~10까지의 합
		int sum = 0;
		for(i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합은 "+sum);
		
		for(int x=2; x<=9; x++) {
			System.out.println("["+x+"단]");
			for(int y=1; y<=9; y++) {
				System.out.println(x+"X"+y+"="+(x*y));
			}
		}
		
		//for문을 이용하여 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하라
		sum=0;
		for(i=3;i<=100;i+=3) {
			sum+=i;
		}
		System.out.println("3의 배수의 합 : "+sum);
		
		//중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해를 구하라
		//단, x와 y는 10이하의 자연수
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.println("("+x+", "+y+")");
				}
			}
		}
		//for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성하라
		String star = "";
		for(i=1; i<=5; i++) {
			star+="*";
			System.out.println(star);
		}
	}

}
