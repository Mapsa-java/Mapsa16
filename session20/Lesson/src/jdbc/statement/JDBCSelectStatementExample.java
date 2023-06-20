package jdbc.statement;

import jdbc.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectStatementExample {
	
	public static void main(String[] args) throws SQLException {
		String query = "SELECT * FROM customer";
		
		try (var conn = DBUtils.getConnection();
			 Statement statement = conn.createStatement()) {
			try (ResultSet rs = statement.executeQuery(query)) {
				while (rs.next()) {
					System.out.println("=================");
					System.out.println("code:\t" + rs.getString("cust_code"));
					System.out.println("name:\t" + rs.getString("cust_name"));
					System.out.println("mail:\t\t" + rs.getString("cust_mail"));
				}
			};
			
		}
	}

}
