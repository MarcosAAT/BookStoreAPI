package com.getdata.restcall_test1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users")
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @Getter
    @Setter
    @Id
    @Column(name = "UserID")
    private String UserID;

    @Getter
    @Setter
    @Column(name = "Username", unique = true)
    private String username;

    @Getter
    @Setter
    @Column(name = "PW")
    private String PW;

    @Getter
    @Setter
    @Column(name = "FullName")
    private String FullName;

    @Getter
    @Setter
    @Column(name = "EmailAddress")
    private String EmailAddress;

    @Getter
    @Setter
    @Column(name = "HomeAddress")
    private String HomeAddress;
}
