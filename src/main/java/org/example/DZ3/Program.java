package org.example.DZ3;

import org.example.DZ3.Base.Classes.Presenter;
import org.example.DZ3.Base.Classes.checkInputData.*;
import org.example.DZ3.Base.Classes.parseData.CDataParseProcessor;
import org.example.DZ3.Base.Classes.ui.CGetData;
import org.example.DZ3.Base.Classes.workWithFile.CFileCreator;
import org.example.DZ3.Base.Classes.workWithFile.CFileWriter;
import org.example.DZ3.Base.Classes.workWithFile.CFindTheSameFileName;


import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "src\\main\\java\\org\\example\\DZ3\\Data\\";
        Presenter presenter = new Presenter(new CGetData(),
                new CDataParseProcessor(),
                new CCheckDataProcessor(new CCheckQuantity(),
                        new CCheckFullName(),
                        new CCheckBirthday(),
                        new CCheckSex()),
                new CFileWriter(new CFileCreator(),
                        new CFindTheSameFileName(),
                        infoPathFolder));
        presenter.run();
    }
}