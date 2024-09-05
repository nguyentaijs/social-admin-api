package io.github.nguyentaijs.socialadminapi.service.linkedin.impl;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;
import io.github.nguyentaijs.socialadminapi.repository.linkedin.LinkedInPostRepository;
import io.github.nguyentaijs.socialadminapi.service.linkedin.LinkedInPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LinkedInPostServiceImpl implements LinkedInPostService {

    private final LinkedInPostRepository repository;

    @Override
    public List<LinkedInPostHistory> getAllPosts() {
        return repository.findAllByOrderByActionTimeDesc();
    }
}
