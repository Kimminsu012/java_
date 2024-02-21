package IOT;

class 제습기 implements 온습도조절{
	
	@Override
	public void 종료() {
		System.out.println("제습기의 자동 관리가 정지되었습니다.");
	}

	@Override
	public void 실행입력(입력값 입력) {
		System.out.println("습도 : "+입력.습도+" 날씨 : "+입력.날씨);
		boolean 제습기장치 = (입력.습도 > 70 || 입력.날씨.equals("비")) && 입력.온도 > 22 ;
		if(제습기장치) {
			System.out.println("비 혹은 습도가 높아 제습기의 작동을 시작합니다.");
		}else {
			종료();
		}
		
	}
	
}
