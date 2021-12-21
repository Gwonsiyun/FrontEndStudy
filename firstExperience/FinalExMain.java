package javastudy.ex1221;

public class FinalExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalEx fx = new FinalEx("test");
		System.out.println(fx.field1);
		/*
			final 키워드가 붙은 필드는 값이 한번 초기화 되면 변경할 수 없는 필드이다.
		 */
		//fx.field1 = "test2";
		/*
			final 키워드가 붙은 필드는 반드시 생성자 또는 클래스 내부에서 값이 초기화
			되어 있어야 한다.
			그렇지 않으면 컴파일 오류가 난다.
		 */
		
		String fStr = FinalEx.FIELD3;
		System.out.println(fStr);
		fStr = "test";
		//FinalEx.FIELD3 = "test";
	}

}
