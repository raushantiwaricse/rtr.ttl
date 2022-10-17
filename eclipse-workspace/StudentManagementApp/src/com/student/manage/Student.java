
package com.student.manage;

public class Student {
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	/**
	 * @param studentId
	 * @param studentName
	 * @param studentPhone
	 * @param studentCity
	 */
	public Student(int studentId, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	/**
	 * @param studentName
	 * @param studentPhone
	 * @param studentCity
	 */
	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + this.studentId + ", studentName=" + this.studentName + ", studentPhone="
				+ this.studentPhone + ", studentCity=" + this.studentCity + "]";
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return this.studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return this.studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentPhone
	 */
	public String getStudentPhone() {
		return this.studentPhone;
	}
	/**
	 * @param studentPhone the studentPhone to set
	 */
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	/**
	 * @return the studentCity
	 */
	public String getStudentCity() {
		return this.studentCity;
	}
	/**
	 * @param studentCity the studentCity to set
	 */
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
