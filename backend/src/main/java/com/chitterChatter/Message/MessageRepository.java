package com.chitterChatter.Message;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitterChatter.User.UserModel;



public interface MessageRepository extends JpaRepository<MessageModel,Integer> {
    List<MessageModel> findBySenderAndTimeStampAsc(UserModel sender,LocalDateTime timestamp);
    List<MessageModel> findByContentOrderByTimeStampAsc(String content);

}
