package org.example.DZ3.Base.Exception;

public class FullNameReadFromDataException extends IndexOutOfBoundsException{
    public FullNameReadFromDataException(String s) {
        super("Parse full name exception: " + s);
    }
}
