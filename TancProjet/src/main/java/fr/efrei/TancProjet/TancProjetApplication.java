package fr.efrei.TancProjet;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TancProjetApplication {

	private static final Logger log = LoggerFactory.getLogger(TancProjetApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TancProjetApplication.class, args);
	}
	

}

