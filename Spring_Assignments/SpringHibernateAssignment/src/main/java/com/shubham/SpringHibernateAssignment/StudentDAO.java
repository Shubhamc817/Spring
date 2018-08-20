package com.shubham.SpringHibernateAssignment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;



public class StudentDAO   {
	
	 HibernateTemplate template;  
	  public void setTemplate(HibernateTemplate template) {  
	      this.template = template;  
	}

	public void saveStudent(Student stud){
	

	template.save(stud);
	}

	public Student getById(int id){  
		   Student e=(Student)template.get(Student.class,id);  
		   return e;  
	}  

	public List<Student> listAll(){  
	    List<Student> list=new ArrayList<Student>();  
	    list=template.loadAll(Student.class);  
	    return list;  
	}  

}
