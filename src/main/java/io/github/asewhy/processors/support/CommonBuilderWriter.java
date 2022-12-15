package io.github.asewhy.processors.support;

import io.github.asewhy.processors.support.interfaces.StringWriter;

public class CommonBuilderWriter implements StringWriter {
    private final StringBuilder builder;

    public CommonBuilderWriter(StringBuilder stream) {
        this.builder = stream;
    }

    @Override
    public CommonBuilderWriter write(String chars) {
        builder.append(chars); return this;
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
