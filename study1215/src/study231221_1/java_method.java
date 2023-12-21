package study231221_1;

import java.util.Scanner;

public class java_method {

	static Scanner sc = new Scanner(System.in);
	
	static void list_print(music[] mylist) {
		for( music obj : mylist ) {
			System.out.println(obj);			
		}
	}
	
	static void song_search(String keyword , music[] mylist) {
		
		boolean issong = false;
		for( music obj : mylist) {
			if( obj.singer.equals(keyword) || obj.title.equals(keyword) ) {
				System.out.println(obj);
				issong = true;
			}
		}
		if( !issong )
			System.out.println("검색결과없음.");
	}	
	
//	static void song_search( music[] mylist , String sear) { // 가수 또는 노래제목 으로 검색
//		boolean isMylist = false;
//		
//		for(int i=0; i<mylist.length; i++) {
//			if(mylist[i].singer.equals(sear) || mylist[i].title.equals(sear) ) {
//				System.out.println(mylist[i]);
//				isMylist = true;
//			}
//		}
//		if( !isMylist )
//			System.out.println("일치하는 노래가 없습니다.");
//	}
	
	public static void main(String[] args) {
		
		music[] mylist = new music[] {
				new music("잔나비","Made In Christmas",312)
				,new music("버블 사운드","그 남자의 크리스마스",339)
				,new music("버블 사운드","그 여자의 크리스마스",339)
				,new music("트와이스","Merry & Happy",329)
				,new music("아이유","미리 메리 크리스마스",437)
				,new music("성시경,박효신,이석훈,서인국,빅스","크리스마스니까",349)
				,new music("탑현","호랑수월가",441)
				,new music("조정석","아로하",405)
				,new music("다비치","화이트",414)
				,new music("써니힐","추워지니",424)	
		};
		System.out.println("찾는 노래의 제목 혹은 가수를 적어주세요.");
//		String sear = sc.nextLine();
		
		String keyword = sc.nextLine();
		song_search(keyword,mylist);
		
		
//		song_search(mylist,sear);
		
		
		
		
		
	}

}
