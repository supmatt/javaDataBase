package jdbc;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import charactor.Hero;

public class TestJDBC {
	   
    public static Hero get(int id) {
        Hero hero = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
            Statement s = c.createStatement();) {
 
            String sql = "select * from hero where id = " + id;
   
            ResultSet rs = s.executeQuery(sql);
   
            // 因为id是唯一的，ResultSet最多只能有一条记录
            // 所以使用if代替while
            if (rs.next()) {
                hero = new Hero();
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                hero.name = name;
                hero.hp = hp;
                hero.damage = damage;
                hero.id = id;
            }
   
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return hero;
   
    }
   
    public static void main(String[] args) {
           
        Hero h = get(21);
        System.out.println(h.name);
		
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
////            String sql = "insert into hero values(null," + "'提莫'" + "," + 313.0f + "," + 50 + ")";
////            String sql = "delete from hero where id = 23";
//			String sql = "update hero set name = 'name3', hp = 340 where id = 21";
//            
//            s.execute(sql);
//              
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//		execute("insert into hero values(null," + "'提莫2'" + "," + 313.0f + "," + 50 + ")");
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
//		try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//		list(6,3);
//	}
//		 try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
//	                "root", "admin"); Statement s = c.createStatement();) {
	 
//	            String sql = "select * from hero";
//	 
//	            // 执行查询语句，并把结果集返回给ResultSet
//	            ResultSet rs = s.executeQuery(sql);
//	            while (rs.next()) {
//	                int id = rs.getInt("id");// 可以使用字段名
//	                String name = rs.getString(2);// 也可以使用字段的顺序
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
//	                int id = rs.getInt("id");// 可以使用字段名
//	                String name = rs.getString(2);// 也可以使用字段的顺序
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
//		String sql = "insert into hero values(null,?,?,?)";
////		String sql2 = "delect from hero where id = ?";
//		try (Connection c = DriverManager.getConnection(
//				"jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin"
//				);
//				PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//				Preparedstatement ps2 = c.prepareStatement(sql2,Statement.RETURN_GENERATED_KEYS);
//	            Statement s = c.createStatement();
//				) 
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
//		{
//			String sqlSelect = "select * from hero";
//			s.execute(sqlSelect);
//			ResultSet rs = s.getResultSet();
//			while(rs.next()) {
//				System.out.println(rs.getInt("id"));
//			}
//			boolean isSelect = s.execute(sqlSelect);
//			System.out.println(isSelect);
//			String sqlUpdate = "update hero set hp =300 where id < 5";
//			int number = s.executeUpdate(sqlUpdate);
//			System.out.println(number);
//			ps.setString(1, "garen");
//			ps.setFloat(2, 617);
//			ps.setInt(3, 100);
//			ps.execute();
//			ps.setString(1, "ggaren");
//			ps.execute();
//			ResultSet rs = ps.getGeneratedKeys();
//			if(rs.next()) {
//				int id = rs.getInt(1);
//				System.out.println(id);
//			}
//			DatabaseMetaData dbmd = c.getMetaData();
//			System.out.println("Database name:\t" + dbmd.getDatabaseProductName());
//			System.out.println("Database edition:\t" + dbmd.getDatabaseProductVersion());
//			System.out.println("Database and tabale:\t" + dbmd.getCatalogSeparator());
//			System.out.println("Drive edition:\t:" + dbmd.getDriverVersion());
//			System.out.println("Avilble database list: ");
//			ResultSet rs = dbmd.getCatalogs();
//			while(rs.next()) {
//				System.out.println("Database name:\t" + rs.getString(1));
//			}
//			ps.setString(1, "new one");
//			ps.setFloat(2, 666.0f);
//			ps.setInt(3, 99);
//			ps.execute();
//			ResultSet rs = ps.getGeneratedKeys();
//			int id = 0;
//			if(rs.next()) {
//				id = rs.getInt(1);
//				System.out.println(id);
//				
//			}
//			int num = id -1; //last one key
//			int num2 = 0;
			
//			while(true) {
//				String check = "select * from hero where id =" + num +"";
//				ResultSet rs2 = s.executeQuery(check);
//				boolean x= rs2.next();
//				if(x) {
//					String sqldelet = "delete from hero where id = " + num;
//					s.execute(sqldelet);
//					System.out.println("we want delet id number :" + num);
//					break;
//				}else {
//					num -= 1;
//				}
//			}
			//----------------------
//			c.setAutoCommit(false);
//			
//			
//			ResultSet rs = ps.getGeneratedKeys();
//			int id = 0;
////			if(rs.next()) {
////				id = rs.getInt(1);
////				String sql1 = "update hero set hp = hp + 1 where id = 21";
////				s.execute(sql1);
//////				String sql2 = "update hero set hp = hp - 1 where id = 34";
//////				s.execute(sql2);
////				System.out.println("try to delet "+ id + "");
////			}else {
//////				System.out.println("oh no");
////			}
//			
//			while(true) {
//				System.out.println("Do you wang delete database information?(Y or N)");
//				Scanner scc = new Scanner(System.in);
//				String ans = scc.nextLine();
//				String sql1 = "update hero set hp = hp + 1 where id = 21";
//				s.execute(sql1);
//				if(ans.equals("Y")) {
//					c.commit();
//					scc.close();
//					break;
//				} else if(ans.equals("N")) {
//					System.out.println("cancel delete");
//					scc.close();
//					break;
//				} ;
//				continue;
//			}
			//===================
			
//			c.setAutoCommit(false);
//			ResultSet rs = ps.getGeneratedKeys();
//            while (rs.next()) {
//                int a = rs.getInt(1); // 取id
//                System.out.println("即将删除的数据id：" + a);
//                ps.setInt(1, a); // 放入需要删除的id进 删除SQL语句
//                ps.execute();
//            }
// 
//            while (true) { // 除非输入Y/N，否则无限判断选择
//                System.out.println("是否删除这些数据（Y/N）:");
//                Scanner ss = new Scanner(System.in);
//                String ch = ss.nextLine();
//                if (ch.length() == 1) {
//                    if (ch.equals("Y")) {
//                        c.commit();
//                        System.out.println("删除成功!");
//                        break;
//                    } else if (ch.equals("N")) {
//                        System.out.println("取消删除！");
//                        break;
//                    } else {
//                        System.out.println("输入有误，请重新输入！");
//                        continue;
//                    }
//                } else {
//                    System.out.println("输入有误，请重新输入！");
//                    continue;
//                }
//            }
			
			
//		}
//		catch (SQLException e) {
//			// TODO: handle exception
//		}
	}
		
}
// Tomcat can not connect, next day continue