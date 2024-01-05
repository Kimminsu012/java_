package cafe;

public enum Category {
	커피 , 음료 , 빽스치노
	
//	final private int num;
//	private Category(int num) {
//		this.num=num;
//	}
}

// enum - 열거형
// enum에 생성된 요소들의 값을 변경하려면 클래스의 생성자메서드 사용법과 동일하게 해야한다.
// A라는 클래스 new A(10);

// 상수를 이름을 부여하여 사용할 수 있도록 해주는 방법 - enum (열거형 타입)
// 상수 - 자바스크립트 : const num = 10; 자바 : final int num = 10;
// 처음 만들어진 값은 0부터 시작하며 1씩 증가한다.