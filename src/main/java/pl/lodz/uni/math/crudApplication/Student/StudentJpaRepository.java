package pl.lodz.uni.math.crudApplication.Student;

import org.springframework.data.jpa.repository.JpaRepository; 

public interface StudentJpaRepository  extends JpaRepository<Student, Integer> {

}
