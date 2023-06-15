package org.example.DZ3.Base.Exception;

public class FullNameEmptyValueException extends RuntimeException{
    public FullNameEmptyValueException() {
        super("One or more values in the full name are empty!!!");
    }
}