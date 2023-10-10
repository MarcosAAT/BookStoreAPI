package com.getdata.restcall_test1.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Books {

    public Books(String bookName, String genre) {
        this.bookName = bookName;
        this.genre = genre;
    }

    public Books() {}

    @Id
    @Column(name = "BookName")
    private String bookName;

    @Column(name = "Genre")
    private String genre;

    @Column(name = "CopiesSold")
    private int copiesSold;

    @Column(name = "ISBN")
    private String ISBN;

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
















































