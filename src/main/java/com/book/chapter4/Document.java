package com.book.chapter4;

import java.util.Map;

// tag::document[]
public class Document {
    private final Map<String,String> attributes;

    public Document(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getAttribute(final String attributeName){
        return attributes.get(attributeName);
    }
}
// end::document[]