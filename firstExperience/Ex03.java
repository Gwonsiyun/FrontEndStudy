package javastudy.ex1216;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for( a=1; a<=10; a++) {
			System.out.println(a);
			if(a == 4) {
				break;
			}
		}
		System.out.println(a);
		
		
		out: for(a=0; a<10; a++) {
			System.out.println("a>"+a);
			for(int b=0; b<10; b++) {
				System.out.println("b>"+b);
				if(b==2) {
					break out;
				}
			}
		}
		
		
		
	}

}
