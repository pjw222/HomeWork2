package c230915;

import java.sql.Connection;  //연결
import java.sql.DriverManager; //연결도와주는애
import java.sql.PreparedStatement;
import java.sql.ResultSet; //결과 세팅
import java.sql.Statement; //불러오기

public class Main {
	public static void main(String[] args)
	{
		try {			
			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"java",
					"qwer"
					);
					
			String insertQuery = "insert into student2"
					+"(id, name, student_id, student_pw, age, git_address)"
					+"values (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, 9);
			pstmt.setString(2, "송성민");
			pstmt.setString(3, "ssm");
			pstmt.setString(4, "2631");
			pstmt.setInt(5, 23);
			pstmt.setString(6, "송성민");
			pstmt.executeUpdate();
				
			
			
			//String update = "update student2 set age = 29 where id =1";  // 업데이트후에
			String query = "select * from student2";  // 업데이트한걸 불러옴
			//Statement st = con.createStatement();
			//ResultSet rs2 = st.executeQuery(update);  //업데이트 실행 후
			Statement stmt = con.createStatement();
			ResultSet rs =stmt.executeQuery(query);  // 쿼리문 불러오기
			while(rs.next()) {
				System.out.println(rs.getString("name")+" : "+ rs.getInt("age")+"세");				
			} //while 문을사용해서 전부 출력 여기서 rs.next()는 hasNext true면 불러오고 false면 불러오지 않는다.
//			rs.next();
//			System.out.println(rs.getString("name"));
			
			
			
			
			
			con.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
