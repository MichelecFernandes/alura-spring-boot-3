package br.com.lds.springsecurity.atividade.main.port.crud;

public interface UpdateService<T> {
    void update(final int id, final T entity);
}