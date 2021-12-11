package com.cg.ratingdataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ratingdataservice.model.Rating;
import com.cg.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@GetMapping("/user/{userId}")
	public UserRating getRatings(@PathVariable("userId") String userId) {
		
		List<Rating> ratings = Arrays.asList(new Rating("1234", 3),
				new Rating("5678", 4));
		UserRating rating = new UserRating();
		rating.setRatings(ratings);
		return rating;
	}

}
