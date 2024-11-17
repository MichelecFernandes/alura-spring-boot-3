package br.com.lds.springsecurity.atividade.main.port.crud;

public interface CrudService<T> extends
    CreateService<T>,
    ReadService<T>,
    UpdateService<T>,
    DeleteService{
}
