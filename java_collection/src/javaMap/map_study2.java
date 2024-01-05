package javaMap;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.TreeMap;

public class map_study2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tree = new TreeMap<>();
		
		tree.put(101, "서울특별시");
		tree.put(204, "인천광역시");
		tree.put(406, "대전광역시");
		tree.put(201, "광주광역시");
		tree.put(701, "대구광역시");
		tree.put(702, "울산광역시");
		tree.put(703, "부산광역시");
		
		System.out.println( tree );
		
		// 검색
		System.out.println( tree.ceilingEntry(500) ); // entry - key 와 value를 합친걸 의미
		// 지정한 키 값보다 크거나 같은 값중 가장 작은 key:value( 가까운 값 ) 반환
		
		System.out.println( tree.ceilingKey(500) ); // key 값만 찾기
		// 지정한 키 값보다 크거나 같은 값중 가장 작은 key 반환
		
		System.out.println( tree.floorEntry(400) );
		// 지정한 키 값보다 작거나 같은 값중 가장 큰 key:value 반환
		
		System.out.println( tree.floorKey(400) );
		// 지정한 키 값보다 작거나 같은 값중 가장 큰 key 반환
		
		System.out.println( tree.higherEntry(406) );
		// 지정한 키 값보다 큰 값중 가장 가까운 key:value 반환
		
		System.out.println( tree.higherKey(204) );
		// 지정한 키 값보다 큰 값중 가장 가까운 key 반환
		// lowerEntry() - 지정한 키 값보다 작은 값중에서 가장 가까운 엔트리 반환
		// lowerKey() - 키 값만 반환
		
		System.out.println( tree.firstEntry() );
		// 현재 맵에서 가장 작은 키를 가진 엔트리 반환
		// firstKey() - 키만 반환
		System.out.println( tree.lastEntry() );
		// 현재 맵에서 가장 큰 키를 가진 엔트리 반환
		// lastKey() - 키만 반환
		
		System.out.println( tree.pollLastEntry() );
		System.out.println( tree );
		// 가장 큰 키를 가진 엔트리를 반환하고 맵에서 삭제
		// pollFirstEntry() - 가장 작은 키를 가진 엔트리를 반환하고 맵에서 삭제
		
		System.out.println( tree.headMap(500) );
		// 지정한 키 값보다 작은 키값 들을 반환
		// tailMap() - 지정한 키 값보다 큰 키값 들을 반환
		// headMap() , tailMap() 의 두번째 인자를 false와 true를 넣을 수 있다.
		// 						 false를 넘겨주면 지정한 키는 포함 하지않는다. 
		
		System.out.println( tree.subMap(200, 600) );
		// subMap(from , to) - from 키 값부터 to 키 값전까지에 해당하는 엔트리를 반환
		
		Properties prop = new Properties(); // 제너릭타입 없음 / key와 value는 String 으로 하나만 존재하며 문자열로 처리한다.
		prop.put("월요일", "한주가 시작한다");
		prop.put("금요일", "와 내일부터 쉬는날 이네");
		prop.put("수요일", "수요일 마다 야외 수업?");
		prop.setProperty("화요일", "아직 2일 지났다.");
		
		System.out.println( prop );
		
		System.out.println( prop.get("월요일") );
		System.out.println( prop.getProperty("화요일") );
		
		Enumeration em = prop.elements();
		while( em.hasMoreElements() ) {
			
			System.out.println( em.nextElement() );
		}
		
		String filename="C:\\Users\\dw\\git\\java_\\java_collection\\src\\javaMap\\router.properties";
		
		Properties router = new Properties();
		
		try(FileReader fs = new FileReader(filename))
		{
			router.load(fs);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println( router );
		
		System.out.println( router.getProperty("signin") );
	}

}











