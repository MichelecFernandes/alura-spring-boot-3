package br.com.lds.springsecurity.atividade.main.configuration;

import br.com.lds.springsecurity.atividade.main.dao.postgres.UserPostgresDaoImpl;
import br.com.lds.springsecurity.atividade.main.port.service.authentication.AuthenticationService;
import br.com.lds.springsecurity.atividade.main.port.service.user.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.Connection;
@Configuration
public class AppConfiguration {
    @Bean
    @Profile("prod")
    public UserDao getUserDao(final Connection connection) {
        return new UserPostgresDaoImpl(connection);
    }
//    @Bean
//    @Profile("prod")
//    public AuthenticationService getAuthenticationService(UserService userService){
//        return new BasicAuthenticationServiceImpl(userService);
//    }
}
