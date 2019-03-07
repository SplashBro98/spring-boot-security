package com.epam.bootsecurity.service;

import com.epam.bootsecurity.entity.Role;
import com.epam.bootsecurity.entity.State;
import com.epam.bootsecurity.form.UserForm;
import com.epam.bootsecurity.repository.UserRepository;
import com.epam.bootsecurity.specification.user.UserFindAllSpecification;
import com.epam.bootsecurity.specification.user.UserFindByLoginSpecification;
import com.epam.bootsecurity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public void signUp(UserForm userForm){
        String hashPassword = passwordEncoder.encode(userForm.getPassword());

        User user = User.builder()
                .login(userForm.getLogin())
                .password(hashPassword)
                .role(Role.USER)
                .state(State.ACTIVE)
                .build();
        userRepository.save(user);

    }

    public List<User> findAllUsers(){

        return userRepository.findAll();
    }

    public Optional<User> findUserByLogin(String login){

        return Optional.ofNullable(userRepository.findByLogin(login));
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public void updateUserLogin(String oldLogin, String newLogin){
        User user = userRepository.findByLogin(oldLogin);
        user.setLogin(newLogin);
        userRepository.save(user);
    }

    public void deleteUser(String login){
        userRepository.deleteByLogin(login);
    }

}
