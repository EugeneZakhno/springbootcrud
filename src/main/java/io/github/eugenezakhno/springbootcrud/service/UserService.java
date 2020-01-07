package io.github.eugenezakhno.springbootcrud.service;

import io.github.eugenezakhno.springbootcrud.model.User;
import io.github.eugenezakhno.springbootcrud.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public User findById(Long id){
        return userRepository.getOne(id);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}
