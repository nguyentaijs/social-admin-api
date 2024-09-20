package io.github.nguyentaijs.socialadminapi.repository.common;

import io.github.nguyentaijs.socialadminapi.entity.AutomationConfigs;
import io.github.nguyentaijs.socialadminapi.enums.EnumSite;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfigRepository extends MongoRepository<AutomationConfigs, ObjectId> {
    List<AutomationConfigs> findBySite(EnumSite site);
}
