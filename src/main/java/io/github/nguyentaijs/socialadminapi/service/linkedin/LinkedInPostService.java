package io.github.nguyentaijs.socialadminapi.service.linkedin;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;

import java.util.List;

public interface LinkedInPostService {
    List<LinkedInPostHistory> getAllPosts();
}
