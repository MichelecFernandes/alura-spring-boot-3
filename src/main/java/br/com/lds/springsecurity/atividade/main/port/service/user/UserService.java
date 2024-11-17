package br.com.lds.springsecurity.atividade.main.port.service.user;

import br.com.lds.springsecurity.atividade.main.domain.UserModel;
import br.com.lds.springsecurity.atividade.main.port.crud.CrudService;
import br.com.lds.springsecurity.atividade.main.port.crud.UpdateService;

public interface UserService extends CrudService<UserModel>, ReadByEmailService{
}