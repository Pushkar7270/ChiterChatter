package com.chitterChatter.User;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/app/user")
@RequiredArgsConstructor 
public class UserController {

    private final UserService userService;


    @PostMapping("/register") 
    public UserModel registerUser(@Valid  @RequestBody UserModel user){
        return userService.registerUser(user);
    }

    @GetMapping("/email/{email}")
    public UserModel getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }

    @GetMapping("/phoneNumber/{phoneNumber}")
    public UserModel getUserByNumber(@PathVariable String number){
        return userService.getUserByNumber(number);
    }

    @GetMapping("/status/{status}")
    public List<UserModel> getUserByStatus(@PathVariable Status status) {
        return userService.getUserByStatus(status);
    }

    @GetMapping("/teamName/{teamName}")
    public List<UserModel> getUserByTeamName(@PathVariable String teamName) {
        return userService.getUserByTeamName(teamName);
    }
    
    
}
