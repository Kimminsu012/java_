package java_interface;

public interface unit  {

	public void move(); // abstract는 생략이 가능 , interface에선 기본적으로 추상으로 보기 때문
	public void attack(); // 추상메서드
	public void dead(); // 추상메서드
	
//	추상클래스
//	abstract class score{
//		abstract void method();
//	}
	
//	public final int run=10; // final제어자가 붙은 변수(상수) 선언 가능
//	public static void output() { // 클래스 메서드 정의 가능
//		
//	}
//	public void input() { // 인스턴스 메서드 정의 불가
//		
//	}
//	static int num=0; // 클래스변수 선언 가능하지만 초기값지정 필수
	//int num; 인스턴스변수 선언 불가
}
