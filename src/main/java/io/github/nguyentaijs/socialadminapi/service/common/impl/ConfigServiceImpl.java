package io.github.nguyentaijs.socialadminapi.service.common.impl;

import io.github.nguyentaijs.socialadminapi.dto.common.AutomationConfigsDTO;
import io.github.nguyentaijs.socialadminapi.entity.AutomationConfigs;
import io.github.nguyentaijs.socialadminapi.enums.EnumSite;
import io.github.nguyentaijs.socialadminapi.repository.common.ConfigRepository;
import io.github.nguyentaijs.socialadminapi.service.common.ConfigService;
import io.github.nguyentaijs.socialadminapi.utils.JacksonMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConfigServiceImpl implements ConfigService {

    private final ConfigRepository repository;

    @Override
    public AutomationConfigs getLinkedInConfigs() {
        return repository.findBySite(EnumSite.LINKEDIN)
                .stream().findFirst().orElseThrow(() -> new RuntimeException("Can not find Linkedin config"));
    }

    @Override
    public AutomationConfigs updateLinkedinConfigs(AutomationConfigsDTO configs) {
        AutomationConfigs dbConfigs = getLinkedInConfigs();
        dbConfigs.setMaxConnectsPerTurn(configs.getMaxConnectsPerTurn());
        dbConfigs.setConnectChance(configs.getConnectChance());

        dbConfigs.setMaxCommentsPerTurn(configs.getMaxCommentsPerTurn());
        dbConfigs.setCommentChance(configs.getCommentChance());

        dbConfigs.setMaxLikesPerTurn(configs.getMaxLikesPerTurn());
        dbConfigs.setLikeChance(configs.getLikeChance());

        dbConfigs.setLastUpdateDate(LocalDateTime.now());
        AutomationConfigs latestConfigs = repository.save(dbConfigs);
        log.info("Configuration updated {}", JacksonMapper.toJson(latestConfigs));
        return latestConfigs;
    }
}
