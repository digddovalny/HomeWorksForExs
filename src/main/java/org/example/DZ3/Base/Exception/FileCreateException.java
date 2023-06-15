package org.example.DZ3.Base.Exception;

import java.io.IOException;

public class FileCreateException extends IOException {
    public FileCreateException(String message) {
        super("File isn't created: " + message);
    }
}
