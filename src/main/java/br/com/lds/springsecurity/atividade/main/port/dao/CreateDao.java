package br.com.lds.springsecurity.atividade.main.port.dao;

public interface CreateDao<T> {
    int add(final T entity);
}
