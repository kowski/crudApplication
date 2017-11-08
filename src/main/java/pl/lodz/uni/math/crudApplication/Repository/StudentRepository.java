package pl.lodz.uni.math.crudApplication.Repository;

import org.springframework.data.repository.CrudRepository;

import pl.lodz.uni.math.crudApplication.Student.Student;

public interface StudentRepository  extends CrudRepository<Student, Long> {

}
