package com.shubham.SpringAssignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	      Movie obj = (Movie) context.getBean("movie");
	      
		System.out.println("Movie's Id - "+obj.getMovieId());
		System.out.println("Movie's Name - "+obj.getMovieName());
		System.out.println("Movie's Actor - "+obj.getMovieActor());
	   }

}
