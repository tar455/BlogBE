package com.tariq.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "USER_DETAILS")
@Entity
@Data
public class UserDetails {
    private String user;
    private String password;
    private String confirmPassword;
    @Id
    private String email;
    private String phoneNumber;
}
