package com.getdata.restcall_test1.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "books")
public class Books {

    public Books(String bookName, String genre) {
        this.bookName = bookName;
        this.genre = genre;
    }

    public Books() {}

    @Getter
    @Column(name = "BookName")
    private String bookName;

    @Getter
    @Column(name = "BookDesc")
    private String bookDesc;

    @Getter
    @Column(name = "Price")
    private double price;

    @Getter
    @Column(name = "Genre")
    private String genre;

    @Getter
    @Column(name = "Publisher")
    private String publisher;

    @Getter
    @Column(name = "CopiesSold")
    private int copiesSold;

    @Getter
    @Column(name = "YearPublished")
    private int yearPublished;

    @Getter
    @Id
    @Column(name = "ISBN")
    private String ISBN;

    @Getter
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AuthorID")
    private Author author;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
















































