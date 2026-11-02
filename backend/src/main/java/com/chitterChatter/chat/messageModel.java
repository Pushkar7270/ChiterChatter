package com.chitterChatter.chat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
@build
@Table(name = "messages")
public class messageModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int messageID;

    private String 
}
