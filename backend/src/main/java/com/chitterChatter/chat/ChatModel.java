package com.chitterChatter.chat;

import java.util.Set;

import com.chitterChatter.User.UserModel;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

enum ChatType{
    DM,GROUPCHAT
}

@Entity 
@Table(name="chats")
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
@Builder 
public class ChatModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int chatId;

    @Enumerated(EnumType.STRING)
    private ChatType chatType;

    private String name;
    private String icon;

    @ManyToMany
    @JoinTable(
        name = "chatMembers",
        joinColumns = @JoinColumn(name = "chatId"),
        inverseJoinColumns = @JoinColumn(name = "userID")
    )

    private Set<UserModel> members;
}
