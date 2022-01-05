package javastudy.ex0105.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("홍길동","신용권","권자바");
		Iterator<String> iterator = list.iterator();
		
		//개발자가 직접 배열의 원소에 접근하여 반환하고 화면에 출력하는 로직
		//외부 반복자
		while(iterator.hasNext()) {	//개발자가 현재 원소의 존재여부 확인
			String value = iterator.next();	//개발자가 직접 존재시 원소반환
			System.out.println(value);
		}

		
		System.out.println("------------------------------------");
		
		
		//스트림은 내부반복자로서 개발자는 배열에 반복 접근하면서 해야하는 일만 넘길뿐
		//반복 접근에는 관여하지 않는다.
		Stream<String> stream = list.stream();
		
		stream.forEach((name)->{System.out.println(name);});
		
//		System.out.println("------------------------------------");
		
		//new로 익명객체 만들기
//		stream.forEach(new Consumer<String>(){
//		
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//			
//		});
		
		
		System.out.println("------------------------------------");
		
		
		//배열로부터 스트림 얻어오는 방법
		String[] strArray = {"홍길동","신용권","권자바"};
		
		Stream<String> strStream = Arrays.stream(strArray);
		
		strStream.forEach((name)->{System.out.println(name);});
		
		
		System.out.println("------------------------------------");
		
		
		//숫자 범위를 지정하여 스트림을 얻어오는 방법
		IntStream intStream = IntStream.rangeClosed(1,100);
		
		intStream.forEach(i->System.out.println(i));
		
		
		System.out.println("------------------------------------");
		
		
		Path path = Paths.get("src/javastudy/ex0105/Stream/stream.txt");
		Stream<String> fileStream;
		
		fileStream = Files.lines(path);	//path가 존재하지 않는 경우에대해 오류가 발생할 수도 있다고 경고가 뜨니 떠넘기거나 트라이캐치해야함
		fileStream.forEach(text->System.out.println(text));
		
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!무언가 안된다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		
		
		
	}

}
