package br.com.lds.springsecurity.atividade.main.controller;

import br.com.lds.springsecurity.atividade.main.domain.UserModel;
import br.com.lds.springsecurity.atividade.main.port.service.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    private final UserService userService;
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<UserModel>> getEntities(){
        List<UserModel> users = userService.findAll();
        return ResponseEntity.ok().body(users);
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
