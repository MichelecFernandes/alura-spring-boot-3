package br.com.lds.springsecurity.atividade.main.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/user")
public class UserRestController {
    @GetMapping("listar")
    public String get(){
        return "Teste do get";
    }
    @PostMapping("criar")
    public String post(){
        return "Teste do post";
    }
    @PutMapping("atualizar")
    public String put(){
        return "Teste do put";
    }
    @DeleteMapping("deletar")
    public String delete(){
        return "Teste do delete";
    }
}
