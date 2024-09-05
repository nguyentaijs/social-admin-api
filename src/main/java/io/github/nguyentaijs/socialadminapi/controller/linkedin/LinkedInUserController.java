package io.github.nguyentaijs.socialadminapi.controller.linkedin;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInUser;
import io.github.nguyentaijs.socialadminapi.service.linkedin.LinkedInUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/linkedin/users")
@RequiredArgsConstructor
public class LinkedInUserController {

    private final LinkedInUserService service;

    @GetMapping
    public List<LinkedInUser> getAllUsers() {
        return service.getAllUsers();
    }
}
