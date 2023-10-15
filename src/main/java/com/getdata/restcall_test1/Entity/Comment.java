package com.getdata.restcall_test1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.util.Date;

@Getter
@Setter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userComment;
    private Date datestamp;

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;
}