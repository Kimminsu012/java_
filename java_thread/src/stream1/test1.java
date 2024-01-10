package stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class test1 {

	public static void main(String[] args) {
		
		// 배열 스트림
		String[] arr = new String[] {"desk","table","orange"};
		Stream<String> stream = Arrays.stream(arr);
		
		// 스트림은 일회용이다. 다시 사용 할려면 stream에 값을 다시 지정 해준 후 반복문을 돌려야 한다.
		stream.forEach(System.out::println);
		Arrays.stream(arr).forEach(System.out::println);
		
		stream = Arrays.stream(arr, 1, 3); // 범위를 지정하여 1번 부터 3번앞 까지의 인덱스 값을 가져온다.
		stream.forEach(System.out::println);
		
		// 컬렉션 스트림
		List<String> list = Arrays.asList(arr);
		Stream<String> stream2 = list.stream();
		
		System.out.println(stream2.count()); // count - 값이 몇개 있는지 알려준다.
		
		// 스트림 빌더
		Stream<String> stream3 = Stream.<String>builder().add("a").add("b").add("c").build();
		
		Stream<Integer> stream4 = Stream.iterate(1, n-> n+1).limit(10);
		
		stream4.forEach(System.out::println);
		
		// 기본 데이터 타입형 스트림
		IntStream intStream = IntStream.range(1, 11);
		LongStream longStream = LongStream.range(1, 101);
		DoubleStream floatStream = new Random().doubles(5);
		
		IntStream charStream = "banana".chars(); // 문자 스트림
		
		
		List<String> names = new ArrayList<>();
		names.add("이성계");names.add("정약용");names.add("정도전");
		names.add("이만기");names.add("김유신");names.add("김신");
		names.add("박문수");names.add("문익점");names.add("박만용");
		
		// filter - 참과 거짓에따라 동작, if문의 조건식 과 비슷한 시을 구사하면된다.
		
		Stream<String> 박 = names.stream().filter( name -> name.contains("박") ); // 람다식
		// names List의 첫번째 값부터 마지막 값까지 차례대로 name이라는 매개변수에 전달하여 처리한다.
		
		박.forEach(System.out::println);
		
		Stream<String> 문 = names.stream().filter( name -> name.contains("문") );
		문.forEach(System.out::println);
		
		names.stream().filter( name -> name.length()==2 ).forEach(System.out::println);
		
		// map - 값들을 특정값으로 변환 해주는 작업
		Stream<String> 이름 = names.stream().map( name -> name.substring(1) );
		이름.forEach(System.out::println);
		
		 
		
		
		
		
		
		
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("a");list.add("b");list.add("c");
//		list.add("d");
//		
//		list.stream().filter("b"::equals).forEach(System.out::println);
		
		
//		for( String val : list ) { // 해당 객체에 리스트 내용이 다 들어간다.
//			if(val.equals("b"))
//				System.out.println("값 있음 " + val );
//		}
		
		
		
//		Iterator<String> it = list.iterator();
//		while( it.hasNext() ) {
//			String val = it.next();
//			if( val.equals("b") ) {
//				System.out.println("값 있음 "+val);
//			}
//		}

	}

}

// stream - 데이터의 흐름, 컬렉션 프레임워크에 여러개의 메서드를 조합하여
//		    원하는 결과를 얻을 수 있지만 stream을 이용하면 코드의 양을 줄이고 간단하게 표현할 수 있다.
//			배열과 컬렉션을 함수형 이라는 형태로 처리가 가능하다.
//			stream은 병렬 처리가 가능하다. 둘 이상의 작업을 동시에 진행 가능(쓰레드 이용)
// stream사용 : (배열 또는 컬렉션).맵핑.필터링.결과만들기 -> 결과물






