package IOT;

import java.util.ArrayList;
import java.util.List;

public class 장치실행 implements 온습도조절{
	
	
	private List<온습도조절> 실행장치정리;
	액션 최종출력 = new 입력값();
	
	public 장치실행() {
		실행장치정리 = new ArrayList<>();
		실행장치정리.add(new 창문());
		실행장치정리.add(new 제습기());
		실행장치정리.add(new 공기청정기());
	}
	
	@Override
	public void 실행입력(입력값 입력) {
		for(온습도조절 장치 : 실행장치정리) {
			장치.실행입력(입력);
		}
		
	}
	@Override
	public void 종료() {

	}
	
}
