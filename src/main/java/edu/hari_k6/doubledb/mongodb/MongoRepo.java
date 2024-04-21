package edu.hari_k6.doubledb.mongodb;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mongo")
public interface MongoRepo extends MongoRepository<MongoModel,String> {
}
