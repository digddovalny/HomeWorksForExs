package org.example.DZ3.Base.Exception;

public class BirthdayFormatException extends RuntimeException{
    public BirthdayFormatException() {
        super("Incorrect birthday's format!!!");
    }
}
