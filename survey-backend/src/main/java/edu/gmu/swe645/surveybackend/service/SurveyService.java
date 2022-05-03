package edu.gmu.swe645.surveybackend.service;

import java.util.List;

import edu.gmu.swe645.surveybackend.model.Student;

public interface SurveyService {
	
	//public Student getStudent(String id);

	public List<Student> getAllStudent();

	public Student addStudent(Student s);

}
