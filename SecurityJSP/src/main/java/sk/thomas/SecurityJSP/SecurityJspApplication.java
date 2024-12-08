package sk.thomas.SecurityJSP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {
		"classpath:spring-context.xml",
		"classpath:spring-dispatcher-servlet.xml"
})
public class SecurityJspApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SecurityJspApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SecurityJspApplication.class);
	}

}
