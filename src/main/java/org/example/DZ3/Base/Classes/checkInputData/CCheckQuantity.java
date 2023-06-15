package org.example.DZ3.Base.Classes.checkInputData;

import org.example.DZ3.Base.abstractClasses.ACheckQuantity;
import org.example.DZ3.Base.Exception.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]) {
        if(data.length!=6)
            throw new CheckQuantityException();
        return true;
    }
}
