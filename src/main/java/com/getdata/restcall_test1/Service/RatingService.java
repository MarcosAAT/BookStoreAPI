package com.getdata.restcall_test1.Service;


import com.getdata.restcall_test1.Repository.RatingRepo;
import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RatingService {

    @Autowired
    private RatingRepo ratingRepo;

    public void createOrUpdateRating(String userId, String ISBN, int ratingValue) {
        Rating rating = ratingRepo.findByUserIdAndISBN(userId, ISBN)
                .orElse(new Rating());
        rating.setRating(ratingValue);
        rating.setDatestamp(new Date());
        ratingRepo.save(rating);
    }

    public List<Rating> getRatingsByValue(Integer ratingValue) {

        return ratingRepo.findByRating(ratingValue);
    }

    public List<Books> getBooksByRatingOrHigher(Integer ratingValue) {
        return ratingRepo.findBooksByRatingOrHigher(ratingValue);
    }

//    public void createRating(Rating rating) {
//        ratingRepo.save(rating);
//    }

}