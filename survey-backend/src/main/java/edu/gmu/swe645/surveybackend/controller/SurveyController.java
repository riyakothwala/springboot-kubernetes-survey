package edu.gmu.swe645.surveybackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.gmu.swe645.surveybackend.model.Student;
import edu.gmu.swe645.surveybackend.service.SurveyService;

@RestController
public class SurveyController {
	private SurveyService surveyService;

	public SurveyController(SurveyService surveyService) {
		super();
		this.surveyService = surveyService;
	}

	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return surveyService.addStudent(student);
	}

	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return surveyService.getAllStudent();
	}

}