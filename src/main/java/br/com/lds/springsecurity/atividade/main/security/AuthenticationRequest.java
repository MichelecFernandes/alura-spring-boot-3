package br.com.lds.springsecurity.atividade.main.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Profile;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Profile("ldsSecurity")
public class AuthenticationRequest {
    private String email;
    private String password;
}
