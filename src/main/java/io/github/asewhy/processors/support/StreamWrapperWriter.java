package io.github.asewhy.processors.support;

import io.github.asewhy.processors.support.interfaces.StringWriter;

import java.io.IOException;
import java.io.OutputStream;

public class StreamWrapperWriter implements StringWriter {
    private final OutputStream stream;

    public StreamWrapperWriter(OutputStream stream) {
        this.stream = stream;
    }

    @Override
    public StreamWrapperWriter write(String chars)  {
        try {
            stream.write(chars.getBytes()); return this;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
