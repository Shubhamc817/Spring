package com.shubham.SpringMVC;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Marks marks = new Marks();
		
		// add student object to the model
		theModel.addAttribute("marks", marks);
		
		return "student";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("marks") Marks marks) 
	{
		
		// log the input data
		System.out.println("Marks scored: " + marks.getScience_marks()
							+ " " + marks.getMaths_marks()+" "+marks.getEnglish_marks());
		
		if(marks.getEnglish_marks()>0 && marks.getEnglish_marks()<=100 &&marks.getMaths_marks()>0 && marks.getMaths_marks()<=100 && marks.getScience_marks()>0 && marks.getScience_marks() <=100)
		return "student-form";
		
		else
			return "error";
	}
	
}









