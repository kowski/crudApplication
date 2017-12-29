package pl.lodz.uni.math.crudApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pl.lodz.uni.math.crudApplication.Student.University; 
@RepositoryRestResource(excerptProjection = University.class)
public interface UniversityJpaRepository  extends JpaRepository<University, Integer> {
 
}
