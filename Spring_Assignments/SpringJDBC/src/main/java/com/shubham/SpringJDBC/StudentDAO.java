package com.shubham.SpringJDBC;

import java.util.List;

public interface StudentDAO {
	
	public void save(Student student);
	
	public Student getById(int id);
	
	public List<Student> getAll();

}
