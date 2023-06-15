package org.example.DZ3.Base.Interfaces;

import org.example.DZ3.Base.Exception.MyFileCreateException;
import org.example.DZ3.Base.Exception.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
