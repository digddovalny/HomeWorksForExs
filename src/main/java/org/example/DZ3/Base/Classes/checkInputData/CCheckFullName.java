package org.example.DZ3.Base.Classes.checkInputData;

import org.example.DZ3.Base.abstractClasses.ACheckFullName;
import org.example.DZ3.Base.Exception.FullNameContainsDigitException;
import org.example.DZ3.Base.Exception.FullNameEmptyValueException;

public class CCheckFullName extends ACheckFullName {

    @Override
    public boolean checkFullName(String[] fullName) {

        for (int i = 0; i < fullName.length; i++) {
            if(fullName[i].length()==0)
                throw new FullNameEmptyValueException();
            for (int j = 0; j < fullName[i].length(); j++) {
                if(Character.isDigit(fullName[i].charAt(j)))
                    throw new FullNameContainsDigitException();
            }
        }
        return true;
    }
}
