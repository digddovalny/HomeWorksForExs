package org.example.DZ3.Base.Exception;

import java.io.IOException;

public class GetDataException extends IOException {
    public GetDataException(IOException message) {
        super("Exception while reading from console: " + message.getMessage());
    }
}
