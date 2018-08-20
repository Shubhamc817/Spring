package com.shubham.SpringAOP;

import java.util.HashMap;
import java.util.Map;

public class StudentService {
	
	Map<Integer, Student> map=new HashMap<Integer,Student>();
	
	 
	
	public Map<Integer,Student> getAllDetails(){
		
        
		map.put(1, new Student("Shubham Choudhary","DTP Whitefield,Bengaluru"));
	     
	     map.put(2, new Student("Shaheen Ghazala","Electronic City,Bengaluru"));
        
	     map.put(3, new Student("Madipati Sudhakar","DTP Whitefield,Bengaluru"));
	     
	     map.put(4, new Student("Soumik Sarkar","Electronic City,Bengaluru"));
        
        
        
		return map;
	}
	
	public Student getById(int id){
		
	      
			 map.put(1, new Student("Shubham Choudhary","DTP Whitefield,Bengaluru"));
		     
		     map.put(2, new Student("Shaheen Ghazala","Electronic City,Bengaluru"));
		     
		     
		     map.put(3, new Student("Madipati Sudhakar","DTP Whitefield,Bengaluru"));
		     
		     map.put(4, new Student("Soumik Sarkar","Electronic City,Bengaluru"));

		     return map.get(id);
	}

}
