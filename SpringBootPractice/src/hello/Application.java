package hello;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Let's inspect the beans provided by Spring Boot:");
				String[] beanNames = applicationContext.getBeanDefinitionNames();
				Arrays.sort(beanNames);
				System.out.println(Arrays.toString(beanNames));
			}
		};
	}
}
