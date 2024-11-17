package br.com.lds.springsecurity.atividade.main.port.crud;

import java.util.List;

public interface ReadService<T> {
    T findById(final int id);
    List<T> findAll();
}