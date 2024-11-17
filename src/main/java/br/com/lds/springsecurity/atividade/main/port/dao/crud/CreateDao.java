package br.com.lds.springsecurity.atividade.main.port.dao.crud;

public interface CreateDao<T> {
    int add(final T entity);

}
