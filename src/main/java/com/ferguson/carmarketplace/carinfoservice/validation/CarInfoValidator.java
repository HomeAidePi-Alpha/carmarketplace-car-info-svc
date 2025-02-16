package com.homeaidepi.carmarketplace.carinfoservice.validation;

import com.homeaidepi.carmarketplace.carinfoservice.entities.CarModelType;
import com.homeaidepi.carmarketplace.core.entities.CarMakeName;
import com.homeaidepi.carmarketplace.core.exception.InvalidParameterException;

public class CarInfoValidator {

    public CarMakeName validateMakeName(String makeName) {
        CarMakeName name;

        //first check for nulls and blanks
        if (makeName == null || makeName.isBlank()) {
            return null;
        }

        try {
            name = CarMakeName.valueOf(makeName);
        } catch (IllegalArgumentException e) {
            throw new InvalidParameterException(String.format("Invalid make '%s'", makeName));
        }

        return name;
    }

    public CarModelType validateType(String typeName) {
        CarModelType type;

        if (typeName == null || typeName.isBlank()) {
            return null;
        }
        else {
            try {
                type = CarModelType.valueOf(typeName);
            } catch(IllegalArgumentException ex) {
                throw new InvalidParameterException(String.format("type '%s' not found", typeName));
            }
            return type;
        }
    }
        
}
