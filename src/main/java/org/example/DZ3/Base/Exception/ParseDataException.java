package org.example.DZ3.Base.Exception;

public class ParseDataException extends RuntimeException{
    public ParseDataException(String message) {
        super("Exception in the loop, during parsing: " + message);
    }
}
