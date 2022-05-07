package edu.gmu.swe645.surveybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.gmu.swe645.surveybackend.model.Student;

@Repository
public interface SurveyRepository extends JpaRepository<Student, Long> {

}
