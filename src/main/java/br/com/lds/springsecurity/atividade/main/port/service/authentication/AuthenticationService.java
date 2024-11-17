package br.com.lds.springsecurity.atividade.main.port.service.authentication;

public interface AuthenticationService {
    void authentication(final String email, final String password);
}
