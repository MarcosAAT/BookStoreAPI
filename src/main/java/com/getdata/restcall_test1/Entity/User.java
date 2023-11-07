package com.getdata.restcall_test1.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    private String userID;

    @Column(name = "Username", unique = true)
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "EmailAddress")
    private String emailAddress;

    @Column(name = "HomeAddress")
    private String homeAddress;
}
