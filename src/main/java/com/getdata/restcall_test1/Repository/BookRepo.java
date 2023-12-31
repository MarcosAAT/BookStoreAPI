package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface BookRepo extends JpaRepository<Books, String>{
    List<Books> findByGenre(String genre);

    List<Books> findByCopiesSoldGreaterThanEqual(int copiesSold);

    @Query("SELECT b FROM Books b JOIN Rating r ON b.ISBN = r.ISBN WHERE r.rating = :rating")
    List<Books> findBooksByRating(@Param("rating") int rating);

   // Optional<Books> findById(Long id);

    List<Books> findByPublisher(String publisher);

    // Find a book by ISBN
    Optional<Books> findById(String isbn);

}
