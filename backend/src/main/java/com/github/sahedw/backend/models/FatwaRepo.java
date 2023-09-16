package com.github.sahedw.backend.models;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FatwaRepo extends MongoRepository<Fatwa, String> {
}
