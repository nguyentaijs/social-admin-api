package io.github.nguyentaijs.socialadminapi.entity;

import io.github.nguyentaijs.socialadminapi.enums.EnumSite;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "automationConfigs")
public class AutomationConfigs {
    private ObjectId id;
    private EnumSite site;
    private int maxLikesPerTurn;
    private int maxConnectsPerTurn;
    private int maxCommentsPerTurn;
    private int likeChance;
    private int connectChance;
    private int commentChance;
    private LocalDateTime lastUpdateDate;
}
