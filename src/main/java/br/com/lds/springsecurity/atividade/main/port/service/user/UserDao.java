package br.com.lds.springsecurity.atividade.main.port.service.user;

import br.com.lds.springsecurity.atividade.main.domain.UserModel;
import br.com.lds.springsecurity.atividade.main.port.dao.CrudDao;

public interface UserDao extends CrudDao<UserModel>, ReadByEmailDao{
}
