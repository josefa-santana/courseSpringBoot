package courseSpringBoot.courseSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "courseSpringBoot.courseSpringBoot.entities")
@SpringBootApplication

public class CourseSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseSpringBootApplication.class, args);
	}

}
