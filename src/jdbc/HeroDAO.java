package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import java.sql.ResultSet;

import charactor.Hero;
public class HeroDAO implements DAO{
	public HeroDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEndcoding=UTF-8", "root", "admin");
		
	}
	public int getTotal()
	{
		int total = 0;
		try(Connection c = getConnection(); Statement s = c.createStatement()) {
			String sql = "select count(*) from hero";
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				total = rs.getInt(1);
			}
			System.out.println("Total: " + total);
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Hero hero) {
		// TODO Auto-generated method stub
		String sql = "insert into hero values(null,?,?,?)";
		try(Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
			ps.setString(1, hero.name);
			ps.setFloat(2, hero.hp);
			ps.setInt(3, hero.damage);
			
			ps.execute();
			
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next()) {
				int id = rs.getInt(1);
				hero.id = id;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void update(Hero hero) {
		// TODO Auto-generated method stub
		String sql = "update hero set name=?, hp = ?,damage=? where id =?";
		try(Connection c =getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
			ps.setString(1, hero.name);
			ps.setFloat(2, hero.hp);
			ps.setInt(3, hero.damage);
			ps.setInt(4, hero.id);
			
			ps.execute();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try(Connection c = getConnection(); Statement s = c.createStatement();) {
			String sql = "delete from hero where id = " + id;
			s.execute(sql);
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	@Override
	public Hero get(int id) {
		// TODO Auto-generated method stub
		Hero hero = null;
		try(Connection c = getConnection();Statement s = c.createStatement();) {
			String sql = "select * from hero where id = " + id;
			ResultSet rs = s.executeQuery(sql);
			
			if(rs.next()) {
				hero = new Hero();
				String name = rs.getString(2);
				float hp = rs.getFloat("hp");
				int damage = rs.getInt(4);
				hero.name = name;
				hero.hp = hp;
				hero.damage = damage;
				hero.id = id;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Hero> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hero> list(int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
