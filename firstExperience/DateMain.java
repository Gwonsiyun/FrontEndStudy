package javastudy.ex1228;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Date 객체를 이용하여 원하는 년,월,일 각가의 데이터를 추출할 수는 없지만
		//SimpleDateFormat 객체를 같이 사용하면 원하는 날짜 포맷을 출력할 수 있다.
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String datestr = sdf.format(date);
		
		System.out.println(datestr);
		
		
		//getInstance() 로 정보를 얻어온다고 전부 싱글톤은 아닐 수 있다.
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println(cal == cal2);
		
		int year = cal.get(Calendar.YEAR);
		
		System.out.println(year);
		
		
		
		
		
		
		
		
		
	}

}
