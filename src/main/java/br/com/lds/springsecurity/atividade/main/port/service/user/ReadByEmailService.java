package br.com.lds.springsecurity.atividade.main.port.service.user;

import br.com.lds.springsecurity.atividade.main.domain.UserModel;

public interface ReadByEmailService {
    UserModel findByEmail(final String email);
}
