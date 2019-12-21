package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/*
 * 1. DB technology --- MySql
 * 2. Database connection  --- 127.0.0.1:3306
 * 3. Data base credentials --- username : user1, password : password
 * 4. Database name --- world
 * 5. Table name --- city
 * 6. columns name and data types
 * ID -- int, Name -- String, CountryCode -- String, District -- String, Population -- int
 */

public class DataBaseDemo {
	public static void main(String[] args) throws Exception {
		/*
		 * Load the driver class related to the DB technology dynamically using
		 * forName() method of Class class
		 */
		Class.forName("com.mysql.cj.jdbc.Driver");
		/*
		 * Create connection to the required database by calling getConnection() method
		 * of DriverManager class and storing reference in Connection class object
		 */
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/world", "user1", "password");

		/*
		 * Create Statement class object by calling createStatement() method of
		 * Connection class so that we can execute SQL queries
		 */
		Statement statement = con.createStatement();

		/*
		 * Execute SQL queries using executeQuery() method of Statement class and store
		 * the results in ResultSet class object
		 */
		ResultSet rs = statement.executeQuery("select * from city where CountryCode = 'IND' and District = 'Maharashtra'");

		/* Iterate over the results using next() method of ResultSet class */
		while(rs.next()) {
			int id = rs.getInt("ID");
			String city = rs.getString("Name");
			String countryCode = rs.getString("CountryCode");
			String state = rs.getString("District");
			int population = rs.getInt("Population");
			System.out.println(id+"\t"+city+"\t"+countryCode+"\t"+state+"\t"+population);
		}

		/* Close the data base connection using close() method of Connection class */
		con.close();
	}

}
