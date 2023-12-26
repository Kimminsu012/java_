package inherit_test;

public class tv extends house {

	int ch; // 채널
	int vol; // 소리
	
	tv(){ // 기본 생성자 메서드
//		super(); // 숨겨져 있음 항상 맨위에 있어야 한다. - 부모 생성자 메서드 코드는 없어도 자동으로 들어있어서 안적어도 된다.
		System.out.println("tv 클래스의 생성자입니다.");
		ch=7;
		vol=15;
	}
	tv(String brand){ // super - 부모클래스 / 매개변수가 있는 생성자 메서드
		super(brand);
	}
}
