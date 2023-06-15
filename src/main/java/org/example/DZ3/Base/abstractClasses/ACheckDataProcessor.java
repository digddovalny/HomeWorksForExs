package org.example.DZ3.Base.abstractClasses;

import org.example.DZ3.Base.Interfaces.ICheckBirthday;
import org.example.DZ3.Base.Interfaces.ICheckFullName;
import org.example.DZ3.Base.Interfaces.ICheckQuantity;
import org.example.DZ3.Base.Interfaces.ICheckSex;

public abstract class ACheckDataProcessor implements ICheckFullName, ICheckQuantity, ICheckBirthday, ICheckSex {
    protected ACheckQuantity checkQuantity;
    protected ACheckFullName checkFullName;
    protected ACheckData checkBirthday;
    protected ACheckData checkSex;

    public ACheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        this.checkQuantity = checkQuantity;
        this.checkFullName = checkFullName;
        this.checkBirthday = checkBirthday;
        this.checkSex = checkSex;
    }
}
