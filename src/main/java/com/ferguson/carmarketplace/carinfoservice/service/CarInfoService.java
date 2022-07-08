package com.homeaidepi.carmarketplace.carinfoservice.service;

import com.homeaidepi.carmarketplace.carinfoservice.entities.CarMake;
import com.homeaidepi.carmarketplace.carinfoservice.entities.CarModel;
import com.homeaidepi.carmarketplace.carinfoservice.entities.CarModelType;

import java.util.List;

public interface CarInfoService {
    List<CarMake> getAllCarMakes();
    long getCarMakesCount();
    CarMake getCarMakeById(long id);
    long getCarModelsCount();
    CarModel getCarModelById(long id);
    List<CarModel> getCarModels(String makeName, String typeName);
    List<CarModelType> getCarModelTypes();
}
