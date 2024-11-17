package br.com.lds.springsecurity.atividade.main.port.service.crud;

public interface CrudService<T> extends
        CreateService<T>,
        ReadService<T>,
        DeleteService{

}
