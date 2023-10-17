package com.getdata.restcall_test1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
// import java.util.List;

@Entity
@Table(name = "wishlistItems")
public class WishlistItems {

    public WishlistItems(Books ISBN){
        this.ISBN=ISBN;
        //see if user is necessary here
    }

    public WishlistItems(){
        ISBN=null;
    }

    @Getter
    @Setter
    @Id
    @Column(name = "WishID")
    private String WishID;

    @Getter
    @Setter
    @Column(name = "wishlistItemID")
    private String wishlistName;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "ISBN")
    private Books ISBN;

    // @OneToMany(mappedBy = "wishlists", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // private List<WishlistItem> items;

    // Constructors, getters, setters, and other methods
}
