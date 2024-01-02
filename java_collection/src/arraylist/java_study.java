package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class java_study {
	public static void main(String[] args) {

		ArrayList<member> mbr = new ArrayList<member>(); // <>는 하되 뒤에선 타입을 생략해도 된다.
		mbr.add( new member("이순신","lee@naver.com","남성",1012341234));
		mbr.add( new member("김유신","kim@naver.com","남성",1054684759));
		mbr.add( new member("정약용","jung@naver.com","남성",1022225847));
		mbr.add( new member("소서노","ssne@naver.com","여성",1045784523));
		mbr.add( new member("유관순","you@gmail.com","여성",1045236987));
		
		System.out.println( mbr.get(2) );
		System.out.println( mbr.size() );
		System.out.println( mbr.subList(1,4) );
		
		member tmp = new member("유관순","you@gmail.com","여성",1045236987);
		
		System.out.println( mbr.indexOf(tmp) );
		System.out.println( mbr.contains(tmp) );
		// indexOf();
		
//		System.out.println( mbr);
		
		
		
		
		
		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		arr.add(10);
//		arr.add(20);
//		arr.add(50); // 배열의 마지막에 새로운 데이터를 추가
//		arr.add(1,100); // 배열의 지정한 인덱스 위치에 새로운 데이터 추가
////		arr.add("이순신");
////		arr.add(3.14);
//		
//		for( int i=0; i<arr.size(); i++) {
//			if( arr.get(i) > 20) 
//				System.out.println( arr.get(i) );
//		}
//		
//		System.out.println("arraylist에 값 존재여부 contains " + arr.contains(20) );
//		System.out.println("값이 몇번째 인덱스에 있는지 indexOf " + arr.indexOf(50));
//		System.out.println("arraylist에 값이 몇개 있는지 size " + arr.size());
//		arr.remove(1); // 지정한 인덱스 위치의 값 삭제
//		System.out.println("arraylist 비어있는지 isEmpty " + arr.isEmpty());
//		
//		System.out.println("범위내 값 출력 subList " + arr.subList(1, 3));
//		
//		arr.set(1, 200);
//		System.out.println("값 변경 set " + arr);
//		
//		// arr.toArray() - ArrayList를 정적 배열로 변환
//		
//		ArrayList<String> name = new ArrayList<String>();
//		name.add("이순신"); name.add("강감찬"); name.add("김유신"); name.add("장영실");
//		String[] names = new String[name.size()];
//		name.toArray(names);
//		System.out.println( Arrays.toString(names) );
//		
//		// 정렬 - 기본 데이터 일 경우에만 자동 정렬이 된다. (클래스 객체일땐 정렬이 안된다.)
//		// 		 클래스 객체일때 정렬을 할려면 추가적인 작업이 필요하다.
////		Collections.sort( arr ); 사전적 순서 정렬
////		arr.sort(Comparator.naturalOrder()); // 사전적 순서 정렬 ㄱ->ㅎ
//		arr.sort(Comparator.reverseOrder()); // 사전적 순서의 역 방향 정렬 ㅎ->ㄱ
//		System.out.println( arr );
//		
//		Collections.sort( name );
//		System.out.println( name );
//		
	}

}


// 교재 624page

//int[] a=new int[10]; / 정적배열

// ArrayList
// 기존의 배열을 동적으로 사용하기 위한 클래스
// 기존 배열과 다른점은 여러 타입으로 지정해서 사용 할 수 있다.(제네릭)
// ArrayList 에 기본 데이터 타입은 Object 라는 자바 최상위 클래스 타입이다.
// Object 타입으로 저징 되기 때문에 사용하고자 하는 타입을 지정 해서 사용 해야한다.
// ArrayList처럼 collection 모든 클래스들은 타입을 지정해서 사용 해야한다.

// ArrayList<클래스> -> ArrayList(동적배열)에 저장할 데이터(객체) 타입을
// <> 안에 작성하여 사용 해야 한다.
// <> 안에 클래스를 넣어주면 해당 타입으로 동작 되도록 하는 방법은 제네릭이다.
// 제네릭은 사용자가 지정한 타입에 맞추어 사용 할 수 있도록 자바에서 제시하는 방법
// 제네릭을 사용하면 여러 타입을 처리하기위한 코드의 복잡성이 줄어 들고
// 타입의 안정화를 도모 할 수 있다.




// 자바 컬렉션
// 다수의 데이터 또는 다수의 객체를 저장, 관리, 가공 하기위한 자료구조(데이터를 저장하는 방법) 및 알고리즘을 개발자가 쉽게 사용 할 수 있도록 만들어 놓은 인터페이스 및 클래스이다.

// Collection , Map
// add - 입력 , get - 출력
// Collection - List => ArrayList
//					 => Vector
//					 => LinkedList
//					 => Stack

//			  - Set(get이 없다 ) => HashSet
//							   => TreeSET

// Map - HashTable
//	   - HashMap
//	   - TreeMap









