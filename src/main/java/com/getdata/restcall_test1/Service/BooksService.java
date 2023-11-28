package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Repository.BookRepo;
import com.getdata.restcall_test1.Entity.Books;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    private BookRepo bookRepo;

    public List<Books> getBooksByGenre(String genre) {
        return bookRepo.findByGenre(genre);
    }

    public List<Books> getBestSellingBooks() {
        return bookRepo.findByCopiesSoldGreaterThanEqual(10000);
    }

    public List<Books> getBooksByRating(int rating) {
        return bookRepo.findBooksByRating(rating);
    }


    public void createBook(Books book) {

        bookRepo.save(book);
    }

    public void updateBook(Books book) {
        bookRepo.save(book);
    }
    public Books getBookByISBN(String isbn) {
        Optional<Books> bookOptional = bookRepo.findById(isbn);
        return bookOptional.orElse(null);
    }


    @Transactional
    public void updateBookPrices(String publisher, double discountPercent) {
        List<Books> books = bookRepo.findByPublisher(publisher);
        for (Books book : books) {
            double newPrice = book.getPrice() * (1 - discountPercent / 100);
            book.setPrice(newPrice);
            bookRepo.save(book);
        }
    }


}