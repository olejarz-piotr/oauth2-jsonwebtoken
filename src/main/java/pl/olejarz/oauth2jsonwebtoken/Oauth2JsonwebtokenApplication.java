package pl.olejarz.oauth2jsonwebtoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class Oauth2JsonwebtokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2JsonwebtokenApplication.class, args);


	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean () {
		FilterRegistrationBean filterRegi = new FilterRegistrationBean();
		filterRegi.setFilter(new JWTFilter());
		filterRegi.setUrlPatterns(Collections.singleton("/say"));

		return filterRegi;
	}
}