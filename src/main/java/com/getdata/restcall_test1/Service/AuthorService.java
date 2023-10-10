package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Repository.AuthorRepo;
import com.getdata.restcall_test1.Entity.Author;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    public Author getAuthorsByID(String AuthorID){
        return authorRepo.findById(AuthorID).orElse(null);
    }
}