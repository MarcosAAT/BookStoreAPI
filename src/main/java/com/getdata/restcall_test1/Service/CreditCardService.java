package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Entity.CreditCard;
import com.getdata.restcall_test1.Entity.User;
import com.getdata.restcall_test1.Repository.CreditCardRepo;
import com.getdata.restcall_test1.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {

    @Autowired
    private CreditCardRepo cardRepo;


    public CreditCard postCard(CreditCard card){
        cardRepo.save(card);
        return card;
    }
}
