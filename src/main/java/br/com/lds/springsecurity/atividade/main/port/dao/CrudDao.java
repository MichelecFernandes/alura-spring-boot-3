package br.com.lds.springsecurity.atividade.main.port.dao;

public interface CrudDao<T> extends CreateDao<T>, ReadDao<T>, DeleteDao, UpdateDao<T>{
}
