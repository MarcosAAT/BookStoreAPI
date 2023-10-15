package com.getdata.restcall_test1.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "CreditCards")
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {

    @Getter
    @Setter
    @Id
    @Column(name = "CardNum")
    private String CardNum;

    @Getter
    @Setter
    @Column(name = "CVV")
    private int CVV;

    @Getter
    @Setter
    @Column(name = "ExpDate")
    private Date ExpDate;

    @Getter
    @Setter
    @Column
    private String UserID;

    @Getter
    @Setter
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "UserID", insertable = false, updatable = false)
    private User user;


}
