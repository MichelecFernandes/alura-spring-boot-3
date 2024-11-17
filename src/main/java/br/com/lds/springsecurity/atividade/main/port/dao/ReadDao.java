package br.com.lds.springsecurity.atividade.main.port.dao;

import java.util.List;

public interface ReadDao<T> {
    T readyById(final int id);
    List<T> readAll();
}
