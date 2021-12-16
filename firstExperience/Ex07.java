package javastudy.ex1216;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열
		//1.값의 목록을 사용하여 배열 생성하기
		int[] iArray = {1,2,3,4,5,6,7,8,9};
		System.out.println(iArray[2]);
		
		for(int i=0; i<iArray.length; i++) {
			System.out.println(iArray[i]);
		}
		
		//2.new 연산자를 사용하여 배열 생성하기
		int[] iArray2 = new int[] {1,2,3,4,5,6,7,8,9,};
		
		//{}를 사용하여 배열 값을 대입 하는것은 변수 생성시에만 가능하다.
		//이미 생성된 후 배열 변수에 배열 값을 담기 위해서는 new 연산자를 사용해야한다.
		int[] iArray3;
		//배열은 변수 선언시에 new 연산자를 알아서 호추하여 heap 영역에 데이터를 
		//생성한 뒤 생성된 주소값을 변수에 대입한다.
		//하지만 이미 생성 된 후에는 개발자가 직접 heap에 생성시키기 위하여
		//new 연산자를 사용한다.
		iArray3 = new int[] {1,2,3,4};
		
		
		//3.원소에 데이터 없이 배열의 길이만으로 배열을 만드는 방법
		int[] iArray4 = new int[7];
		//배열을 길이로 만들었을경우 데이터를 비워둘 수 없기 때문에 초기값을 알아서 지정해준다.
		System.out.println(iArray4[0]);
		
		String[] sArray = new String[5];
		System.out.println(sArray[0]);
		
		sArray[0]="A";
		System.out.println(sArray[0]);
	}

}
