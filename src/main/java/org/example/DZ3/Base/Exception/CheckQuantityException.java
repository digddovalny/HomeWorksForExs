package org.example.DZ3.Base.Exception;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException() {
        super("Wrong number of elements in the entered data!");
    }
}
