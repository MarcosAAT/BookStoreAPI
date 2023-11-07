package com.getdata.restcall_test1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CartItem")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "cartId")
    @Getter
    @Setter
    private ShoppingCart cart;

    @ManyToOne
    @JoinColumn(name = "ISBN")
    @Getter
    @Setter
    private Books book;

    @Getter
    @Setter
    private int quantity;

}

