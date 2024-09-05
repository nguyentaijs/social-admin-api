package io.github.nguyentaijs.socialadminapi.controller.linkedin;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;
import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInUser;
import io.github.nguyentaijs.socialadminapi.service.linkedin.LinkedInPostService;
import io.github.nguyentaijs.socialadminapi.service.linkedin.LinkedInUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/linkedin/posts")
@RequiredArgsConstructor
public class LinkedInPostController {

    private final LinkedInPostService service;

    @GetMapping
    public List<LinkedInPostHistory> getAllPosts() {
        return service.getAllPosts();
    }
}
