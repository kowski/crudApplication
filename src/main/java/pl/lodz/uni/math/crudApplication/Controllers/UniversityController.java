package pl.lodz.uni.math.crudApplication.Controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.lodz.uni.math.crudApplication.Repository.UniversityJpaRepository;
import pl.lodz.uni.math.crudApplication.Student.University;

@Controller
public class UniversityController {
	@Autowired
	private UniversityJpaRepository universityRepo;
	final static Logger logger = Logger.getLogger(UniversityController.class);
	
	@GetMapping(path="/university")
	public @ResponseBody List<University> allUniversity() {
		logger.info(universityRepo.findAll().get(0).getId());
		return universityRepo.findAll();
	}
}
