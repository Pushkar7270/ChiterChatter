package com.chitterChatter.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository 
public interface UserRepository extends JpaRepository<UserModel, Integer> {
    UserModel findByEmail(String email);
    UserModel findByPhoneNumber(String number);
    List<UserModel> findByTeamName(String teamName);
    List<UserModel> findByStatus(Status status);
}
