package pl.lodz.uni.math.crudApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.lodz.uni.math.crudApplication.Student.Student; 

public interface StudentJpaRepository  extends JpaRepository<Student, Integer> {

}
