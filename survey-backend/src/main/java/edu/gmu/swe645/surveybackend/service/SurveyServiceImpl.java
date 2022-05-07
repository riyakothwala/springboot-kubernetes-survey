package edu.gmu.swe645.surveybackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.gmu.swe645.surveybackend.model.Student;
import edu.gmu.swe645.surveybackend.repository.SurveyRepository;

@Service
public class SurveyServiceImpl implements SurveyService {

	SurveyRepository surveyRepository;

	public SurveyServiceImpl(SurveyRepository surveyRepository) {
		super();
		this.surveyRepository = surveyRepository;
	}

	@Override
	public Optional<Student> getStudent(long id) {
		return surveyRepository.findById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return surveyRepository.findAll();
	}

	@Override
	public Student addStudent(Student s) {
		return surveyRepository.save(s);
	}

}
