package javastudy.ex1228;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CharAt(), getByte(), indexOf(), length(), replace(), substring(), valueOf()
		
		//indexOf() - 왼쪽에서부터 일치하는 첫번째 문자열의 인덱스를 반환
		String str = "hello,javajjjjjjj";
		System.out.println(str.indexOf("j"));
		//연속되는 문자열의 경우 모두 일치하는 경우에만 첫번째 문자의 인덱스 반환
		System.out.println(str.indexOf("java"));
		//없을경우 -1반환
		System.out.println(str.indexOf("jabi"));
		
		
		//length() - 문자열은 문자열들로 이루어진 배열이므로 문자들의 갯수를 반환
		
		//replace() - 일치하는 문자들을 원하는 문자들로 치환(javascript에서는 일치하는 한문자만 치환)
		String str2 = str.replace("j","bc");
		System.out.println(str2);
		
		
		//substring() - 매개값이 하나만 넘어가는 경우 해당 인덱스부터 맨끝까지 범위지정
		//				매개값이 두개가 넘어가는 경우 첫번째 인자 인덱스부터 두번째 인자 인덱스 앞까지
		String str3 = str.substring(4);
		System.out.println(str3);
		str3 = str.substring(4,6);
		System.out.println(str3);
		
		
		//valueOf() - 기본타입을 문자열로 변경할때 사용하는 메소드
		int i = 10;
		String a = String.valueOf(i);
		a += "test";
		System.out.println(a);
		
		
		
		String[] strA = new String[] {"html","java","javascript","jQuery","css"};
		//strA안에 있는 모든 원소를 출력
		//1. strA에서 길이가 5개 이하로 이루어진 원소를 가지는 새로운 문자열 배열 생성하여 출력
		//2. strA에서 ja문자를 가지는 원소를 bc라는 문자로 치환하여 그들만 출력
		
		System.out.println("----------------1-----------------");
		int count = 0;
		for(int j=0; j<strA.length; j++) {
			if(strA[j].length()<=5) {
				count++;
			}
		}
		String[] strB = new String[count];
		count = 0;
		for(int j=0; j<strA.length; j++) {
			if(strA[j].length()<=5) {
				strB[count] = strA[j];
				count++;
			}
		}
		for(int j=0; j<strB.length; j++) {
			System.out.println(strB[j]);
		}
		
		
		System.out.println("---------------Ssam----------------");
		String[] strA2 = null;
		int cnt = 0;
		for(i=0; i<strA.length; i++) {
			if(strA[i].length()<6) {
				cnt++;
				if(strA2 != null) {
					String[] tempA = strA2;
					strA2 = new String[cnt];
					for(int j=0; j<tempA.length; j++){
						strA2[j] = tempA[j];
					}
					strA2[strA2.length-1] = strA[i];
				}else {
					strA2 = new String[] {strA[i]};
				}
			}
		}
		for(i=0;i<strA2.length;i++) {
			System.out.println(strA2[i]);
		}
		
		
		
		System.out.println("----------------2-----------------");
//		count = 0;
//		for(int j=0; j<strA.length; j++) {
//			if(strA[j].indexOf("ja")>(-1)) {
//				count++;
//			}
//		}
//		count = 0;
//		String[] strC = new String[count];
//		for(int j=0; j<strA.length; j++) {
//			if(strA[j].indexOf("ja")>(-1)) {
//				strC[count] = strA[j].replace("ja","bc");
//				count++;
//			}
//		}
//		for(int j=0; j<strC.length; j++) {
//			System.out.println(strC[j]);
//		}
		for(int j=0; j<strA.length; j++) {
			if(strA[j].indexOf("ja")>(-1)) {
				System.out.println(strA[j].replace("ja","bc"));
				
			}
		}
		
		
		//split() - 하나 이상의 구분자를 사용하여 문자열을 잘라 배열로 만들떄 사용
		System.out.println("---------------split----------------");
		String splitStr = "java&javascript-oracle,mysql";
		String[] splitArray = splitStr.split("&|-|,");
		for(String str5 : splitArray) {
			System.out.println(str5);
		}
		
		
		
		System.out.println("---------------Builder----------------");
		//stringBuilder - 문자열 임시저장소(불필요한 메모리 낭비 대응)
		//-builder 는 단일 스레드 환경에서 사용
		//-buffer 는 멀티 스레드 환경에서 사용
		
		StringBuilder sb = new StringBuilder();
		
		//append() - 무조건 문자열 맨뒤에 이어붙여짐
		sb.append("java");
		
		//insert() - 기존 문자열의 특정 인덱스 위치에 삽입
		sb.insert(1,"test");
		
		//setCharat() - 기존 문자열의 특정 인덱스에 문자 하나 변경
		sb.setCharAt(1,'a');
		
		//replace() - 기존 문자열의 특정 인덱스 범위에 문자열 변경
		sb.replace(1,3,"css");
		
		//delete() - 특정 범위 문자열 삭제
		sb.delete(0,3);
		
		//length() - 빌더 또는 버퍼 안에 있는 문자열 길이
		
		//tostring() - 빌더 또는 버퍼 안에 있는 문자열 출력
		System.out.println(sb.toString());
		
		
		int num1 = 10;
		
		
		//래퍼 클래스에서는 기본타입으로 사용할 수 있는 다양한 속성과 메소드를 가지고 있다.
		//기본타입들의 클래스인 래퍼 클래스들은 자동으로 박싱과 언박싱 된다.
		Integer iNum1 = num1;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
