package SpringBasicAssignment2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBasicsAssignment2.xml");
	      Student obj = (Student) context.getBean("student0");
	      
		System.out.println("Student's Id "+obj.getStudentid());
		System.out.println("Student's Name "+obj.getStudentName());
		List <Test> list=(List)obj.getStudentTest();
		for(Test test:list){
	        
		System.out.println("Test Details of Student  "+ test.getTestName());
	}

		 Student obj1 = (Student) context.getBean("student1");
	      
		System.out.println("Student's Id "+obj1.getStudentid());
		System.out.println("Student's Name "+obj1.getStudentName());
		List <Test> list1=(List)obj1.getStudentTest();
		System.out.println("Test Details of Student");
		for(Test test1:list1){
			
			System.out.println(test1.getTestName());
	}

	}

}
