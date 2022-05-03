package edu.gmu.swe645.surveybackend.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String lastName;

	private String address;
	private String city;
	private String states;
	private String zip;

	private String telephone;
	private String email;

	private String surveyDate;

	@ElementCollection
	private List<String> campusLikes;
	private String interested;

	private String recommend;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSurveyDate() {
		return surveyDate;
	}

	public void setSurveyDate(String surveyDate) {
		this.surveyDate = surveyDate;
	}

	public List<String> getCampusLikes() {
		return campusLikes;
	}

	public void setCampusLikes(List<String> campusLikes) {
		this.campusLikes = campusLikes;
	}

	public String getInterested() {
		return interested;
	}

	public void setInterested(String interested) {
		this.interested = interested;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

}
