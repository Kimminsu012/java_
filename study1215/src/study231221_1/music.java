package study231221_1;

public class music {

	static int count=0; // 클래스변수 , 명시적초기화로 0 저장
	
	String singer; // 가수
	String title; // 제목
	int playing_time; // 재생시간
	
	music(){} // 기본 생성자 메서드
	music(String 가수 , String 제목){ // 매개변수가 있는 생성자 메서드
		this.singer=가수;
		this.title=제목;
	}
	music(String singer , String title , int time){ // 매개변수가 있는 생성자 메서드
		this(singer,title); // 저장 되어있는 singer,title의 메서드를 실행 (위에 만들어진 생성자 메서드 실행)
		this.playing_time=time;
	}
	
	@Override
	public String toString() {
		return "가수 : "+singer+" - "+title+" ("+transform()+")";
	}
	
	String transform() { // return이 있어 void 타입이 아닌 그게 맞는 타입으로 해야한다.
		int min = playing_time/100; // 정수/정수 -> 정수를 이용
		int sec = playing_time%100; // 나머지를 가져오는 값
		
		return min+":"+sec;
	}
	
}

// 숫자를 문자열로 변환 하여 원하는 숫자를 빼오는 방법 
//	int a = 456;
//	integer.toString(a).charAt(0);//substring(0,1);


