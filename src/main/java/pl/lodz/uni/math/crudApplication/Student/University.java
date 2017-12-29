package pl.lodz.uni.math.crudApplication.Student;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Lazy;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UNIVERSITY_ID")
	private Integer id;
	
	private String name;
	private String city;
	
	@OneToMany(mappedBy = "university")
	@JsonBackReference

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
