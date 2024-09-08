package io.github.nguyentaijs.socialadminapi.controller.linkedin;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;
import io.github.nguyentaijs.socialadminapi.service.linkedin.LinkedInPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linkedin/posts")
@RequiredArgsConstructor
public class LinkedInPostController {

    private final LinkedInPostService service;

    @GetMapping
    public Page<LinkedInPostHistory> getAllPosts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        return service.getAllPosts(page, size);
    }

    @GetMapping("/today/posts")
    public long countTodayPosts() {
        return service.countTodayPosts();
    }

    @GetMapping("/today/likes")
    public long countTodayLikes() {
        return service.countTodayLikes();
    }

    @GetMapping("/today/connects")
    public long countTodayConnects() {
        return service.countTodayConnects();
    }

    @GetMapping("/today/comments")
    public long countTodayComments() {
        return service.countTodayComments();
    }
}
