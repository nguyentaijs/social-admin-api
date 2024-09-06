package io.github.nguyentaijs.socialadminapi.service.linkedin.impl;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;
import io.github.nguyentaijs.socialadminapi.repository.linkedin.LinkedInPostRepository;
import io.github.nguyentaijs.socialadminapi.service.linkedin.LinkedInPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkedInPostServiceImpl implements LinkedInPostService {

    private final LinkedInPostRepository repository;

    @Override
    public Page<LinkedInPostHistory> getAllPosts(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findAllByOrderByActionTimeDesc(pageRequest);
    }
}
