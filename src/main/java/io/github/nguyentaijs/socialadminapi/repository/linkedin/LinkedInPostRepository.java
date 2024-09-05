package io.github.nguyentaijs.socialadminapi.repository.linkedin;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LinkedInPostRepository extends MongoRepository<LinkedInPostHistory, ObjectId> {
    List<LinkedInPostHistory> findAllByOrderByActionTimeDesc();
}
