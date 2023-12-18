package home_project;

public class project_231218 {

	public static void main(String[] args) {
		// 1차원 배열만 잘 다울 수 있으면 된다.
				// 그럼 자연스럽게 2차원 배열도 된다.
				// 배열의 사용은 인덱스사용이 중요하다. 0번 인덱스 부터 시작.
				
				// 과제 - 자바 배열 문제
				// {30, 4, 50, 60, 14, 80, 45, 72, 94, 25}
				// 10개의 정수가 저장된 배열의 값을 확인하고
				// 평균을 구하세요.
				// 10개 정수의 평균 이하인 숫자들은 F , 평균 이상인 숫자들은 A라고 표기되는 배열을 만들어 출력하기
				
				// 새로운 배열에 만들어 출력하기
				// 출력 결과 - F , F , A , A , F , A , F , A , A , F
		
		int[] num1 = {30, 4, 50, 60, 14, 80, 45, 72, 94, 25};
		int res = 0;
		String[] af = new String[10];
		String A = "A";
		String F = "F";
		
		
		
		for(var i = 0; i<num1.length; i++ ) {
			res += num1[i];
		}
		res = res/10;
		
		System.out.println(res);
		
		for(var i = 0; i<num1.length; i++) {
			if(res <= num1[i]) {
				af[i] = Integer.toString(num1[i]);
				af[i] = A;
			}else {
				af[i] = Integer.toString(num1[i]);
				af[i] = F;
			}
		}
		for(var i=0; i<num1.length; i++) {
			System.out.printf("%s",af[i]);
			if(num1[i]==25) {
				System.out.print("");
			}
			else
				System.out.print(" , ");
		}
	}

}
