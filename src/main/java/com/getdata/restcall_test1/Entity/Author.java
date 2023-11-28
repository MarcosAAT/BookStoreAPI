package com.getdata.restcall_test1.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "authors")
public class Author {

    public Author(String AuthorID, String FirstName, String LastName){
        this.AuthorID = AuthorID;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public Author(){
    }

    @Id
    @Getter
    @Setter
    @Column(name = "AuthorID")
    private String AuthorID;

    @Getter
    @Setter
    @Column(name = "FirstName")
    private String FirstName;

    @Getter
    @Setter
    @Column(name = "LastName")
    private String LastName;

}