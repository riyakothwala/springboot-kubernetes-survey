package edu.gmu.swe645.surveybackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import edu.gmu.swe645.surveybackend.model.Student;
import edu.gmu.swe645.surveybackend.service.SurveyService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200")
public class SurveyController {

	@Autowired
	private SurveyService surveyService;

	public SurveyController() {
		super();
	}

	@PostMapping
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		try {
			Student postedStudent = surveyService.addStudent(student);
			return new ResponseEntity<Student>(postedStudent, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", e);
		}
	}

	@GetMapping
	public List<Student> getAllStudent() {
		List<Student> studentList = surveyService.getAllStudent();
		return studentList;
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") long id) {
		try {

			Optional<Student> student = surveyService.getStudent(id);

			if (student.isEmpty()) {
				return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<Student>(student.get(), HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error");
		}
	}
}