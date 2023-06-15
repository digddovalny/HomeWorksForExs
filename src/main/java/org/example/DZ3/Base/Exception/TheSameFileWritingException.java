package org.example.DZ3.Base.Exception;

import java.io.IOException;

public class TheSameFileWritingException extends IOException {
    public TheSameFileWritingException(String message) {
        super("File not found: " + message);
    }
}
