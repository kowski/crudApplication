package pl.lodz.uni.math.crudApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.lodz.uni.math.crudApplication.Student.University; 

public interface UniversityJpaRepository  extends JpaRepository<University, Integer> {

}
