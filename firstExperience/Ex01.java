package javastudy.ex1217;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2차원 배열 - 배열 안에 원소로 배열이 존재하는 구조
		int[][] a = new int[2][3];
		//0, 0, 0
		//0, 0, 0
		
		System.out.println(a[1][1]);
		
		int[][] b = new int[3][];
		b[0] = new int[3];
		b[1] = new int[5];
		
		//2차원 배열에서 행의 길이 구하기
		System.out.println(b.length);
		
		//특정 행의 열의 길이 구하기
		System.out.println(b[0].length);
		
		int[][] array = {
			{95,86},
			{83,92,96},
			{78,83,93,87,88},
		};
		
		//p182 ex8
		int sum = 0;
		double avg = 0;
		int arrayLength = 0;
		
		for(int i=0; i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum += array[i][j];	
			}
			arrayLength += array[i].length;
		}
		avg = sum/(double)arrayLength;
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
		
		
		
		/*
			참조 타입의 데이터를 담는 배열은 각각의 원소에 해당하는 데이터를 직접 담고있는
			것이 아니라 실제 데이터는 다른곳에 생성되고 생성된 주소를 각각의 원소가
			참조하고 있는 구조로 관리된다.
		 */
		
		String[] s = new String[3];//각각 null값을 가지고 있는 3칸의 문자열 배열 생성
		s[0] = "A";
		s[1] = "A";
		s[2] = new String("A");
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println(s[0]==s[1]);
		System.out.println(s[0]=="A");
		System.out.println(s[0]==s[2]);
		System.out.println(s[2]=="A");//주소값으로 들어가있기에 문자열 A와는 다름
	}

}
