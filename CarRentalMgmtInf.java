package com;

import java.util.HashMap;
import java.util.HashSet;

public interface CarRentalMgmtInf {
	public int addCar(Car car)throws CarAlreadyExistsException;
	public int addCity (City city)throws CityAlreadyExistsException;
	public HashSet<Car> searchCarDetailsByCityNames(String s);
	public HashMap<String,Double> getTotalIncomeFromCity(String c);
}
