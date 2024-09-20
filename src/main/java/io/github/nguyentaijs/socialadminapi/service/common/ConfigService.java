package io.github.nguyentaijs.socialadminapi.service.common;

import io.github.nguyentaijs.socialadminapi.dto.common.AutomationConfigsDTO;
import io.github.nguyentaijs.socialadminapi.entity.AutomationConfigs;

public interface ConfigService {
    AutomationConfigs getLinkedInConfigs();

    AutomationConfigs updateLinkedinConfigs(AutomationConfigsDTO configs);
}
