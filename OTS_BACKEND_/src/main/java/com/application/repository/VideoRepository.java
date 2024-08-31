package com.application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.application.model.Video;

@Repository
public interface VideoRepository extends MongoRepository<Video, String> {
}

