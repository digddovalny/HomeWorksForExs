package org.example.DZ3.Base.Exception;

public class ParseDataToIntegerException extends NumberFormatException{
    public ParseDataToIntegerException(String s) {
        super("Failed to convert string to integer!: " + s);
    }
}
