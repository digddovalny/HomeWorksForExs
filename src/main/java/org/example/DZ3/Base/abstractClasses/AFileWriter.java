package org.example.DZ3.Base.abstractClasses;

import org.example.DZ3.Base.Classes.workWithFile.CFileCreator;
import org.example.DZ3.Base.Classes.workWithFile.CFindTheSameFileName;
import org.example.DZ3.Base.Interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
