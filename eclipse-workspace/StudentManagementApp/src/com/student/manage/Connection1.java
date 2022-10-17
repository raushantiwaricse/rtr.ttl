/**
 * 
 */
package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author user
 *
 */
public class Connection1 {
	static Connection con;
	public static Connection createConn() {
		
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			String user = "root";
			String password = "root";
			String url = "jdbd:mysql://localhost:3306/student_manage";
			
			con = DriverManager.getConnection(url , user , password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
