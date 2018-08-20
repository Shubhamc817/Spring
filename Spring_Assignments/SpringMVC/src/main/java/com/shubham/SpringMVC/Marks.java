package com.shubham.SpringMVC;



public class Marks {

	
	private int science_marks;
	
	private int maths_marks;
	
	private int english_marks;
	
	private int total;
	
	public int totalMarks() {
		return (science_marks+maths_marks+english_marks);
	}
	
	public Marks() {
		
	}

	public int getScience_marks() {
		return science_marks;
	}

	public void setScience_marks(int science_marks) {
		this.science_marks = science_marks;
	}

	public int getMaths_marks() {
		return maths_marks;
	}

	public void setMaths_marks(int maths_marks) {
		this.maths_marks = maths_marks;
	}

	public int getEnglish_marks() {
		return english_marks;
	}

	public void setEnglish_marks(int english_marks) {
		this.english_marks = english_marks;
	}
	
	
}
