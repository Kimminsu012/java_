package ArrayList_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class test_main {

	public static void main(String[] args) {

		ArrayList<food> shop = store();
		for( int i = 0; i<shop.size(); i++) {
			System.out.println( shop.get(i) );
		}
		System.out.println();
		
		Collections.sort( (List<food>) shop );
		Iterator<food> it = shop.iterator();
		while(it.hasNext()) {
			food data = it.next();
			System.out.println(data);
		}
		
		
	}
	
	
	public static ArrayList<food> store(){
		
		ArrayList<food> shop = new ArrayList<food>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/food.txt")))
		{
			
			while(true) {
				String line = bf.readLine();
				if(line == null) break;
				String[] li = line.split("-");
				food data = new food(li[0], Integer.parseInt(li[1]), li[2]);
				shop.add(data);			}
			
		}catch(Exception e){
			System.out.println("파일 로드 및 변환 실패");
			e.printStackTrace();
		}

		
		return shop;
	}

}
