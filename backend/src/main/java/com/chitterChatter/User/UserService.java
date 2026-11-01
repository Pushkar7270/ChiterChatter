package com.chitterChatter.User;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;




@Service
@RequiredArgsConstructor 
public class UserService {
    private final UserRepository userRepository;


    public UserModel registerUser(UserModel userModel){
        userModel.setStatus(Status.ONLINE);
        return userRepository.save(userModel);
    }

    public UserModel getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public UserModel getUserByNumber(String number){
        return userRepository.findByPhoneNumber(number);
    }

    public List<UserModel> getUserByTeamName(String teamName){
        return userRepository.findByTeamName(teamName);
    }

    public List<UserModel> getUserByStatus(Status status){
        return userRepository.findByStatus(status);
    }


}
