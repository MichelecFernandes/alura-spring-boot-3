package br.com.lds.springsecurity.atividade.main.port.service.crud;


public interface CreateService<T> {
   int create(final T entity);

}
