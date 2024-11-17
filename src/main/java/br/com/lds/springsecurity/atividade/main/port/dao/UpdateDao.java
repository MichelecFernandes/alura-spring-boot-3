package br.com.lds.springsecurity.atividade.main.port.dao;

public interface UpdateDao<T> {
    void updateInformation(final int id, final T entity);
}
