package com.chitterChatter.User;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//SQL table

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

    @Column(nullable=false,length = 50)
    private String userName;

    @Column(nullable=false,length= 400)
    private String email;

    @Column(length=500)
    private String avatar;

    @Column(length=500)
    private String password;

    @Column
    private Status status;

    @Column(name = "phone_number", unique = true, length = 20)
    @Pattern(regexp = "^\\+[1-9]\\d{1,14}$", message = "Phone number must be in valid E.164 format (e.g., +15551234567)")
    private String phoneNumber;



    public void setStatus(Status status){
        this.status = status;
    }
}
