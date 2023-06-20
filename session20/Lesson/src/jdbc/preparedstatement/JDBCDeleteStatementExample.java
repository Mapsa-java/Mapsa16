package jdbc.preparedstatement;

import jdbc.DBUtils;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCDeleteStatementExample {
	
	public static void main(String[] args) throws SQLException {
		String query = "DELETE FROM user WHERE id = ?";
		try (var conn = DBUtils.getConnection();
			 PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			preparedStatement.setInt(1, 20);
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows);
			
		}
	}
	
}
