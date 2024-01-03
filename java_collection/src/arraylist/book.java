package arraylist;

public class book implements Comparable<book> {
	private String title;
	private String writer;
	private int year;
	
	public book() {}
	public book(String title, String writer, int year) {
		this.title=title;
		this.writer=writer;
		this.year=year;
	}
	
	@Override
	public int compareTo(book b) {
		
		return this.title.compareTo(b.title) * -1; // 문자열이여도 상관없이 -1을 곱하면 순서가 역순이 된다.
		
		//return (this.year - b.year)*-1; // 값이 0과 음수일땐 자리는 안바꾸지만 양수일땐 바꾼다 / -1을 곱하여 부호를 바꾸면 순서가 바뀐다.
	}
	
	@Override
	public String toString() {
		return "제목 : " + title + " 저자 : " + writer + " 년도 : " + year;
	}
	
	@Override
	public boolean equals(Object o) {
		String title = (String)o;
		
		return this.title.equals(title);
		
		
		
//		book 클래스가 들어왔을때
//		book tmp = (book)o; // 비교할 객체
//		
//		boolean same1 = this.title.equals(tmp.title);
//		boolean same2 = this.writer.equals(tmp.writer);
//		boolean same3 = this.year == tmp.year;
//		
//		return same1 && same2 && same3;
	}
	
	/*
	 * String[] n = new String[]{"가","나","다","라","마"};
	 * 
	 * for( int i=0; i<n.length(); i++{
	 *		if( n[i].equals("다") ){
	 *			return i;
	 *		}
	 * 	
	 * }
	 * 
	 * 
	 */
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
