package org.example.DZ3.Base.Exception;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message) {
        super("Can't create file in CFileCreator: " + message);
    }
}
