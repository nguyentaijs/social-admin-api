package io.github.nguyentaijs.socialadminapi.repository.linkedin;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LinkedInUserRepository extends MongoRepository<LinkedInUser, ObjectId> {
    List<LinkedInUser> findAll();
}
