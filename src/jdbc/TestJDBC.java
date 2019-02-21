package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("Database driver success");
			Connection c = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", 
							"root", "admin");
//			System.out.println("connect but and get the but is " + c);
			
			Statement s = c.createStatement();
//			System.out.println("Get statement taget: " + s);
			String sql = "insert into hero values(null,"+"'tmo'"+","+333.0f+"," +50+")";
			s.execute(sql);
			System.out.println("success insert tmo information");
			
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
