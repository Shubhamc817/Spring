package SpringBasicAssignment2;

import java.util.List;



public class Student {
	
	private String studentid;

	private String studentName;

	private List<Test> studentTest;

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Test> getStudentTest() {
		return studentTest;
	}

	public void setStudentTest(List<Test> studentTest) {
		this.studentTest = studentTest;
	}

	

}
