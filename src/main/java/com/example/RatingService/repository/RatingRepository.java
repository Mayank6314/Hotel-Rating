package com.example.RatingService.repository;

import com.example.RatingService.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    Rating findByHotelId(Long hotelid);
}
