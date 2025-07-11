package com.tariq.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "USER_DETAILS")
@Entity
public class UserDetails {
    private String id;
    private String user;
    private String password;
    private String email;
    private String phoneNumber;
}
