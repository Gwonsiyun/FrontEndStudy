package javastudy.ex0104.set;

public class A {

	String field1;
	String field2;
	public A(String field1,String field2) {
		super();
		// TODO Auto-generated constructor stub
		this.field1=field1;
		this.field2=field2;
	}
	
	@Override
	public int hashCode() {
		//field1 = 3, field2 = 1
		//field1 = 1, field2 = 3
		//인 경우도 통과 이때는 equals에서 비교
		return field1.hashCode()+field2.hashCode();
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof A) {
			A temp = (A) obj;
			if(temp.field1.equals(field1)&&field2.equals(temp.field2)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
