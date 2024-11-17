package br.com.lds.springsecurity.atividade.main.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class JwtTokenDto {
    private String token;
}