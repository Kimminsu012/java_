package study231220;

import java.util.Arrays;

public class what_class {

	public static void main(String[] args) {
		// 교재 202p~207p 내용 ( 교재에 없는 내용도 포함 )
		member m1 = new member(); // member클래스의 인스턴스 생성
		m1.age = 34;
		m1.name = "이순신";
		m1.num = 101;
		System.out.println( m1 );
		
		
		
		
		// 교재 208p~218p 내용
		// 클래스 란 - 사용자 정의 데이터 타입
		// 		     기존의 기본 데이터 타입이 아닌 새로운 형태의 타입을 직접 정의 하는 것
		//			 기본 데이터타입과의 차이점은 여러종류의 데이터를 다룰수도 있으며
		//			 기능(메서드)을 정의 할 수 있다.
		
		// 자바에서는 클래스 중심으로 개발을해야 한다. ( 반드시는 아니고 )
		
		// 변수 - 지역 변수 , 인스턴스 변수 , 클래스 변수
		
		// 인스턴스변수 - 클래스의 멤버 변수 ( 클래스 객체의 실제 데이터를 저장하는 변수 )
		// 클래스변수 - 클래스의 전역 변수 ( 공유 변수 )
		
//		car c1 = new car(); // 클래스의 객체생성(인스턴스 생성)
//		c1.carNum = 12300;
//		c1.carName = "소나타";
//		
//		System.out.println( c1 );
//		
//		car c2 = new car();
//		c2.carNum = 15648;
//		c2.carName = "그랜져";
//		
//		System.out.println( c2 );
//		
//		car[] c = new car[10]; // car 클래스의 참조변수공간 10개 생성
//		// 배열의 공간엔 참조 변수 공간으로 생성한다. ( 참조 변수 - 주소 )
//		// 실제 공간이 없어 저장을 할 수가 없으므로 에러가 난다.
//		// c[2].carNum=1000;
//		// System.out.println(c[0]);
//		// 반복문을 통해 객체를 생성해야 사용이 가능하다.
//		for( int i = 0; i<c.length; i++) {
//			c[i] = new car(); // car 클래스의 객체 생성( 인스턴스변수와 메서드 공간 생성 )
//			c[i].carNum = i+10000+(int)(Math.random()*10000);
//			c[i].carName = "쏘렌토";
//		}
//		
//		System.out.println( Arrays.toString(c));
		
		
	}

}


class car{ // 클래스명이 car 인 클래스 정의 , 클래스의 정의 부분이고 공간생성이 아니다. ( 설계도 작성과 비슷 )
	int carNum; // 인스턴스변수
	String carName; // 인스턴스변수
	
	public String toString() {
		return carNum+" "+carName;
	}
}






