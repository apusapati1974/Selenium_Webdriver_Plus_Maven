package section_18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnections {
	
	public void mysqlDatabaseConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "himasritha@2004");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM employee;");
		
		while(rs.next()) {
			System.out.print(rs.getString("id")+"  ");
			System.out.print(rs.getString("name")+"  ");
			System.out.println(rs.getString("salary"));
		}
	}
}
