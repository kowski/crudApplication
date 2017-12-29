package pl.lodz.uni.math.crudApplication.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import pl.lodz.uni.math.crudApplication.Student.University;

@Configuration
public class RepositoryConfig extends RepositoryRestMvcConfiguration {
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		//config.exposeIdsFor(User.class, Todo.class);
	}
}