package io.github.nguyentaijs.socialadminapi.service.linkedin;

import io.github.nguyentaijs.socialadminapi.entity.linkedin.LinkedInPostHistory;
import org.springframework.data.domain.Page;

public interface LinkedInPostService {
    Page<LinkedInPostHistory> getAllPosts(int page, int size);
}
