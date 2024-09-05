package io.github.nguyentaijs.socialadminapi.enums;

import lombok.Getter;

@Getter
public enum EnumLinkedInStyle {
    LINKEDIN_SUPPORT("Response to this linkedin post using author's language to support the author, stay neutral, less than %d words: %s"),
    LINKEDIN_ANOTHER_VIEW("Response to this linkedin post using author's language to give the author another view of the post, less than %d words: %s"),
    LINKEDIN_GOOD_POINT("Response to this linkedin post using author's language to pick one good point and comment about this, less than %d words: %s");

    private final String prompt;

    EnumLinkedInStyle(String prompt) {
        this.prompt = prompt;
    }
}
