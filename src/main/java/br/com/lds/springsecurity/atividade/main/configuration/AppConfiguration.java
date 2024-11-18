package br.com.lds.springsecurity.atividade.main.configuration;

import br.com.lds.springsecurity.atividade.main.dao.postgres.UserPostgresDaoImpl;
import br.com.lds.springsecurity.atividade.main.port.service.authentication.AuthenticationService;
import br.com.lds.springsecurity.atividade.main.port.service.user.UserDao;
import br.com.lds.springsecurity.atividade.main.port.service.user.UserService;
import br.com.lds.springsecurity.atividade.main.security.JwtService;
import br.com.lds.springsecurity.atividade.main.security.JwtServiceImpl;
import br.com.lds.springsecurity.atividade.main.service.authentication.JwtAuthenticationServiceImpl;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.sql.Connection;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import io.swagger.v3.oas.models.info.Info;
@Configuration
public class AppConfiguration {
    @Bean
    @Profile({"prod", "ldsSecurity"})
    public UserDao getUserDao(final Connection connection) {
        return new UserPostgresDaoImpl(connection);
    }

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI().info(new Info().
                title("Atividade de LDS").
                version("0.0.1").
                description("Atividade  de LDS sobre Spring Security"));
    }

    @Bean
    @Profile("ldsSecurity")
    public AuthenticationService jwtAuthenticationService(final UserService userService, final PasswordEncoder passwordEncoder){
        return new JwtAuthenticationServiceImpl(userService, passwordEncoder);
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Profile("ldsSecurity")
    public JwtService jwtService(){
        return new JwtServiceImpl();
    }
}
