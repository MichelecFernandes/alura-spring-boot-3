package br.com.lds.springsecurity.atividade.main.domain;

import lombok.Data;

@Data
public class UserModel {
    private int id;
    private String email;
    private String password;
    private String fullName;

}
