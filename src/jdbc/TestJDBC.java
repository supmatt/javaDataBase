package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
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
		 try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
	                "root", "admin"); Statement s = c.createStatement();) {
	 
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
			 String name = "dashen";
			 String password = "thisispassword";
			 String sql = "select * from user where name = '"+name+"' and "
			 		+ "password = '"+password+"'";
			 ResultSet rs = s.executeQuery(sql);
			 if(rs.next())
				 System.out.println("Id and ps correct");
			 else
				 System.out.println("Id or ps was wrong");
			 
//	            }
	            // ��һ��Ҫ������ر�ReultSet����ΪStatement�رյ�ʱ�򣬻��Զ��ر�ResultSet
	            // rs.close();
	 
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}
}
// Tomcat can not connect, next day continue