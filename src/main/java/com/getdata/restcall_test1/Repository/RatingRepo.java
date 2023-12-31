package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RatingRepo extends JpaRepository<Rating, Long> {


    List<Rating> findByRating(Integer ratingValue);
   // List<Rating> findByBookISBN(String ISBN);

    @Query("SELECT b from Books b JOIN Rating r ON b.ISBN = r.ISBN WHERE r.rating >= :ratingValue")
    List<Books> findBooksByRatingOrHigher(@Param("ratingValue") Integer ratingValue);
    Optional<Rating> findByUserIdAndISBN(String userId, String ISBN);

}
