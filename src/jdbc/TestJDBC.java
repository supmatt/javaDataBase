package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("Database driver success");
			 c = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", 
							"root", "admin");
//			System.out.println("connect but and get the but is " + c);
			
			 s = c.createStatement();
//			System.out.println("Get statement taget: " + s);
			 for(int i = 1; i<3; i++) {
				 String ii = String.valueOf(i);
//				 String sql = "insert into hero values(null,"+"'Hero'" +","+333.0f+"," +50+")";
				 String iname = "name" +ii;
				 String sql = "insert into hero values(null," + "'"+iname+"'" +" ,+333.0 ,50)";
					s.execute(sql);
			 }
//			String sql = "insert into hero values(null,"+"'tmoo'"+","+333.0f+",
//			 " +50+")";
//			 String sql = "insert into hero values(null, 'tmoo00' ,+333.0 ,50)";
//			s.execute(sql);
			System.out.println("success insert tmo information");
			
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(s !=null)
				try {s.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			if(c != null)
				try {
					c.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}
	}
}
