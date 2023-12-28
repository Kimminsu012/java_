package home_project231228;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		car sedan = new sedan(2497, 2265, "검정" , "제네시스" , "수동" );
		System.out.println("suv 차량이 이륜인지 사륜인지 선택 (2 , 4)");
		int nu = sc.nextInt();
		String aa = sc.nextLine();
		car suv = new suv(2000, 1832, "빨강", "현대", nu);
		System.out.println("supercar의 엔진을 선택해주세요 (1. 4.0L V8 , 2. 5.2L V10)");
		String en = sc.nextLine();
		car supercar = new supercar(4000, 1389, "노랑" , "람보르기니" , "4.0L V8" );
		System.out.println("truck의 바퀴 사이즈를 입력해주세요");
		int tire_size = sc.nextInt();
		car truck = new truck(2469, 1690, "파랑", "현대", tire_size);
		

		System.out.println(sedan);
		System.out.println(suv);
		System.out.println(supercar);
		System.out.println(truck);
		
	}

}
