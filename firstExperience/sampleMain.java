package javastudy.ex1221;

//다른 패키지에 있는 클래스를 사용하기 위해서는 반드시 import가 필요하다.
import javastudy.ex1221_2.Sample;

public class sampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample sample = new Sample();
		
		System.out.println(sample.s1);
		
		//protected 접근제한자는 같은 패키지 또는 자식에서만 사용가능한 접근제한
		//SampleMain은 다른 패키지이고 자식도 아니기 때문에 사용X
		//System.out.println(sample.s2);
		
		//default 접근제한자는 같은 패키지 내에서만 사용가능한 접근제한
		//SampleMain은 Sample와 다른 패키지이므로 사용X
		//System.out.println(sample.s3);
		
		//private 접근제한자는 자신의 클래스 내에서만 사용가능한 접근제한
		//SampleMain은 Sample 클래스와 관련이 없으므로 사용X
		//System.out.println(sample.s4);
		
		//접근제한자를 사용할 수 있는 대상
		//-필드, 생성자, 메소드는 4개의 접근제한자 모두 사용 가능(제한효과 동일)
		//-클래스는 public과 default 접근제한자만 사용가능(제한효과 동일)
		
	}

}
