package study231221;

import java.util.Scanner;

public class java_method {
	
	static Scanner sc = new Scanner(System.in); // 클래스 참조변수
	
	// static - 클래스(static) 메서드에서는 오직 static변수나 , static 메서드만 사용 가능
	//			static 메서드에서 인스턴스변수와 인스턴스 메서드는 사용 불가
	
	
	public static void search( student[] std , String name ) { // 이름으로 검색하여 성적 조회
		// 매개변수는 필요한 부분에 표시가 나오며 그거에 맞게 해줘야한다.
		boolean isStd = false;
		
		for(int i=0; i<std.length; i++) {
			if( std[i].name.equals(name) ) {
				System.out.println( std[i] );
				isStd=true;
			}
		}
		if( !isStd)
			System.out.println("등록되지 않은 학생 입니다.");
	}
	
	public static void main(String[] args) {
		
		student[] std = new student[6]; // 참조변수 6개 공간 생성
		std[0] = new student("이순신",86,44,25);
		std[1] = new student("장보고",77,25,68);
		std[2] = new student("세종대왕",100,95,87);
		std[3] = new student("정약용",98,52,76);
		std[4] = new student("이상화",49,86,37);
		std[5] = new student("문익점",79,88,91);
		
		System.out.print("조회할 학생 이름 입력 : ");
		String name = sc.nextLine();
		
		search(std,name);
		
		
		
//		std[0].calc();
		

//			System.out.println( std[0] );
		
		
//		student s = new student();
//		
//		
//		student std = new student("이순신",82,97,62); // student클래스 객체를 생성해서 참조변수 std에 저장
//
//		System.out.println(std);
//
//		std.name = "이순신";
//		std.kor = 82;
//		std.mat = 97;
//		std.eng = 62;
		
		

	}

}
