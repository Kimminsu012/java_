package IOT;

class 공기청정기 implements 온습도조절{
	
	@Override
	public void 종료() {
		System.out.println("공기청정기의 자동 관리가 정지되었습니다.");
	}

	@Override
	public void 실행입력(입력값 입력) {
		System.out.println("미세먼지 : "+입력.미세먼지);
		boolean 공기청정기장치 = 입력.미세먼지 > 35 ;
		if(공기청정기장치) {
			System.out.println("미세먼지의 농도가 "+입력.미세먼지+"% 라 높음으로 공기청정기의 작동을 시작합니다.");
		}else {
			종료();

		}
		
	}
	
	
}
