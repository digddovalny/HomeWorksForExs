package org.example.DZ3.Base.Exception;

public class FullNameContainsDigitException extends RuntimeException{
    public FullNameContainsDigitException() {
        super("One or more symbol in full name's values are digits!!!");
    }
}
