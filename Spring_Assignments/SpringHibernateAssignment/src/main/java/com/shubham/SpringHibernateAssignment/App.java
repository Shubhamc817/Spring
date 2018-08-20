package com.shubham.SpringHibernateAssignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Resource r=new ClassPathResource("applicationContext.xml");  
    	    BeanFactory factory=new XmlBeanFactory(r);  
    	      
    	    StudentDAO dao=(StudentDAO)factory.getBean("d");  
    	      
    	    Student e=new Student();  
    	    e.setStudentId(953432);  
    	    e.setStudentName("Shubham Choudhary");  
    	    e.setStudentAddress("DTP- Whitefield, Bengaluru");  
    	      
    	   	 dao.saveStudent(e);  

    		 dao.listAll();
    	      
    }
}
