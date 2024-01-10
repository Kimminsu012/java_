package stream1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class member{
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	public member(String name, int age, String tel, String addr) {
		this.name=name;
		this.age=age;
		this.tel=tel;
		this.addr=addr;
	}
	
	// 두가지의 메서드가 있어야 중복된 값 처리가 가능하다.
	@Override
	public boolean equals(Object o) {
		member tmp = (member)o;
		return this.tel.equals( tmp.tel );
	}
	
	@Override
	public int hashCode() {
		return this.tel.hashCode();
	}
	
	
	

	@Override
	public String toString() {
		return name+" : "+age+"세 : "+tel+" : "+addr;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}



public class test2 {

	public static void main(String[] args) {
		List<member> list = new LinkedList<member>();
		list.add( new member("이순신",34,"01012349999","아산시 초산동"));
		list.add( new member("김유신",29,"01088446431","경주시 충효동"));
		list.add( new member("장보고",45,"01077226453","진도군 진도읍"));
		list.add( new member("장영실",37,"01088446431","대전광역시 중구"));
		list.add( new member("이장대",25,"01000118844","대전광역시 서구"));
		
		// filter - 참과 거짓에따라 동작, if문의 조건식 과 비슷한 식을 구사하면된다.
		
		Stream<member> 나이 = list.stream().filter( m -> m.getAge() >= 30);
		나이.forEach(System.out::println);
		
		Stream<member> 대전 = list.stream().filter( de -> de.getAddr().contains("대전") );
		대전.forEach(System.out::println);
		
		Stream<Integer> 연령대 = list.stream().map( m -> m.getAge()/10);
		System.out.println(연령대.filter(n -> n==3).count());
		
		// member 클래스 객체에서 연락처의 010을 제외한 값으로 변환 된 객체들만 추려내고 싶다면
		// filter를 통해서는 memver클래스 객체가 나왔는데 map도 가능한가?
		// map은 새로운 요소로 매핑 하는역할을 하기때문에 반환타입이 반드시 존재 해야한다.
		// member클래스 타입으로 반환 되려면 member클래스 값이 나올 수 있도록 작업해야 한다.
		// 스트림의 각요소의 객체 상태를 변경하려면 map이 아니라 forEach를 사용해야한다.
		// 즉 map에서는 객체를 상태변화를 할 수 가 없다.
		
		list.stream().forEach( m -> m.setTel(m.getTel().substring(3)));
		
		list.forEach(System.out::println);
		
		List<score> std = Arrays.asList( new score(56,45,78) , new score(23,87,99) , new score(48,97,35) ); // 배열형태의 값들을 ArrayList로 변환
		
		std.stream().flatMapToInt(student -> IntStream.of(student.getEng(), student.getKor(),student.getMat()))
		.average().ifPresent( avg -> System.out.println( Math.round(avg*10)/10.0));
		
		// map - 일대일 매핑 하여 새로운 스트림 생성, 값을 변환하거나 추출하여 새로운값 만들기
		// flatMap - score 객체에서 추출해야할 값이 하나가 아니라 다수 이기때문에 map이 아니라 flatMap을 사용한다.
		
		List<Integer> number = Arrays.asList(1,2,3,4,3,5,6,5,7,4,3,1,4,5,2,7,8,5);
		
		number.stream().distinct().forEach(System.out::print);
		
		list.stream().distinct().forEach(System.out::println);
		
		// 총합 구하기
		System.out.println( IntStream.of(1,2,3,4,5).sum());
		
		int[] num = new int[] {23,45,6,7,12};
		int sum = Arrays.stream(num).sum();
		System.out.println(sum);
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println( (int)avg.getAsDouble());
		// Arrays.stream(num).average().ifPresent( a -> System.out.println( (int)a) );
		
		OptionalInt min = Arrays.stream(num).min();
		OptionalInt max = Arrays.stream(num).max();
		System.out.println(min.getAsInt()+"   "+max.getAsInt());
		
		int minN=num[0];
		int maxN=num[0];
		for( int i=0; i< num.length; i++) {
			if(minN > num[i]) minN = num[i];
			if(maxN < num[i]) maxN = num[i];
		}
		System.out.println(minN + "   " + maxN);
		
		// reduce
		Arrays.stream(num).reduce( (a,b) -> a*b ).ifPresent(a->System.out.println(a));
		
		Arrays.stream(num).filter(n -> n<10).reduce((a,b) -> a*b).ifPresent(r -> System.out.println(r));
		
		list.stream().map(member::getAge).reduce((a,b) -> a+b).ifPresent( res -> System.out.println(res));
		
		//  각 객체에서 이름만 추출하여 
		Optional<String> names = list.stream().map(member::getName).reduce((a,b) -> a+"-"+b);
		System.out.println( names.get() );
		
		String plus="";
		for(member m : list) {
			String n = m.getName();
			plus += n+"-";
		}
		plus = plus.substring(0, plus.length()-1);
		System.out.println(plus);
		
		// mathcing - 매칭의 방법은 세가지가 있다. (true / false)
		//			1 하나라도 조건을 만족하는 값이 있는가? ( anyMatch ) 
		//			2 모두 조건을 만족하는가? ( allMatch )
		//			3 모두 조건을 만족하지않는가? ( noneMatch )
		
		boolean any = Arrays.stream(num).anyMatch( n -> n > 50);
		System.out.println("40보다 큰 값이 있는지? "+any);
		
		boolean all = Arrays.stream(num).allMatch( n -> n > 10);
		System.out.println("모든 숫자가 10보다 큰지? "+all);
		
		boolean none = Arrays.stream(num).noneMatch( n -> n > 50);
		System.out.println("모든 숫자가 50보다 큰게 있는지? "+none);
		
		
		
		
		
	}

}

class score{
	private int kor;
	private int mat;
	private int eng;
	
	public score(int kor, int mat, int eng) {
		this.kor=kor;
		this.mat=mat;
		this.eng=eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
}






