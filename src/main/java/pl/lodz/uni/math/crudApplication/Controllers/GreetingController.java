package pl.lodz.uni.math.crudApplication.Controllers;

import java.util.List;

import org.apache.catalina.valves.StuckThreadDetectionValve;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pl.lodz.uni.math.crudApplication.Repository.StudentJpaRepository;
import pl.lodz.uni.math.crudApplication.Student.Student;

@Controller
public class GreetingController {
	@Autowired
	private StudentJpaRepository studentJpaRepo;

	final static Logger logger = Logger.getLogger(UniversityController.class);

	@GetMapping(path = "/")
	public String index() {
		return "index";
	}

	@GetMapping(path = "/student/createstudent")
	public String create() {
		return "createStudent";
	}

	@GetMapping(path = "/student")
	public @ResponseBody List<Student> student() {
		logger.info(studentJpaRepo.findAll().get(0).getUniversity().getName());
		return studentJpaRepo.findAll();
	}

	@GetMapping(path = "/student/{id}")
	public @ResponseBody Student getStudent(@PathVariable("id") int id) {
		return studentJpaRepo.findOne(id);
	}

	@PostMapping(value = "/student")
	public @ResponseBody Student createStudent(@RequestBody Student student) {
		return studentJpaRepo.save(student);
	}

	@PutMapping(value = "/student/{id}")
	public @ResponseBody Student updateStudent(@RequestBody Student student) {
		return studentJpaRepo.save(student);
	}

	@DeleteMapping(value = "/student/{id}")
	public @ResponseBody void deleteStudent(@PathVariable("id") int id) {
		studentJpaRepo.delete(id);
	}

}
