package jdbc.statement;

import jdbc.DBUtils;

import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertStatementExample {
	
	public static void main(String[] args) throws SQLException {
		String query = "INSERT INTO customer \n" +
				"\tVALUES\n" +
				"\t('C0007', 'Robert', 'trob@gmail.com1'),\n" +
				"\t('C0013', 'John', 'ijohn@gmail.com1'),\n" +
				"\t('C0009', 'William', 'will@gmail.com'), \n" +
				"\t('C0010', 'Smith', 'smth@gmail.com'), \n" +
				"\t('C0011', 'Kumar', 'kur@gmail.com'),\n" +
				"\t('C0012', 'Peter', 'peterOgmail.com'); ";
		try (var conn = DBUtils.getConnection();
			 Statement statement = conn.createStatement()) {
			int rows = statement.executeUpdate(query);
			System.out.println(rows);
			
		}
	}

}
