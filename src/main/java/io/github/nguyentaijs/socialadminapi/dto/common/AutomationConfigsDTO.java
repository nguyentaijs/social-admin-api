package io.github.nguyentaijs.socialadminapi.dto.common;

import io.github.nguyentaijs.socialadminapi.entity.AutomationConfigs;
import io.github.nguyentaijs.socialadminapi.enums.EnumSite;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutomationConfigsDTO {
    private ObjectId id;
    private EnumSite site;
    private int maxLikesPerTurn;
    private int maxConnectsPerTurn;
    private int maxCommentsPerTurn;
    private int likeChance;
    private int connectChance;
    private int commentChance;
    private LocalDateTime lastUpdateDate;

    public AutomationConfigsDTO(AutomationConfigs source) {
        if (Objects.nonNull(source)) {
            this.id = source.getId();
            this.site = source.getSite();
            this.maxLikesPerTurn = source.getMaxLikesPerTurn();
            this.maxCommentsPerTurn = source.getMaxCommentsPerTurn();
            this.maxConnectsPerTurn = source.getMaxConnectsPerTurn();
            this.likeChance = source.getLikeChance();
            this.commentChance = source.getCommentChance();
            this.connectChance = source.getConnectChance();
            this.lastUpdateDate = source.getLastUpdateDate();
        }
    }
}
