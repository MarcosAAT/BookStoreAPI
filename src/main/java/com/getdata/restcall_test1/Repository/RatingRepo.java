package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating, Long> {  // Assuming the primary key type is Long (if you had one)

    // This finds ratings by their value.
    List<Rating> findByRating(Integer ratingValue);

    // If you ever want to perform a join operation between Ratings and Books on ISBN,
    // you might use a custom query (not strictly required at this point).
    @Query("SELECT b from Books b JOIN Rating r ON b.ISBN = r.ISBN WHERE r.rating >= :ratingValue")
    List<Books> findBooksByRatingOrHigher(@Param("ratingValue") Integer ratingValue);

}
