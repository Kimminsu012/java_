package IOT수정본;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 최종 {

	private static int 이전온도 = 0;
	private static int 이전습도 = 0;
	private static int 이전미세먼지 = 0;
	private static int 이전날씨 = 0;
	
	public static void main(String[] args) {
		
		
		
			Scanner sc = new Scanner(System.in);
			
			List<온습도조절> 장치들 = new ArrayList<>();
            
            System.out.println("온도를 입력하세요 : ");
            int 온도 = Integer.parseInt(sc.nextLine());
            System.out.println("습도를 입력하세요 : ");
            int 습도 = Integer.parseInt(sc.nextLine());
            System.out.println("미세먼지 농도를 입력하세요 : ");
            int 미세먼지 = Integer.parseInt(sc.nextLine());
            System.out.println("날씨(1 = 맑음 , 2 = 비)를 입력하세요 : ");
            int 날씨 = Integer.parseInt(sc.nextLine());
            
            이전온도 = 온도;
            이전습도 = 습도;
            이전미세먼지 = 미세먼지;
            이전날씨 = 날씨;
			
			if((온도 > 22 || 습도 < 70) && 날씨==1 && 미세먼지 < 35 ) {
				장치들.add(new 창문());
			}

			if((습도 > 70 || 날씨 == 2) && 온도 > 22 ) {
				장치들.add(new 제습기());
			}
			if(미세먼지 > 35) {
				장치들.add(new 공기청정기());
			}
			
			for(온습도조절 장치 : 장치들 ) {
				장치.실행(온도, 습도, 미세먼지, 날씨);
			}
			
			while(true) {
			
			System.out.println("수정할 수치가 있습니까? (예(Y)/아니요(N))");
			
			String 진행 = sc.nextLine();
			
			if (진행.equalsIgnoreCase("N") || 진행.equalsIgnoreCase("아니요")) {
                for (온습도조절 장치 : 장치들) {
                    장치.종료();
                }
                System.out.println("입력이 종료됩니다.");
                break;
            } else if (진행.equalsIgnoreCase("Y") || 진행.equalsIgnoreCase("예")) {
                System.out.println("수정할 값을 선택해주세요.");
                System.out.println("1. 온도");
                System.out.println("2. 습도");
                System.out.println("3. 미세먼지");
                System.out.println("4. 날씨");
                System.out.println("5. 종료");

                int 선택 = Integer.parseInt(sc.nextLine());
                switch (선택) {
                    case 1:
                        입력및실행("온도", sc, 이전온도, 이전습도, 이전미세먼지, 이전날씨, 장치들);
                        break;
                    case 2:
                        입력및실행("습도", sc, 이전온도, 이전습도, 이전미세먼지, 이전날씨, 장치들);
                        break;
                    case 3:
                        입력및실행("미세먼지", sc, 이전온도, 이전습도, 이전미세먼지, 이전날씨, 장치들);
                        break;
                    case 4:
                        입력및실행("날씨(1 = 맑음 , 2 = 비)", sc, 이전온도, 이전습도, 이전미세먼지, 이전날씨, 장치들);
                        break;
                    case 5:
                        System.out.println("수정을 종료합니다.");
                        break;
                    default:
                        System.out.println("잘못 입력했습니다. 다시 선택하세요.");
                        break;
                }
            } else {
                System.out.println("올바른 입력이 아닙니다. 다시 입력하세요.");
            }
        }

        sc.close();
    }

    private static int 입력및실행(String 항목, Scanner sc, int 이전온도, int 이전습도, int 이전미세먼지, int 이전날씨, List<온습도조절> 장치들) {
        System.out.println("수정할 " + 항목 + " 값을 입력하세요.");
        int 수정값 = Integer.parseInt(sc.nextLine());
        
        int 수정된온도 = 이전온도;
        int 수정된습도 = 이전습도;
        int 수정된미세먼지 = 이전미세먼지;
        int 수정된날씨 = 이전날씨;
        
        switch(항목) {
        	case "온도":
        		수정된온도 = 수정값;
        		break;
        	case "습도":
        		수정된습도 = 수정값;
        		break;
        	case "미세먼지":
        		수정된미세먼지 = 수정값;
        		break;
        	case "날씨(1 = 맑음 , 2 = 비)":
        		수정된날씨 = 수정값;
        		break;
        	default:
        		System.out.println("잘못 입력했습니다. 다시 선택하세요.");
        		return 이전온도;
        }
        for(온습도조절 장치 : 장치들) {
	        if((이전온도 < 22 || 이전습도 > 70) && 이전날씨==2 && 이전미세먼지 < 35 ) {
				장치.종료();
			}
	
			if((이전습도 < 70 || 이전날씨 == 1) && 이전온도 < 22 ) {
				장치.종료();
			}
			if(이전미세먼지 < 35) {
				장치.종료();
			}
        }
        
        for (온습도조절 장치 : 장치들) {
            장치.실행(수정된온도, 수정된습도, 수정된미세먼지, 수정된날씨);
        }
        
        return 수정값;

    }

}
