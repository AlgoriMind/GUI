package TestSwing;

import java.sql.*; 

public class TestMySQL {
	
	Connection con = null;
	Statement sql;
	ResultSet rs;
	
	public void select() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information?serverTimezone=GMT","root","death65god");
			String sql = "select * from demo";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			System.out.println("      "+"账号:" + "      " + "密码:");
			while(rs.next()){
				String number = rs.getString("number");
				String passwd = rs.getString("passwd");
				System.out.println(number + "   " + passwd);
			}
			rs.close();
			statement.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update(String number,String passwd) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/information?serverTimezone=GMT","root","death65god");
			String sql = "update demo set passwd = '" + passwd + "'where number = " + number + ";";
			PreparedStatement statement =  connection.prepareStatement(sql);
			statement.execute();
			statement.close();
			connection.close();
			System.out.println("账号为" + number + "的密码更新为:" + passwd);			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void insert(String number,String passwd) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/information?serverTimezone=GMT","root","death65god");
			String sql = "insert into demo values('" + number + "','" + passwd + "');";
			PreparedStatement statement =  connection.prepareStatement(sql);
			statement.execute();
			statement.close();
			connection.close();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delete(String number) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/information?serverTimezone=GMT","root","death65god");
			String sql = "delete from demo where number = " + number;
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.execute();
			statement.close();
			connection.close();
			System.out.println("账号为" + number + "的数据已删除!");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
