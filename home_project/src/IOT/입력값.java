package IOT;

import java.util.Scanner;

public class 입력값 implements 액션{
	Scanner sc = new Scanner(System.in);
	
	float 온도;
	float 습도;
	float 미세먼지;
	String 날씨;
	
	public void 출력() {
	System.out.println("온도를 입력하세요 : ");
	온도 = sc.nextFloat();
	System.out.println("습도를 입력하세요 : ");
	습도 = sc.nextFloat();
	System.out.println("미세먼지 농도를 입력하세요 : ");
	미세먼지 = sc.nextFloat();
	sc.nextLine();
	System.out.println("날씨를 입력하세요(맑음 , 비) : ");
	날씨 = sc.nextLine();
	}

	@Override
	public void 장치액션(입력값 입력) {
		출력();
	
	}
}
