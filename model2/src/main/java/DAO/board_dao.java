package DAO;

import java.sql.SQLException;

public class board_dao extends parent_dao {
	
	public board_dao() {
		createTable();
	}
	
	
	
	private void createTable() {
		// 테이블 존재 여부
		String sql="show tables like 'board'";
		try {
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		if( rs.next() ) {
			return;
		}
		}catch(SQLException e) {
			System.out.println("board 테이블 확인 실패");
			e.printStackTrace();
		}
		// 테이블 만들기
		sql="create table board(" + "id int auto_increment primary key,"
								  + "title varchar(255),"
								  + "writer varchar(255),"
								  + "answer_mail varchar(255),"
								  + "lang varchar(50),"
								  + "wdate datetime default now(),"
								  + "hit int default 0,"
								  + "content text )";
		try {
			st.executeUpdate(sql);
			
		}catch(SQLException e) {
			System.out.println("board 테이블 생성 실패");
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
