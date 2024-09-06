package io.github.nguyentaijs.socialadminapi.repository.linkedin;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinkedInPostRepository extends MongoRepository<LinkedInPostHistory, ObjectId> {
    Page<LinkedInPostHistory> findAllByOrderByActionTimeDesc(PageRequest pageRequest);
}
