package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Repository.AuthorRepo;
import com.getdata.restcall_test1.Entity.Author;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.getdata.restcall_test1.Entity.Books;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    public Author getAuthorsByID(String AuthorID){

        return authorRepo.findById(AuthorID).orElse(null);
    }
    public List<Books> getBooksByAuthorID(String AuthorID){
        return authorRepo.findBooksByAuthorID(AuthorID);
    }

    public void createAuthor(Author author) {
        authorRepo.save(author);
    }
}