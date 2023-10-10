package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Repository.BookRepo;
import com.getdata.restcall_test1.Entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    private BookRepo bookRepo;

    public List<Books> getBooksByGenre(String genre) {  // camelCase parameter
        return bookRepo.findByGenre(genre);
    }

    public List<Books> getBestSellingBooks() {
        return bookRepo.findByCopiesSoldGreaterThanEqual(10000);
    }

    public List<Books> getBooksByRating(int rating) {
        return bookRepo.findBooksByRating(rating);
    }


}





















