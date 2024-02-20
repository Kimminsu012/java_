package IOT수정본;


public interface 온습도조절 {
	void 실행(int 온도, int 습도, int 미세먼지, int 날씨);
	void 종료();
}

class 창문 implements 온습도조절 {

	
	@Override
	public void 종료() {
		System.out.println("창문을 닫습니다.");
	}
	
	@Override
	public void 실행(int 온도, int 습도, int 미세먼지, int 날씨) {
		System.out.println("온도 : "+온도+" 습도 : "+습도+" 미세먼지 : "+미세먼지+"날씨 : "+날씨 );
		System.out.println("창문을 열어 온도를 조절합니다.");
	}
	
}

class 공기청정기 implements 온습도조절{
	

	
	@Override
	public void 종료() {
		System.out.println("공기청정기의 작동이 종료되었습니다.");
	}

	@Override
	public void 실행(int 온도, int 습도, int 미세먼지, int 날씨) {
		System.out.println("온도 : "+온도+" 습도 : "+습도+" 미세먼지 : "+미세먼지+"날씨 : "+날씨 );
		System.out.println("미세먼지의 농도가 "+미세먼지+"% 라 높음으로 공기청정기의 작동을 시작합니다.");
	}
	
	
}

class 제습기 implements 온습도조절{
	
	@Override
	public void 종료() {
		System.out.println("제습기의 작동이 종료되었습니다.");
	}

	@Override
	public void 실행(int 온도, int 습도, int 미세먼지, int 날씨) {
		System.out.println("온도 : "+온도+" 습도 : "+습도+" 미세먼지 : "+미세먼지+"날씨 : "+날씨 );
		System.out.println("비 혹은 습도가 높아 제습기의 작동을 시작합니다.");
	}

	
}
