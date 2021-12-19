package javastudy.ex1217;

public class Ex02 {
	public static void main(String[] args) {
		
		/*
			java 에서 배열은 한번 길이가 생성되면 변경 할 수 없으므로
			길이를 변경하고 싶으면 해당하는 길이의 배열을 새로 만들어 복사해야한다.
		 */
		int[] a = new int[3];
		for(int i=0; i<a.length; i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		
		int[] newA = new int[4];
		
		for(int i=0; i<a.length; i++) {
			newA[i] = a[i];
		}
		newA[newA.length-1] = newA.length-1;
		System.out.println("----------------------------");
//		for(int i=0; i<newA.length;i++) {
//			System.out.println(newA[i]);
//		}
		
		//아래 for문은 : 기준으로 오른쪽에 있는 배열에서 원소를 하나씩 꺼내
		// : 기준으로 왼쪽에 선언되어 있는 변수에 담아준다.
		//하지만 블럭 안쪽에서 index값이 필요한 경우에는 사용할 수 없다.
		for(int data:newA) {
			System.out.println(data);
		}
		
		
	}
}
