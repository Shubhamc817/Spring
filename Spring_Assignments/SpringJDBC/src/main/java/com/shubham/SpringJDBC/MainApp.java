package com.shubham.SpringJDBC;

import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentDAOImpl studentDAO=ctx.getBean("studentDAO",StudentDAOImpl.class);
		
		Student student=new Student();
		
		int rand = new Random().nextInt(1000);
		
		student.setStudentId(rand);
		student.setStudentName("Shaheen Ghazala");
		student.setStudentAddress("ITPL, Bengaluru");
		
		//studentDAO.save(student);
		
		List<Student> empList = studentDAO.getAll();
		for(Student stud:empList) {
			System.out.println("Student ID :"+stud.getStudentId()+ "\t Student Name :"+stud.getStudentName()+"\tStudent Address :"+stud.getStudentAddress());
		}


	}

}
