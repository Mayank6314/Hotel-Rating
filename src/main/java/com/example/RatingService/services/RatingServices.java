package com.example.RatingService.services;

import com.example.RatingService.entities.Rating;
import com.example.RatingService.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServices {

    @Autowired
    RatingRepository ratingRepository;

    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);

    }

    public Rating getRatingByHotelId(Long hotelid) {
        return ratingRepository.findByHotelId(hotelid);
    }
}
