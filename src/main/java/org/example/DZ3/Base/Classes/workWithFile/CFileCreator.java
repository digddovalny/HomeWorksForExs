package org.example.DZ3.Base.Classes.workWithFile;

import org.example.DZ3.Base.abstractClasses.AFileCreator;
import org.example.DZ3.Base.Exception.FileCreateException;

import java.io.File;
import java.io.IOException;

public class CFileCreator extends AFileCreator {
    /**
     * Создает новый файл по указанному пути.
     * @param path - путь плюс имя файла и расширение.
     * @return - возвращает true в случае удачного создания.
     */
    @Override
    public boolean createFile(String path) throws FileCreateException {
        super.file = new File(path);
        try {
            return super.file.createNewFile();
        }catch (IOException e){
            throw new FileCreateException(e.getMessage());
        }
    }
}
