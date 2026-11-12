package com.chitterChatter.chat;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitterChatter.Message.MessageModel;




public interface ChatRepository extends JpaRepository<MessageModel,Integer>{
    List<ChatModel> findByMembers(String member);
    List<ChatModel> findByNameContainingIgnoreCase(String name);
}