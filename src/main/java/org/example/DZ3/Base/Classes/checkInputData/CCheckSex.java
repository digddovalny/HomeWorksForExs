package org.example.DZ3.Base.Classes.checkInputData;

import org.example.DZ3.Base.abstractClasses.ACheckData;
import org.example.DZ3.Base.Exception.CheckSexException;
import org.example.DZ3.Base.Exception.IncorrectSexValuesException;

public class CCheckSex extends ACheckData {
    @Override
    public boolean checkElement(String data) {
        if (data.equals(""))
            throw new CheckSexException();
        if (!(data.contains("f") || data.contains("m")))
            throw new IncorrectSexValuesException();
        return true;
    }
}