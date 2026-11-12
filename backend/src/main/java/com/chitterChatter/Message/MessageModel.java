package com.chitterChatter.Message;

import java.time.LocalDateTime;

import com.chitterChatter.User.UserModel;
import com.chitterChatter.chat.ChatModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@AllArgsConstructor 
@NoArgsConstructor 
@Data
@Builder
@Table(name = "messages")
public class MessageModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int messageID;

    
    @ManyToOne 
    @JoinColumn(name="sender_Id",referencedColumnName="userId")
    private UserModel sender;

    
    private String content;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "chat_id", referencedColumnName = "chatId")
    private ChatModel chat;
}
