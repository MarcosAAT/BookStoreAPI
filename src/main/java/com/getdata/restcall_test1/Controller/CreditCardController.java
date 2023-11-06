package com.getdata.restcall_test1.Controller;

import com.getdata.restcall_test1.Entity.CreditCard;
import com.getdata.restcall_test1.Service.CreditCardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CreditCardController {

    private CreditCardService cardService;

    public CreditCardController(CreditCardService cardService){
        this.cardService = cardService;
    }

    @PostMapping("/postCard")
    public CreditCard postCard(CreditCard card){
        cardService.postCard(card);
        return card;
    }
}
