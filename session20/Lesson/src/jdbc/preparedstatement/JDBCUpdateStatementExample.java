package jdbc.preparedstatement;

import jdbc.DBUtils;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdateStatementExample {
	
	public static void main(String[] args) throws SQLException {
/*		String query = "update customer set cust_name = 'New Name' , cust_mail = 'newemail@gmail'" +
				" where cust_code = 'C0001'";*/
		String query = "update customer set cust_name = ?  , cust_mail = ?" +
				" where cust_code = ? ";
		try (var conn = DBUtils.getConnection();
			 PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			preparedStatement.setString(1, "New Name");
			preparedStatement.setString(2 , "newemail@gmail");
			preparedStatement.setString(3 , "C0001");
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows);
			
		}
	}

}
