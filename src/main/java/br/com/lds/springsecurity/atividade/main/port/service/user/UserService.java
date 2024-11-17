package br.com.lds.springsecurity.atividade.main.port.service.user;

import br.com.lds.springsecurity.atividade.main.domain.UserModel;
import br.com.lds.springsecurity.atividade.main.port.service.crud.CrudService;

public interface UserService extends CrudService<UserModel>, ReadByEmailService{

}
