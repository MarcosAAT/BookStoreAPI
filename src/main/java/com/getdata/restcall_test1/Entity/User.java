package com.getdata.restcall_test1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
