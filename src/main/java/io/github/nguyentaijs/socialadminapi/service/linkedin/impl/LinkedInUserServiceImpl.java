package io.github.nguyentaijs.socialadminapi.service.linkedin.impl;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInUser;
import io.github.nguyentaijs.socialadminapi.repository.linkedin.LinkedInUserRepository;
import io.github.nguyentaijs.socialadminapi.service.linkedin.LinkedInUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LinkedInUserServiceImpl implements LinkedInUserService {

    private final LinkedInUserRepository repository;

    @Override
    public List<LinkedInUser> getAllUsers() {
        return repository.findAll();
    }
}
