package PetrikDevOps.Quiz;

import PetrikDevOps.Quiz.Config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication(scanBasePackages = {"PetrikDevOps.Quiz"})
public class QuizApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(QuizApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}
	
}
