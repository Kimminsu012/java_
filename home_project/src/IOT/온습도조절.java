package IOT;

public interface 온습도조절 extends 중단, 동작 {
	void 조절(float 온도, float 습도, float 미세먼지, String 날씨);
}

class 창문 implements 온습도조절 {

	@Override
	public void 실행() {
		System.out.println("창문 자동 관리가 시작되었습니다.");
		
	}
	
	@Override
	public void 정지() {
		System.out.println("창문 자동 관리가 정지되었습니다.");
	}

	
	@Override
	public void 조절(float 온도, float 습도, float 미세먼지, String 날씨) {
		System.out.println("온도 : "+온도+" 습도 : "+습도+" 미세먼지 : "+미세먼지+"날씨 : "+날씨 );
		
		if((온도 > 22 || 습도 > 50) && 날씨.equals("맑음") && 미세먼지 < 35 ) {
			실행();
			System.out.println("창문을 열어 온도를 조절합니다.");
		}else {
			정지();
			System.out.println("창문을 닫습니다.");
		}
	}

	
	
}

class 공기청정기 implements 온습도조절{

	@Override
	public void 실행() {
		System.out.println("공기청정기의 자동 관리가 시작되었습니다.");
	}
	
	@Override
	public void 정지() {
		System.out.println("공기청정기의 자동 관리가 정지되었습니다.");
	}

	@Override
	public void 조절(float 온도, float 습도, float 미세먼지, String 날씨) {
		System.out.println("미세먼지 : "+미세먼지);
		if(미세먼지 > 35) {
			실행();
			System.out.println("미세먼지의 농도가 "+미세먼지+"% 라 높음으로 공기청정기의 작동을 시작합니다.");
		}else {
			정지();
			System.out.println("미세먼지의 농도가 "+미세먼지+"% 라 낮음으로 공기청정기의 작동을 중단합니다.");
			
		}
		
	}
	
	
}

class 제습기 implements 온습도조절{

	@Override
	public void 실행() {
		System.out.println("제습기의 자동 관리가 시작되었습니다.");
		
	}
	
	@Override
	public void 정지() {
		System.out.println("제습기의 자동 관리가 정지되었습니다.");
	}

	@Override
	public void 조절(float 온도, float 습도, float 미세먼지, String 날씨) {
		System.out.println("습도 : "+습도+" 날씨 : "+날씨);
		if((습도 > 70 || 날씨.equals("비")) && 온도 > 22 ) {
			실행();
			System.out.println("비 혹은 습도가 높아 제습기의 작동을 시작합니다.");
		}else {
			정지();
			System.out.println("맑음 혹은 습도가 낮아 제습기의 작동을 중단합니다.");
		}
		
	}
	
}















