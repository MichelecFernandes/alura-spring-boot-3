package br.com.lds.springsecurity.atividade.main.port.dao.user;


import br.com.lds.springsecurity.atividade.main.domain.UserModel;

public interface ReadByEmailDao {
    UserModel readByEmail(final String email);
}
