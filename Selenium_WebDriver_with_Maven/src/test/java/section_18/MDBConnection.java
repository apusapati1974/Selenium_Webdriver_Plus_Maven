package section_18;

import java.sql.SQLException;

public class MDBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DBConnections conn = new DBConnections();
		conn.mysqlDatabaseConnection();
	}

}
