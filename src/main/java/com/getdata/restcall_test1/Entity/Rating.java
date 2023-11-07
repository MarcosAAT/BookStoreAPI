package com.getdata.restcall_test1.Entity;
import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "rating")
    private int rating;

    @Column(name = "UserID")
    private String userId;

    @Column(name = "datestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datestamp;

    // Constructors, getters, and setters can be added as needed

    // Constructor
    public Rating() {
    }

    public Rating(String ISBN, int rating, String userId, Date datestamp) {
        this.ISBN = ISBN;
        this.rating = rating;
        this.userId = String.valueOf(userId);
        this.datestamp = datestamp;
    }

    // Getters and Setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = String.valueOf(userId);
    }

    public Date getDatestamp() {
        return datestamp;
    }

    public void setDatestamp(Date datestamp) {
        this.datestamp = datestamp;
    }
}