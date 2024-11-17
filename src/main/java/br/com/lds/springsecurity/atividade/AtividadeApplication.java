package br.com.lds.springsecurity.atividade;

import br.com.lds.springsecurity.atividade.main.port.service.util.ResourceFileService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;

@SpringBootApplication
public class AtividadeApplication {

	@Autowired
	private ResourceFileService resourceFileService;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(AtividadeApplication.class, args);
	}

	@PostConstruct
	private void initializeDatabase(){
		System.out.println("Iniciando banco de dados");
		final String basePath = "db_atividade";
		try {
			final String createTable = resourceFileService.read(basePath + "/create-tables.sql");
			final String insertScript = resourceFileService.read(basePath + "/insert-data.sql");
			jdbcTemplate.execute(createTable);
			jdbcTemplate.execute(insertScript);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}


