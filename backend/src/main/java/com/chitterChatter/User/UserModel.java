package com.chitterChatter.User;



import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message= "Name cannot be empty")
    private String name;
    @Email(message = "Invalid email")
    @NotBlank
    private String email;
    @Pattern(regexp = "^\\+[1-9]\\d{1,14}$", message = "Phone must include country code")
    private String phoneNumber;
    @NotBlank(message = "Designation is compulsary")
    private String designation;
    @NotBlank(message="Please add a teamName")
    private String teamName;
    @Enumerated(EnumType.STRING)
    private Status status;

}
