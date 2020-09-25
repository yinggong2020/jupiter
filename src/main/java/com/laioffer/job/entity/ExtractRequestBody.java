package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExtractRequestBody {
    public List<String> data;

    @JsonProperty("max_keywords")
    public int maxKeywords;
    // when post represent the body in postman
    public ExtractRequestBody(List<String> data, int maxKeywords) {
        this.data = data;
        this.maxKeywords = maxKeywords;
    }
}
