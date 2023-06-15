package org.example.DZ3.Base.Exception;

public class GetDataArrayException extends RuntimeException{
    public GetDataArrayException() {
        super("Data array is null. Before getting the data you need to run the parseData method!!!");
    }
}
