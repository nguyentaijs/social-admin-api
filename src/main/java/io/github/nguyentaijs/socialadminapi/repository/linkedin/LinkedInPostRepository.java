package io.github.nguyentaijs.socialadminapi.repository.linkedin;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.Instant;

public interface LinkedInPostRepository extends MongoRepository<LinkedInPostHistory, ObjectId> {
    Page<LinkedInPostHistory> findAllByOrderByActionTimeDesc(PageRequest pageRequest);

    @Query(value = "{ 'liked': true, 'actionTime': { $gte: ?0, $lt: ?1 } }", count = true)
    long countLikedPostsByActionTimeBetween(Instant startOfDay, Instant endOfDay);

    @Query(value = "{ 'connected': true, 'actionTime': { $gte: ?0, $lt: ?1 } }", count = true)
    long countConnectedPostsByActionTimeBetween(Instant startOfDay, Instant endOfDay);

    @Query(value = "{ 'commented': true, 'actionTime': { $gte: ?0, $lt: ?1 } }", count = true)
    long countCommentedPostsByActionTimeBetween(Instant startOfDay, Instant endOfDay);

    @Query(value = "{'actionTime': { $gte: ?0, $lt: ?1 } }", count = true)
    long countPostsByActionTimeBetween(Instant startOfDay, Instant endOfDay);
}
