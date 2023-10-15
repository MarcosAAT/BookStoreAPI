package com.getdata.restcall_test1.Service;


import com.getdata.restcall_test1.Repository.RatingRepo;
import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepo ratingRepo;

    public List<Rating> getRatingsByValue(Integer ratingValue) {
        return ratingRepo.findByRating(ratingValue);
    }

    public List<Books> getBooksByRatingOrHigher(Integer ratingValue) {
        return ratingRepo.findBooksByRatingOrHigher(ratingValue);
    }
}


