package study23121801;

import java.util.Arrays;
import java.util.Scanner;

public class main_array {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 16개의 정수를 중복없이 배열에 저장하기
		int[] number = new int[16];
		
		for( int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random()*50)+1;
			for( int k=0; k<i; k++) {
				if( number[k] == number[i] ) {
					i--;
					break;
				}
					
			}
		}
		// 자바스크립트 배열에 특정값 존재 여부 - indexOf(특정값) , includes(특정값)
		// 자바 배열은 indexOf,includes 가 없다.
		// indexOf와 contains로 존재여부를 알 수 있지만,
		// String과 List 클래스에서만 사용 가능
		
		Arrays.sort(number);
		System.out.println( Arrays.toString(number) );
		
		// number 배열을 한줄에 4개씩 4줄로 출력하세요.
		
		System.out.println("┌────┬────┬────┬────┐");
		for( int i=0; i<number.length; i++) {
			if(i%4==0 && i!=0)
				System.out.println("│\n├────┼────┼────┼────┤");
			
			System.out.printf( "│ %2d ", number[i]);
		}
		System.out.println("│\n└────┴────┴────┴────┘");
		
		
		int[][] arr2 = new int[3][2];
		arr2[0][0] = 100;
		arr2[0][1] = 30;
		
		arr2[1][0] = 50;
		arr2[1][1] = 10;
		
		arr2[2][0] = 10;
		arr2[2][1] = 100;
		// 정방 배열 - 크기가 모두 같은 크기의 배열
//		int[][] bingo = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}}; {}를 사용할때
//		int[][] bingo = new int[4][4];
		int[][] bingo = new int[][]{
			{24,12,45,11},{82,23,46,12},{2,8,77,61},{24,12,45,11}
		};
			
		for( int i=0; i<bingo.length; i++) {
			for(int k=0; k<bingo[i].length; k++) {
				if(bingo[i][k] <= 25) {
					System.out.printf("%2s ","★");
				}else
				System.out.printf("%2d ",bingo[i][k]);
			}
			System.out.println();
		}
		
		// bingo 배열에서 25이하는 숫자대신 ★을 출력 하세요.
		
		// 크기가 서로 다른 이차원배열
		
//		int[] a , b, c; // 참조변수의 공간 
		// 비정방 배열 - 크기가 모두 다른 크기의 배열
		int[][] arr5 = new int[3][];
		int[] a = new int[] {1,2,3,4,5};
		int[] b = {10,20,30};
		int[] c = {11,22,33,44,55,66,77};
		
		arr5[0] = a;
		arr5[1] = b;
		arr5[2] = c;
		
		for( int i=0; i<arr5.length; i++) {
			for( int k=0; k<arr5[i].length; k++) {
				System.out.print(arr5[i][k] + " ");
			}
			System.out.println();
			
		}
		
		// 자바스크립트 - 배열에 정수나 실수나 문자열을 복합적으로 저장할 수 있다.
		// 자바 - 배열 생성 시 부여한 데이터 타입에 맞는 데이터만 저장 가능
		// 입력값을 받은 후 배열에 저장 혹운 출력을 할 때 정수 다음 문자를 입력 하게 되면 변환이 안되어 정수만 출력이 된 후 끝난다.
		// 입력 버퍼라는 공간에 정수를 입력 후 문자로 변환하여 다음 것을 출력을 하는데 
		// 엔터키가 문자로 구별되어 정수 입력부분엔 정수가 저장이 되고 문자 입력부분엔 엔터가 저장이된다.
		// 순서를 안바꾼 상태로 할려면 엔터를 다른 곳에 저장을 하게 만든 후 실행을 해야 한다.
		// 순서를 바꿔 문자 다음 정수를 입력 하게 되면 문제없이 실행이 가능하다.
		
//		int num11 = sc.nextInt();
//		sc.nextLine(); // 입력버터에 입력된 문자를 비어주는 과정
//		String word = sc.nextLine();
		
//		System.out.println(num11 + " " + word);
		
		String[][] info = new String[3][3];
		
		for(int i=0; i<info.length; i++) {
			System.out.print("이름 : ");
			info[i][0] = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			info[i][1] = Integer.toString(age); // 숫자를 문자열로 변경 / 바꿀려는 타입의 앞 글자는 대문자로 시작
												// 문자열을 숫자로 변경 - Integer.parseInt(); , 실수 - Float.parseFloat(); , Double.parseDouble(); 
			sc.nextLine();
			System.out.print("직업 : ");
			info[i][2] = sc.nextLine();
		}
		
		for( int i=0; i< info.length; i++) {
			for( int k=0; k<info[i].length; k++) {
				System.out.printf("이름 : %s 나이 : %s 직업 : %s \n",info[i][k],info[i][k],info[i][k]);
			}
		}
		
	}

}





