package com.moviereviews.movies.dao;

import com.moviereviews.movies.entities.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository <Review, ObjectId> {
}
