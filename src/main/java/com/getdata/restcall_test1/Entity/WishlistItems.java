package com.getdata.restcall_test1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "wishlistItems")
public class WishlistItems {

    public WishlistItems(Books ISBN, String wishID){
        this.ISBN=ISBN;
        this.wishID=wishID;
        //see if user is necessary here
    }

    public WishlistItems(){
        ISBN=null;
        wishID=null;
    }

    @Getter
    @Setter
    @ManyToMany
    @JoinColumn(name = "wishID")
    private String wishID;

    @Getter
    @Setter
    @Id
    @Column(name = "wishlistItemID")
    private String wishlistItemID;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "ISBN")
    private Books ISBN;

    // @OneToMany(mappedBy = "wishlists", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // private List<WishlistItem> items;

    // Constructors, getters, setters, and other methods
}
