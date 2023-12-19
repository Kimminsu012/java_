package home_project;

import java.util.Arrays;

public class project_231219 {

	public static void main(String[] args) {

		// 과제 
		String song = "크리스마스에는 많은 것을 원하지 않아요 # 내가 원하는건 딱 하나에요 #" 
		+"트리 아해의 선물 같은것도 신경쓰지 않아요 # 당신을 원해요 #"
		+"당신이 생각하는 것보다 더 # 내 소원을 이뤄줘요 #"
		+"내가 크리스마스에 원하는건 당신이에요";
		System.out.println(song);
		
		
		String line = song.replace("#", "\n");
		String nn = line.replace("\n ", "\n");
		System.out.println(nn);
		
		String he = nn.replaceAll("당신", "그대");
		System.out.println(he);
		
		String en = nn.replace("크리스마스" , "chrismas");
		System.out.println(en.toUpperCase());
		
		String[] sing = song.split("#");
		System.out.println(sing[3]);
		
		
/*		1. # 기준으로 한줄씩 출력 하세요( #은 출력창에 나오면 안되요 )
 * 		2. 당신 이라는 단어 대신 "그대" 라고 바꾸어서 출력하세요
 * 		3. 크리스마스를 영어로 변경하여 출력하세요 (대문자로)
 * 		4. 세번째#뒤의 가사가 무엇인지 출력하세요.
 */
	}

}
