package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) {
//		Connection c = null;
//		Statement s = null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("Database driver success");
//			 c = DriverManager
//					.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", 
//							"root", "admin");
//			System.out.println("connect but and get the but is " + c);
			
//			 s = c.createStatement();
//			System.out.println("Get statement taget: " + s);
//			 for(int i = 1; i<3; i++) {
//				 String ii = String.valueOf(i);
//				 String sql = "insert into hero values(null,"+"'Hero'" +","+333.0f+"," +50+")";
//				 String iname = "name" +ii;
//				 String sql = "insert into hero values(null," + "'"+iname+"'" +" ,+333.0 ,50)";
//					s.execute(sql);
//			 }
//			String sql = "insert into hero values(null,"+"'tmoo'"+","+333.0f+",
//			 " +50+")";
//			 String sql = "insert into hero values(null, 'tmoo00' ,+333.0 ,50)";
//			s.execute(sql);
//			System.out.println("success insert tmo information");
//		} catch (ClassNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if(s !=null)
//				try {s.close();
//				}catch(SQLException e) {
//					e.printStackTrace();
//				}
//			if(c != null)
//				try {
//					c.close();
//				} catch (Exception e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
//		}
//		try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//		try (
//	            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
//	                "root", "admin");
//	            Statement s = c.createStatement();             
//	        )
//		{
////            String sql = "insert into hero values(null," + "'��Ī'" + "," + 313.0f + "," + 50 + ")";
////            String sql = "delete from hero where id = 23";
//			String sql = "update hero set name = 'name3', hp = 340 where id = 21";
//            
//            s.execute(sql);
//              
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//		execute("insert into hero values(null," + "'��Ī2'" + "," + 313.0f + "," + 50 + ")");
//		
//	}
//	public static void execute(String sql) {
//		try (
//	            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
//	                "root", "admin");
//	            Statement s = c.createStatement();             
//	        )
//	        {
//	            String Sql = sql;
//	            s.execute(Sql);
//	               
//	        } catch (SQLException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	        }
		try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//		list(6,3);
//	}
//		 try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
//	                "root", "admin"); Statement s = c.createStatement();) {
	 
//	            String sql = "select * from hero";
//	 
//	            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
//	            ResultSet rs = s.executeQuery(sql);
//	            while (rs.next()) {
//	                int id = rs.getInt("id");// ����ʹ���ֶ���
//	                String name = rs.getString(2);// Ҳ����ʹ���ֶε�˳��
//	                float hp = rs.getFloat("hp");
//	                int damage = rs.getInt(4);
//	                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
//			 String name = "dashen";
//			 String password = "thisispassword";
//			 String sql = "select * from user where name = '"+name+"' and "
//			 		+ "password = '"+password+"'";
//			 ResultSet rs = s.executeQuery(sql);
//			 if(rs.next())
//				 System.out.println("Id and ps correct");
//			 else
//				 System.out.println("Id or ps was wrong");
			 
//			 String sql = "select count(*) from hero";
//			 
//	public static void list(int start, int count) {
//		try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
//                "root", "admin"); Statement s = c.createStatement();) {
//			String sql = "select * from hero limit " + start +","+count+"";
//			//add word "limit for control output information
//			 
//			 ResultSet rs = s.executeQuery(sql);
//			 while (rs.next()) {
//	                int id = rs.getInt("id");// ����ʹ���ֶ���
//	                String name = rs.getString(2);// Ҳ����ʹ���ֶε�˳��
//	                float hp = rs.getFloat("hp");
//	                int damage = rs.getInt(4);
//	                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
//	            }
//			 
//	        } catch (SQLException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	        }
//		String sql = "insert into hero values(null,?,?,?)";
//		try (Connection c = DriverManager.getConnection(
//				"jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
//				PreparedStatement ps = c.prepareStatement(sql);)
//		{
//			ps.setString(1, "tt");
//			ps.setFloat(2, 313.0f);
//			ps.setInt(3, 52);
//			ps.execute();
//		} catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		try (Connection c = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin"
				);
	            Statement s = c.createStatement();) 
//		{
//			String sqlInsert = "insert into Hero values (null, 'garen',616,100)";
//			String sqlDelete = "delete from hero where id =2";
//			String sqlUpdate = "update Hero set up = 300 where id = 2";
//			s.execute(sqlInsert);
//			s.execute(sqlDelete);
//			s.execute(sqlUpdate);
//			s.executeUpdate(sqlInsert);
//			s.executeUpdate(sqlDelete);
//			s.executeUpdate(sqlUpdate);
//		} 
		{
			String sqlSelect = "select * from hero";
//			s.execute(sqlSelect);
//			ResultSet rs = s.getResultSet();
//			while(rs.next()) {
//				System.out.println(rs.getInt("id"));
//			}
			boolean isSelect = s.execute(sqlSelect);
			System.out.println(isSelect);
			String sqlUpdate = "update hero set hp =300 where id < 5";
			int number = s.executeUpdate(sqlUpdate);
			System.out.println(number);
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
	}
		
}
// Tomcat can not connect, next day continue