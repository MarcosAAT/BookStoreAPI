package com.getdata.restcall_test1.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "books")
public class Books {

    public Books(String bookName, String genre) {
        this.bookName = bookName;
        this.genre = genre;
    }

    public Books() {}

    @Getter
    @Setter
    @Column(name = "BookName")
    private String bookName;

    @Getter
    @Setter
    @Column(name = "BookDesc")
    private String bookDesc;

    @Getter
    @Setter
    @Column(name = "Price")
    private double price;

    @Getter
    @Setter
    @Column(name = "Genre")
    private String genre;

    @Getter
    @Setter
    @Column(name = "Publisher")
    private String publisher;

    @Getter
    @Setter
    @Column(name = "CopiesSold")
    private int copiesSold;

    @Getter
    @Setter
    @Column(name = "YearPublished")
    private int yearPublished;

    @Getter
    @Setter
    @Id
    @Column(name = "ISBN")
    private String ISBN;

    @Getter
    @Setter
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "AuthorID")
    private Author author;

}