package com.robbin.moviedataservices.resources;

import com.robbin.moviedataservices.model.Rating;
import com.robbin.moviedataservices.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdata")
public class RatingResources {
    UserRating userRating;

    public RatingResources(UserRating userRating) {
        this.userRating = userRating;
    }

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
return new Rating(movieId,7.3);
}
@RequestMapping("user/{userId}")
        public UserRating getRatings(@PathVariable("userId") String userId){
    List<Rating> ratings= Arrays.asList(
            new Rating("seven",7.2),
            new Rating("wolf of wall street",8.3),
            new Rating("Sasank Redempson",9.1),
            new Rating("Batman",7.4)
    );
    userRating.setUserRating(ratings);
    return userRating;
    }

}
