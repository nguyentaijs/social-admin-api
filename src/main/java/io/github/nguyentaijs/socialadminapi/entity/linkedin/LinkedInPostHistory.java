package io.github.nguyentaijs.socialadminapi.entity.linkedin;

import io.github.nguyentaijs.socialadminapi.enums.EnumActionResult;
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
@NoArgsConstructor
@Builder
@Document(collection = "linkedin-post")
public class LinkedInPostHistory {
    @Id
    private ObjectId id;
    private String postUrl;
    private LinkedInUser postAuthor;
    private String postContent;

    private boolean liked;
    private boolean connected;
    private boolean commented;
    private String comment;

    private EnumActionResult result;
    private String additionalData;
    private LocalDateTime actionTime;
}
