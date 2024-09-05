package io.github.nguyentaijs.socialadminapi.entity.linkedin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Document(collection = "linkedin-user")
public class LinkedInUser {
    @Id
    private ObjectId id;
    private String profileUrl;
    private String name;
    private String role;
    private LocalDateTime lastCommentTime;
    private Integer commentCount;
}
