package IOT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 최종 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("온도를 입력하세요 : ");
			float 온도 = sc.nextFloat();
			
			System.out.println("습도를 입력하세요 : ");
			float 습도 = sc.nextFloat();
			
			System.out.println("미세먼지 농도를 입력하세요 : ");
			float 미세먼지 = sc.nextFloat();
			
			sc.nextLine();
			
			System.out.println("날씨를 입력하세요(맑음 , 비) : ");
			String 날씨 = sc.nextLine();
			
			
			List<온습도조절> 장치들 = new ArrayList<>();
			
			if((온도 > 22 || 습도 > 50) && 날씨.equals("맑음") && 미세먼지 < 35 ) {
				장치들.add(new 창문());
			}
			if((습도 > 70 || 날씨.equals("비")) && 온도 > 22 ) {
				장치들.add(new 제습기());
			}
			if(미세먼지 > 35) {
				장치들.add(new 공기청정기());
			}
			
			for(온습도조절 장치 : 장치들 ) {
				장치.조절(온도, 습도, 미세먼지, 날씨);
			}
			
			
			
			System.out.println("수정할 수치가 있습니까? (예(Y)/아니요(N))");
			String 진행 = sc.nextLine();
			if( 진행.equals("Y") || 진행.equals("y") || 진행.equals("예") ) {
				System.out.println("온도 습도 미세먼지 날씨를 다시 입력해주세요.");
			}else if( 진행.equals("N") || 진행.equals("n") || 진행.equals("아니요")) {
				System.out.println("입력이 종료 됩니다.");
				break;
			}
			
			
		}
	}

}
