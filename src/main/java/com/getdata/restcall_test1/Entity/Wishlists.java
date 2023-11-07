package com.getdata.restcall_test1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
// import java.util.List;

@Entity
@Table(name = "wishlists")
public class Wishlists {

    public Wishlists(String wishlistName){
        this.wishlistName=wishlistName;
        //see if user is necessary here
    }

    public Wishlists(){
        wishlistName="My Wishlist";
    }

    @Getter
    @Setter
    @Id
    @Column(name = "WishID")
    private String WishID;

    @Getter
    @Setter
    @Column(name = "wishlist_name")
    private String wishlistName;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    // @OneToMany(mappedBy = "wishlists", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // private List<WishlistItem> items;

    // Constructors, getters, setters, and other methods
}
