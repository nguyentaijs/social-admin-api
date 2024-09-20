package io.github.nguyentaijs.socialadminapi.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JacksonMapper {
    private static final ObjectMapper mapper = new ObjectMapper();

    private JacksonMapper() {}

    public static ObjectMapper getInstance() {
        return mapper;
    }
    public static String toJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("Use default obj.toString(), error={}", e.getMessage());
            return obj.toString();
        }
    }
}
