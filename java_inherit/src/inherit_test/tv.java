package inherit_test;

public class tv extends house {

	int ch=7; // 채널
	int vol=15; // 소리
	
	{
		ch=10;
		vol=12;
	}
	
	public tv(){ // 기본 생성자 메서드
//		super(); // 숨겨져 있음 항상 맨위에 있어야 한다. - 부모 생성자 메서드 코드는 없어도 자동으로 들어있어서 안적어도 된다.
		System.out.println("tv 클래스의 생성자입니다.");
		
	}
	public tv(String brand){ // super - 부모클래스 / 매개변수가 있는 생성자 메서드
		super(brand);
	}
	
	void channel_up() {
		this.ch++;
	}
	void channel_down() {
		this.ch--;
	}
	
	@Override
	public void power() {
		onoff = !onoff;
		System.out.println("TV 전원 : " + onoff);
	}
	
	@Override
	public String toString() {
		return super.brand+" , 전원 : "+super.onoff+" 현재채널:"+ch+" 불륨:"+vol;
	}
}
