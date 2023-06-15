package org.example.DZ3.Base.Interfaces;

import org.example.DZ3.Base.Exception.FileCreateException;

import java.io.IOException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}
