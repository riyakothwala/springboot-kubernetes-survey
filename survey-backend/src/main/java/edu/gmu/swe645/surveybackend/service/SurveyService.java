package edu.gmu.swe645.surveybackend.service;

import java.util.List;
import java.util.Optional;

import edu.gmu.swe645.surveybackend.model.Student;

public interface SurveyService {
	
	public Optional<Student> getStudent(long id);

	public List<Student> getAllStudent();

	public Student addStudent(Student s);

}
