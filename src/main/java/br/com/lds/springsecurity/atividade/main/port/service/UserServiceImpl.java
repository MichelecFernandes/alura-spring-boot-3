package br.com.lds.springsecurity.atividade.main.port.service;

import br.com.lds.springsecurity.atividade.main.domain.UserModel;
import br.com.lds.springsecurity.atividade.main.port.crud.CrudService;

import java.util.List;

public class UserServiceImpl implements CrudService<UserModel> {
    @Override
    public int create(UserModel entity) {
        return 0;
    }
    @Override
    public void delete(int id){
    }
    @Override
    public UserModel findById(int id) {
        return null;
    }
    @Override
    public List<UserModel> findAll() {
        return null;
    }


    @Override
    public void update(int id, UserModel entity) {

    }
}