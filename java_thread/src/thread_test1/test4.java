package thread_test1;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Runnable r1 = new notepad();
		Thread th1 = new Thread(r1);
		th1.start();
	}

}


class notepad implements Runnable{
	@Override
	public void run() {
		autoSave dm = new autoSave();
		dm.setDaemon(true); // 데몬 쓰레드로 지정
		dm.start(); // 데몬 쓰레드 시작
		
		System.out.println("주 쓰레드 시작");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아무거나 입력(x-종료) : ");
			String word = sc.nextLine();
			if(word.equals("x")) break;
		}
		
		System.out.println("주 쓰레드 종료");
	}
}

class autoSave extends Thread{
	@Override
	public void run() {
		while(true) {
		System.out.println("자동저장 시작");
		System.out.println("자동저장 완료");
		try {sleep(5000);}
		catch(Exception e) { break; }
		}
	}
}






