package com.springcore;

public class Student {
private int studentId;
private String StudentName;
private String StudentAddress;
private String StudentEmail;

public String getStudentEmail() {
	return StudentEmail;
}
public void setStudentEmail(String studentEmail) {
	StudentEmail = studentEmail;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public String getStudentAddress() {
	return StudentAddress;
}
public void setStudentAddress(String studentAddress) {
	StudentAddress = studentAddress;
}
public Student(int studentId, String studentName, String studentAddress,String studentEString) {
	super();
	this.studentId = studentId;
	StudentName = studentName;
	StudentAddress = studentAddress;
	StudentEmail= StudentEmail;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
			+ ", StudentEmail=" + StudentEmail + "]";
}


}
