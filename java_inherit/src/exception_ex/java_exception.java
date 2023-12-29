package exception_ex;

import java.util.Scanner;

public class java_exception {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name = null;
		int score = 0;
		int[] num = {};
		try {
			score=sc.nextInt();
			
			System.out.println("이름 : " + name.concat("님") );
			System.out.println( score/ num.length );
			
		}catch(java.lang.NullPointerException n) {
			System.out.println("이름을 입력하세요");
		}catch(java.lang.ArithmeticException e) {
			System.out.println("성적을 입력하세요");
		}
		
		
		
		
//		try {
//			String name;
//			name = sc.nextLine();
//			System.out.println( name.charAt(0) );
//		}catch( Exception f ) { // Exception - 가장 최상위(부모)에 있지만 다향성 때문에 사용가능 , 특정 오류에 대해 다르게 할려면 이방식 보단 해당 오류의 풀네임을 써줘야한다.
//			System.out.println("이름을 입력하세요");
//		}
		
//		try {
//		
//			int num=10;
//		
//			System.out.println( num/0 );
//		
//
//		}catch( java.lang.ArithmeticException e ) { // 오류가 난 부분을 try를 통하여 자동으로 저장 시킴
//			System.out.println( e.getMessage() ); // 무엇때문인지 해당하는 오류를 나오게 함
//			e.printStackTrace(); // 오류에 대한 전반적인 내용을 나오게 함
//			System.out.println("0으로 나누기 할 수 없습니다."); // 사용할수 있는 코드를 다시 나오게 함
//		}
//		System.out.println("프로그램 종료");
	}
}
