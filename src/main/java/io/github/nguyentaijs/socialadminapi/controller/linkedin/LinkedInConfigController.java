package io.github.nguyentaijs.socialadminapi.controller.linkedin;

import io.github.nguyentaijs.socialadminapi.dto.common.AutomationConfigsDTO;
import io.github.nguyentaijs.socialadminapi.service.common.ConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/linkedin/configs")
@RequiredArgsConstructor
public class LinkedInConfigController {

    private final ConfigService service;

    @GetMapping
    public AutomationConfigsDTO getAllConfigs() {
        return new AutomationConfigsDTO(service.getLinkedInConfigs());
    }

    @PutMapping
    public AutomationConfigsDTO updateConfigs(@RequestBody AutomationConfigsDTO configs) {
        return new AutomationConfigsDTO(service.updateLinkedinConfigs(configs));
    }
}
