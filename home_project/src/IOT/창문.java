package IOT;

class 창문 implements 온습도조절 {

	
	
	@Override
	public void 종료() {
		System.out.println("창문을 닫습니다.");
	}
	
	@Override
	public void 실행입력(입력값 입력) {
		System.out.println("온도 : "+입력.온도+" 습도 : "+입력.습도+" 미세먼지 : "+입력.미세먼지+"날씨 : "+입력.날씨 );
		boolean 창문장치 = (입력.온도 > 22 || 입력.습도 < 70) && 입력.날씨.equals("맑음") && 입력.미세먼지 < 35 ;
		if(창문장치) {
			System.out.println("창문을 열어 온도를 조절합니다.");
		}else {
			종료();
		}
	}

	
	
}
