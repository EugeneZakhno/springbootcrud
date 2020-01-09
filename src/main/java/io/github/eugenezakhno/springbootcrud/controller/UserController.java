package io.github.eugenezakhno.springbootcrud.controller;

import io.github.eugenezakhno.springbootcrud.model.User;
import io.github.eugenezakhno.springbootcrud.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    @GetMapping("/users")
    public String findAll(){
        List<User> users = userService.findAll();
        return "";
    }

}