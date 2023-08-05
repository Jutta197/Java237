package jdbc_ex2;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.postgresql.Driver;

public class JdbcEx2 {
	
	public static void main(String[] args) {
		test2();

	}
	
	public static void test2() {
		Driver driver = new Driver();
		String propertyPath = "src/jdbc_ex2/hello.properties";
		
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(propertyPath));
		}catch(IOException e) {
			System.out.println("faile");
			e.printStackTrace();
		}
		
		String url = properties.getProperty("url");
		Properties info = new Properties();
		info.setProperty("user", properties.getProperty("user"));
		info.setProperty("password", properties.getProperty("password"));
		
		try(
				Connection con = driver.connect(url, info);
				Statement smt = con.createStatement();
			){
			
			String sql = "SELECT * FROM student";
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("haha");
				System.out.println("[id: "+rs.getInt("id")+",name"+rs.getString("name") +",score: "+rs.getInt("score")+"]");
			
//			insert???????
//			String sql ="INSERT INTO student VALUES(6,'Taro',100)";
//			int rs = smt.executeUpdate(sql);
//			System.out.println(rs);
			
			}
		}catch(SQLException e) {
			System.out.println("fail");
			e.printStackTrace();
			
		}
		
	}
}


