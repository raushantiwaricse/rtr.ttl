/**
 * 
 */
package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author user
 *
 */
public class StudentDataSave {
	
	public static boolean insertStudentToDB(Student st) {
		boolean f= false;
		try {
			
			//create connection
			Connection con = Connection1.createConn();
			
			//Dynamic query
			
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the value of parameter
			
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			pstmt.executeUpdate();
				f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}	
}
