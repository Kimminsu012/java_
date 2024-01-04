package javaSet;

import java.util.TreeSet;

public class java_study2 {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		do {
			int num = (int)(Math.random()*50)+1;
			tree.add( num );
			//System.out.println(num);
		}while( tree.size()<10 );
		
		System.out.println( tree );
		
		// 검색
		System.out.println( tree.floor(9)); 
		// 지정한 값과 일치하는 값 출력 , 일치하는 값이 없다면 작으면서 제일 가까운 값 출력
		// 그래도 없으면 null
		System.out.println( tree.headSet(25) );
		// 지정한 값보다 작은 값 전체 출력
		System.out.println( tree.tailSet(27) );
		// 지정한 값보다 큰 값 전체 출력
		
		System.out.println( tree.higher(40) );
		// 지정한 값보다 큰 값중에서 가장 가까운 값 출력
		System.out.println( tree.lower(36) );
		// 지정한 값보다 작은 값중에서 가장 가까운 값 출력 , 일치하는값이 있어도 작은 값만 찾는다.
		System.out.println( tree.subSet(10,30) );
		// from과 to 사이의 값 출력 , to는 포함하지않는다. to이전값까지
		
		
	}

}

// 이진트리 배치 방식 - 첫번째 저장 되는 공간을 root라 부른다.
//				  - root에 저장되는 값 혹은 그 이후의 값 보다 큰 값이 들어가면 오른쪽 , 작은 값이 들어가면 왼쪽으로 저장된다.

