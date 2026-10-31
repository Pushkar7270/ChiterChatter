package com.chitterChatter.User;



import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


enum Status{
    ONLINE,OFFLINE,AWAY
}

@Entity
@NoArgsConstructor
@Getter
@Setter
public class UserModel {

    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int userID;
    private String name;
    private String email;
    private String phoneNumber;
    private String designation;
    private String teamName;
    @Enumerated(EnumType.STRING)
    private Status status;

}
