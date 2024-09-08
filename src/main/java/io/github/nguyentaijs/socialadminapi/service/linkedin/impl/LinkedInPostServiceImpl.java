package io.github.nguyentaijs.socialadminapi.service.linkedin.impl;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;
import io.github.nguyentaijs.socialadminapi.repository.linkedin.LinkedInPostRepository;
import io.github.nguyentaijs.socialadminapi.service.linkedin.LinkedInPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

@Service
@RequiredArgsConstructor
public class LinkedInPostServiceImpl implements LinkedInPostService {

    private final LinkedInPostRepository repository;

    @Override
    public Page<LinkedInPostHistory> getAllPosts(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findAllByOrderByActionTimeDesc(pageRequest);
    }

    @Override
    public long countTodayPosts() {
        Instant startOfDay = LocalDate.now().atStartOfDay(ZoneOffset.UTC).toInstant();
        Instant endOfDay = startOfDay.plus(1, ChronoUnit.DAYS);

        return repository.countPostsByActionTimeBetween(startOfDay, endOfDay);
    }

    @Override
    public long countTodayLikes() {
        Instant startOfDay = LocalDate.now().atStartOfDay(ZoneOffset.UTC).toInstant();
        Instant endOfDay = startOfDay.plus(1, ChronoUnit.DAYS);

        return repository.countLikedPostsByActionTimeBetween(startOfDay, endOfDay);
    }

    @Override
    public long countTodayConnects() {
        Instant startOfDay = LocalDate.now().atStartOfDay(ZoneOffset.UTC).toInstant();
        Instant endOfDay = startOfDay.plus(1, ChronoUnit.DAYS);

        return repository.countConnectedPostsByActionTimeBetween(startOfDay, endOfDay);
    }

    @Override
    public long countTodayComments() {
        Instant startOfDay = LocalDate.now().atStartOfDay(ZoneOffset.UTC).toInstant();
        Instant endOfDay = startOfDay.plus(1, ChronoUnit.DAYS);

        return repository.countCommentedPostsByActionTimeBetween(startOfDay, endOfDay);
    }
}
