package com.robbin.moviedataservices.model;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserRating {
    private List<Rating> userRating;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public UserRating setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
        return this;
    }
}
