package com.example.trabajoPractico5;

import com.example.trabajoPractico5.entities.Categoria;
import com.example.trabajoPractico5.entities.Instrumento;
import com.example.trabajoPractico5.repositories.CategoriaRepository;
import com.example.trabajoPractico5.repositories.InstrumentoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrabajoPractico5Application {

	private static final Logger logger = LoggerFactory.getLogger(TrabajoPractico5Application.class);


	public static void main(String[] args) {
		SpringApplication.run(TrabajoPractico5Application.class, args);
	}

	@Bean
	CommandLineRunner init(){
		return args -> {
			logger.info("Iniciando ...");
		};
	}


}
