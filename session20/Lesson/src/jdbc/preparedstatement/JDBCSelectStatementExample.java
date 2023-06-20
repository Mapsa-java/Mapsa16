package jdbc.preparedstatement;

import jdbc.DBUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelectStatementExample {
	
	public static void main(String[] args) throws SQLException {
		String query = "SELECT * FROM mapsa.order_details where order_qty > ?";
		
		try (var conn = DBUtils.getConnection();
			 PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			preparedStatement.setInt(1 , 5);
			try (ResultSet rs = preparedStatement.executeQuery()) {
				while (rs.next()) {
					System.out.println("=================");
					System.out.println("code" + rs.getString("order_no"));

				}
			};
			
		}
	}

}
