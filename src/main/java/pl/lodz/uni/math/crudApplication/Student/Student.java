package pl.lodz.uni.math.crudApplication.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.Lazy;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity 
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_ID")
	private Integer id;
	private String name;
	private String surname;
	private String email;
	@ManyToOne
	@JoinColumn(name = "university_id") 
	private University university;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	} 

}
