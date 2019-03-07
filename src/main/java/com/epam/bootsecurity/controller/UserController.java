package com.epam.bootsecurity.controller;

import com.epam.bootsecurity.entity.Tour;
import com.epam.bootsecurity.entity.User;
import com.epam.bootsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;




    @RequestMapping("/all")
    public String findAll(ModelMap modelMap){
        List<User> users = userService.findAllUsers();
        modelMap.addAttribute("usersFromServer",users);
        System.out.println(users);
        return "users";
    }

//    @RequestMapping("/{login}")
//    public ResponseEntity<User> findUser(@PathVariable String login){
//        return new ResponseEntity<>(userService.findUserByLogin(login).get(), HttpStatus.ACCEPTED);
//    }

    @RequestMapping("/{login}/tours")
    public ResponseEntity<List<Tour>> findUserTours(@PathVariable String login){

        User user = userService.findUserByLogin(login).get();

        return new ResponseEntity<>(user.getTours(), HttpStatus.ACCEPTED);
    }

    @RequestMapping("/update/{oldLogin}/{newLogin}")
    public ResponseEntity<List<User>> updateUser(@PathVariable String oldLogin,
                                                 @PathVariable String newLogin){
        userService.updateUserLogin(oldLogin, newLogin);

        return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.ACCEPTED);
    }

    @RequestMapping("/delete/{login}")
    public ResponseEntity<List<User>> deleteUser(@PathVariable String login){
        userService.deleteUser(login);

        return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.ACCEPTED);
    }


}
